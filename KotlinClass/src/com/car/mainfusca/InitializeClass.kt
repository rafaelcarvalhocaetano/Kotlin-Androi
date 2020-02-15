package com.car.mainfusca

open class InitializeClass {

  var name: String ?= null;


  constructor(name: String) {
    this.name = name;
  }

  fun initName(data: String) {
    if (data.length <= 5) {
      println("Menor que o permitido ");
    } else {
      println("Valor é ${this.name}");
      this.name = data;
    }
  }
}