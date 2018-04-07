
/**
 * This is standard function for checking maximum 2 value int
 */
fun maxStandard(number1:Int, number2:Int):Int{
    if(number1 > number2){
        return number1
    }
    else{
        return number2
    }
}

/**
 * This is example 1 for consive from standard function
 */
fun maxConsive1(number1: Int, number2: Int):Int =
        if(number1 > number2){
            number1
        }
        else{
            number2
        }

/**
 * Careful here, because we doesn't declare what the type for this return function,
 * if you make 2 type of return, and it will be used for many thing, then sometimes you will get error,
 * because you already declare the type of the variable so you must make the type of variable any too.
 */
fun maxConsive2(number1: Int, number2: Int) =
        if(number1 > number2){
            number1
        }
        else{
            number2
        }

fun maxConsive2Test1(number1: Int, string: String, type:Boolean):Any =
        if(type){
            number1
        }
        else{
            string
        }

fun main(args:Array<String>){
    val number1:Int = 1
    val number2:Int = 2

    println(maxStandard(number1,number2))
    println(maxConsive1(number1,number2))
    println(maxConsive2(number1,number2))

    val test:Int = maxConsive2(number1,number2)
    println(test)

//    val test1:Int = maxConsive2Test1(number1,number2 = "Test Here", type = true) // error because type mismatch
    val test1 = maxConsive2Test1(number1,string = "Test Here", type = true)
    val test2 = maxConsive2Test1(number1,string = "Test Here", type = false)
    println(test1)
    println(test2)
}