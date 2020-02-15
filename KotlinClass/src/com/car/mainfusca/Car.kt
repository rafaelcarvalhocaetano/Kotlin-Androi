package com.car.mainfusca

class Car (var dataValue: Double, name: String) {
  init {
    println("type")
  }

  fun getType(): Double {
    val price = dataValue - 12.5;
    return price;
  }
}

class Card(var typeCard: String, val data: Int) {
  init {
    println(typeCard)
  }
}


fun main(args: Array<String>) {
  val card = Card("Value type Card", 123);
  println(card.data);

  val listOfCard = arrayListOf<Card>();

  listOfCard.add(Card("Tipo 1", 1));
  listOfCard.add(Card("Tipo 2", 2));
  listOfCard.add(Card("Tipo 3", 3));
  listOfCard.add(Card("Tipo 4", 4));
  listOfCard.add(Card("Tipo 5", 5));

  listOfCard.forEach { x -> println("Valor da list de cards ${x.data} & ${x.typeCard}") }

}