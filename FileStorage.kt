import java.io.FileReader
import java.io.FileWriter

fun main(args:Array<String>){
    writeToFile("test")
    readFile("test.txt")
}

fun writeToFile(gen_param:String){
    try {
        var fo = FileWriter("test.txt", true)
        fo.write(gen_param + "\n")
        fo.close()
    }
    catch (Ex:Exception){
        println("Can't write to file")
        println(Ex.message)
    }
}

fun readFile(file_name:String){
    try {
        var files = FileReader(file_name)
        files.forEachLine {
            println(it)
        }
    }
    catch (Ex:Exception){

    }
}