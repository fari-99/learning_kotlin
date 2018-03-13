/**
 * Math Calculator
 */
fun main(args:Array<String>){
    var value:Int = 5 // 0101
    var value2:Int = 10 // 1010

    // Bit manipulation
    println(value.shl(1)) // 10 || 01010
    println(value.shr(1)) // 2 || 010
    println(value.ushr(1)) // 2 || 010
    println(value.and(value2)) // 0 || 0
    println(value.or(value2)) // 15 || 1111
    println(value.xor(value2)) // 15 || 1111
    println(value.inv()) // -6 || 1010

    // Comparison
    println(value == value2) // false
    println(value != value2) // true
    println(value < value2) // true
    println(value > value2) // false
    println(value <= value2) // true
    println(value >= value2) // false
}