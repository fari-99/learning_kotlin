
fun main(args:Array<String>){
    print("Enter Input : ")
    var input = readLine()
    println("Input : $input")

    val name:String?
    val age:Int?
    val dep:String?

    print("Enter Name : ")
    name = readLine().toString()

    print("Enter Age : ")
    age = readLine()!!.toInt() // adding toInt function because variable already got specific data type

    print("Enter Department : ")
    dep = readLine().toString()

    println("***** output *****")
    println("Name : $name")
    println("Age : $age")
    println("Department : $dep")
}