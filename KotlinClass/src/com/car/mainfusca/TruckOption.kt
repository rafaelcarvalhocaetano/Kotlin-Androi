package com.car.mainfusca

class TruckOption: Truck {
//  var type: String?= null;
//  var model: String?= null;
  var data: String?= null;

  constructor(type: String, model: String, data: String): super(type, model) {
//    this.type = type;
//    this.model = model;
    this.data = data;
  }
}