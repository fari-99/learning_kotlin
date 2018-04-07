

fun main(args:Array<String>){
    /**
     * Lambda Expression
     * functions that are not declared, but passed immediately as an expression
     *
     * HOF (Higher Order Function)
     * A higher-order function is a function that takes functions as parameters, or returns a function
     *
     * A function declared using fun() or {}
     */


    // print hello world
    val printHelloWorld = {
        println("hello, world!")
    }

    printHelloWorld.invoke()

    // get parameter or multiple parameter
    val sayHello = { user:String ->
        println("hello, $user")
    }

    val getTotal = { user:String, total:Int ->
        println("$user have $total apple")
    }

    sayHello("fadhlan")
    getTotal("fadhlan", 10)

    val fruits = arrayOf("Orange", "Pineapple", "Watermelon", "Apple")
    fruits.sortedBy {
        name:String -> name.length
    }

    val max = { number1:Int, number2:Int ->
        if(number1 > number2){
            number1
        }
        else{
            number2
        }
    }
    println(max(10,4))

    val testReturnAtLabel = stopHere@ { stopHere:Boolean ->
        println("i'm here 1")
        if(stopHere){
            println("i'm stopped here 1")
            return@stopHere // shouldn't be whitespace between return and @
        }
        println("i'm here 2")
    }

    testReturnAtLabel(true)
    testReturnAtLabel(false)

    /**
     * Type function
     */
    val fun1:()->Unit = {
        println("hello, world")
    }
    fun1()

    val fun2:(Int, Int) -> Int = {
        a,b -> Math.max(a,b)
    }
    println(fun2(10,4))

    // Higher order function example, using a function as parameter
    val fun3:(Int, Int, (Int, Int) -> Int) -> Int = {
        value_a, value_b, func -> func(value_a, value_b)
    }
    println(fun3(10,4,fun2))
}