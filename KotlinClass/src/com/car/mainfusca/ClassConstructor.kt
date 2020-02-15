package com.car.mainfusca

import com.car.mainfusca.InitializeClass as InitializeClass1

class ClassConstructor {

  var type: String ?= null;
  var model: String ?= null;
  var price: Double ?= null;
  var milesDrive: Int ?= null;

  constructor(type: String, model: String, price: Double, milesDrive: Int) {
    this.type = type;
    this.model = model;
    this.price = price;
    this.milesDrive = milesDrive;
  }

  constructor(type: String, model: String, price: Double) {
    this.type = type;
    this.model = model;
    this.price = price;
  }

  override fun toString(): String {
    return super.toString()
  }
}

fun main(args: Array<String>) {
  val listOfCard = arrayListOf<ClassConstructor>();

  listOfCard.add(ClassConstructor("1", "data",12.3, 2));
  listOfCard.add(ClassConstructor("1", "data",12.3, 2));
  listOfCard.add(ClassConstructor("1", "data",12.3, 2));
  listOfCard.add(ClassConstructor("1", "data",12.3, 2));

  listOfCard.forEach { x -> println("Valor atual ${x.type}") }
}