import * as mongo from "./db.js";

export const get_customers = () => {
  return mongo.getDb().collection("customers")
    .find({}, {
      projection: {
        _id: 0
      }
    })
    .toArray();
};

export const get_customers_cursor = async (cb) => {
    const cursor = await mongo.getDb().collection("customers")
    .find({}, {
      projection: {
        _id: 0
      }
    })
    .stream();
    const result = [];
    cursor.on('data', (data) => result.push(data));
    cursor.on('end', () => {
      cb(result);
    });
};

export const insert = async (customer) => {
  try {
    await mongo.getDb()
      .collection("customers")
      .insertOne(customer)
    return true;
  } catch (err) {
    console.error(err);
    return false;
  }
};