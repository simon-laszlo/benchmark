
import express from "express";

import customers from "./customers.js";
import * as mongo from "./db.js";

const app = express();
const port = process.env.PORT || 8080;


app.disable('x-powered-by');
app.set('etag', false);
app.use(express.json());

app.use(function (req, res, next) {
  res.removeHeader("x-powered-by");
  res.removeHeader("set-cookie");

  res.removeHeader("Connection");
  res.removeHeader("Vary");
  next();
});


(async () => {

  try {
    await mongo.connectToServer();
  } catch (err) {
    console.error(err);
    process.exit(1);
  }

  app.use("/customers", customers);

  app.listen(port, () => {
    console.log(`Example app listening on port ${port}`)
  })
})();