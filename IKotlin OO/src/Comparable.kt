import java.util.*
import kotlin.collections.ArrayList

class Person(var naem: String, var age: Int): Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return this.age - other.age;
    }
}

fun main(args: Array<String>) {

    var listOfNames = ArrayList<String>();
    for (i in 1..10) {
        listOfNames.add("Rafael" + i);
    }
    for (name in listOfNames) {
        println("Seu nome é : " + name);
    }

    println("After Sort");
    Collections.sort(listOfNames);
    for (name in listOfNames) {
        println("Seu nome é : " + name);
    }
}