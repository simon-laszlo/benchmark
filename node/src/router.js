import express from 'express';

export default class Router {

  constructor() {
    this._router = express.Router();
    this._init_router();
  }

  _init_router() {
    throw "Abstract method _init_router not implemented"    
  }

  get router() {
    return this._router;
  }
}
