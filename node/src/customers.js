import Router from './router.js'

import * as customerService from './handlers.js';

class Customers extends Router {

  constructor() {
    super();
    this._customers_service = customerService;
  }

  _init_router() {
    this._router.get('/', async (req, res, next) => {
      try {
        this._logger(async () => {
          const result = await this._customers_service.get_customers();
          res.json(result);
        });
      } catch (err) {
        console.error(err);
        res.status(500).send("Error fetching listings!");
      }
    });

    this._router.get('/stream', async (req, res) => {
      try {
        this._logger(async () => {
          const result = await this._customers_service.get_customers_cursor((result) => {
            res.json(result);
          });
        });
      } catch (err) {
        console.error(err);
        res.status(500).send("Error fetching listings!");
      }
    });

    this._router.post('/', async (req, res, next) => {
      if (await this._customers_service.insert(req.body)) {
        return res.send('ok');
      }
      res.status(500).send();
    });

  }

  _logger(cb) {
    if (!!process.env.EXECUTION_DEBUG) {
      console.time("DB");
      const result = cb();
      console.timeEnd("DB");
      return result;
    }
    return cb();
  }
}

export default new Customers().router;