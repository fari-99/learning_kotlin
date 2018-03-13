
fun main(args:Array<String>){

    // var vs val
    // var -> if you update the value
    // val -> if you not update the value

    val name:String = "test"
    val age:Int = 10
    val dep:String? // it means variable already definite but doesn't have anything
    dep = "Software Engineering"

    println("name : $name")
    println("age : $age")
    println("department : $dep")
}