import {
  MongoClient
} from "mongodb";

const uri = process.env.MONGO_URL || "mongodb://localhost:27017";
const client = new MongoClient(uri);

let _connection;

const connectToServer = async () => {
  await client.connect();
  _connection = client.db("mydb");
};

const getDb = () => {
  return _connection;
};

export {
  connectToServer,
  getDb
};
