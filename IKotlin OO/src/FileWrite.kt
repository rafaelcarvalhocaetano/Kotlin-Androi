import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

fun main(args: Array<String>) {
    println("1 - read \n 2 - write \n");
    var op = readLine()!!.toInt();

    when(op) {
        1 -> {
            println("Digite o Nome do Arquivo");
            var arq = readLine().toString();
            ReadFromFile(arq);
        };
        2 -> {
            println("Digite o Nome do Arquivo");
            var arq = readLine().toString();
            println("Text Here");
            var text = readLine().toString();
            WriteToFile(arq,text);
        }
    }
}

fun WriteToFile(nameArq: String, str: String) {

    try {
        var fo = FileWriter( nameArq + ".txt");
        fo.write(str);
        fo.close();
    }catch (e: Exception) {
        println("Erro " + e.message);
    }
}

fun ReadFromFile(arq: String) {
    try {
        var find = FileReader(arq + ".txt");
        print(find.read());
    }catch (e: Exception) {
        println(e.message);
    }
}