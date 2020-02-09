fun main() {
    var isFlag = true;
    val GPA = 4.0;
//    TERNARIO
    val isQualified = if (isFlag && GPA >= 3.8) 1 else 0

    println(isQualified);

    val isGood = when(GPA) {
        4.0 -> true
        else -> false
    }

    println(isGood);
}