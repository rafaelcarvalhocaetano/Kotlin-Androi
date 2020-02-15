package com.car.mainfusca

open class Truck () {
  var type: String?= null;
  var model: String?= null;

  constructor(type: String, model: String): this() {
    this.type = type;
    this.model = model;
  }
}