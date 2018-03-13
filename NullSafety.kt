
fun main(args:Array<String>){

    // this variable must have value
    var value1:String
    value1 = "Value"
    println(value1)


    // this variable maybe have null value
    var value2:String?
    value2 = null
    println(value2)
    value2 = "test"
    println(value2)

    // this value maybe have value, if null throw exception
    var value3:String?
    value3 = "LOL"
    println(value3!!) // !! : not null value
}
