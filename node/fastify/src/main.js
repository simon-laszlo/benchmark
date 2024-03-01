import fastify from 'fastify';
import * as mongo from "./db.js";
import {get_customers, insert} from './handlers.js'

const fastifyInst = fastify();

fastifyInst.get('/customers', async (request, reply) => {
  return await get_customers();
})

fastifyInst.post('/customers', async (request, reply) => {
  await insert(request.body);
  return "ok"
})

// Run the server!
const start = async () => {
  (async () => {

    try {
      await mongo.connectToServer();
    } catch (err) {
      console.error(err);
      process.exit(1);
    }
      try {
        await fastifyInst.listen({ port: 8080 })
      } catch (err) {
        fastifyInst.log.error(err)
        process.exit(1)
      }
    })();
}
start()