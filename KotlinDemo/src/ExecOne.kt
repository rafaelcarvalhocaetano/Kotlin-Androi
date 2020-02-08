fun main() {
    var x: Number = 10;
    var y: Number = 20;

    println("Number X : $x");
    println("Number Y : $y");

    x = y;
    y = 10;
    println("New Number X : $x");
    println("New Number Y : $y");
}