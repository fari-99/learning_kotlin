
/**
 * Try catch
 * Try : process all code in the block code, if there is Exception Thrown from the code it will not break the process
 * Catch : if there is Exception thrown from TRY block code, and then process catch block code
 */
fun main(args:Array<String>){

    try {
        // block code
        val number:Int = readLine()!!.toInt()
        val div:Int = 100/number
        println(div)
    }catch (execption:Exception){
        // block code
        println(execption.message)
    }

    // without try catch
//    val number:Int = readLine()!!.toInt()
//    val div:Int = 100/number
//    println(div)

    println("process done")
}