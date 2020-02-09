fun add(v: Int, vv: Int): Int {
    return v + vv;
}
fun  add(v: Int, vv: Int, vvv: Int): Int {
    return v + vv + vvv;

}



fun main() {

    val number = add(2, 4);
    val numberTwo = add(4, 3, 2);

    println(number);
    println(numberTwo);
}