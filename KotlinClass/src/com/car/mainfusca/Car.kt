package com.car.mainfusca

class Car (val type: String) {

  init {
    println(type)
  }
}


fun main() {
  val car = Car("Value");
}