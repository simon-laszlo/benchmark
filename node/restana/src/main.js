import restana from 'restana';
import bodyParser from 'body-parser';
import * as mongo from "./db.js";
import {get_customers, insert} from './handlers.js'

const service = restana()
service.use(bodyParser.json())

service.get('/customers', (req, res) => res.send(get_customers()));
service.post('/customers', (req, res) => {
  insert(req.body);
  res.send("ok");
});

(async () => {

  try {
    await mongo.connectToServer();
  } catch (err) {
    console.error(err);
    process.exit(1);
  }

  service.start(3000);
})();