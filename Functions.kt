/**
 * Function example
 * ** with return value
 * fun function_name(parameter_name:data_type, ..):return_data_type{
 *      // block code
 *      return value
 * }
 * note :
 * .. : another parameter
 *
 *
 * ** without return value
 * fun function_name(parameter_name:data_type, ..):Unit{
 *      // block code
 * }
 * note :
 * .. : another parameter
 *
 * ** without parameter
 * fun function_name():return_data_type{
 *      // block code
 *      return value
 * }
 *
 * Function Overload
 * when there is a function have the same name, but have total different parameter
 * *ex: there is 2 sum function, but have different parameter
 *
 * Polymorphism
 * when there is a function have the same name and have the same total parameter, but have different parameter:data_type
 * ex: there is 2 display function, but have different parameter data type
 *
 * Global and local variable
 * Global variable is variable out from any function, you can access it anywhere
 * Local variable is variable in function block, you can only access on it function it self
 */

var global_variable = "THIS IS GLOBAL VARIABLE"

fun sum(n1:Double, n2:Double):Double{
    return n1+n2
}

fun sum(n1:Double, n2:Double, n3:Double):Double{
    return n1+n2+n3
}

fun disp(n:Double):Unit{
    var local_variable = "Local variable in function disp1"
    println("number : $n")
    println(local_variable)
}

fun disp(name:String):Unit{
    var local_variable = "Local variable in function disp2"
    println("name : $name")
    println(local_variable)
}

fun disp():Unit{
    var local_variable = "Local variable in function disp3"
    println(local_variable)
    println(global_variable)
}

fun main(args:Array<String>){
    var local_variable = "Local variable in function main"
    val n1 = 10.0
    val n2 = 12.0
    val n3 = 14.0
    val name = "Test"

    disp(sum(n1,n2))

    println("Overload function example")
    disp(sum(n1,n2))
    disp(sum(n1,n2,n3))

    println("Polymorphism")
    disp(n1)
    disp(name)

    println("Example local and global variable")
    println(local_variable)
    println(global_variable)
    disp() // print global and local variable
}