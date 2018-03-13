
fun main(args:Array<String>){
    var strText:String      = "Hello World, Welcome to Kotlin Language Programming"
    val cprStrText1:String  = "Hello World, Welcome to Kotlin Language Programming"
    val cprStrText2:String  = "Hello World, Welcome"
    val cprStrText3:String  = "Hello World, Welcome to Kotlin Language Programming!!"
    val cprStrText4:String  = "This is not the same sentence!!"
    val blank:String = "                    "
    val emptyStr:String = ""

    // Length string
    println("Text Length : " + strText.length) // 51

    // Compare String
    println("Compare String : " + strText.compareTo(cprStrText1)) // 0
    println("Compare String : " + strText.compareTo(cprStrText2)) // 31
    println("Compare String : " + strText.compareTo(cprStrText3)) // -2
    println("Compare String : " + strText.compareTo(cprStrText4)) // -12
    println("Compare Equal : " + strText.equals(cprStrText1)) // true
    println("Compare Equal : " + strText.equals(cprStrText2)) // false
    println("Compare Equal : " + strText.equals(cprStrText3)) // false
    println("Compare Equal : " + strText.equals(cprStrText4)) // false

    // Get Index
    println("Get Second Char : " + strText[1]) // e
    println("Get Second Char : " + strText.get(1)) // e

    // Get Range String
    println("Range String : " + strText.indices) // 0..50
    println("Last Range Index String : " + strText.lastIndex) // 50

    println("Returns the largest character : " + strText.max()) // u
    println("Returns the smallest character : " + strText.min()) // " " (space)
    println("Returns first character : " + strText.first()) // H
    println("Returns the first character, or `null` : " + strText.firstOrNull()) // H
    println("Returns the last character : " + strText.last()) // g
    println("Returns the last character, or `null` : " + strText.lastOrNull()) // g

    // String Manipulation
    println("Lower case first char : " + strText.decapitalize()) // hello World, Welcome to Kotlin Language Programming
    println("Delete from front 13 char : " +strText.drop(13)) // Welcome to Kotlin Language Programming
    println("Delete from back 40 char : " +strText.dropLast(40)) // Hello World
    println("Delete char range 0-13 : " +strText.removeRange(5,20)) // Hello to Kotlin Language Programming
    println("Reverse String : " +strText.reversed()) // gnimmargorP egaugnaL niltoK ot emocleW ,dlroW olleH
    println("Repeat string 2 times : " +strText.repeat(2)) // Hello World, Welcome to Kotlin Language ProgrammingHello World, Welcome to Kotlin Language Programming
    println("Replace `Hello` int `Olla` : " + strText.replace("Hello", "Olla")) // Olla World, Welcome to Kotlin Language Programming

    // Check String
    println("is Contains `Hello` : " + strText.contains("Hello")) // true
    println("is blank : " + blank.isBlank()) // true
    println("is empty : " + emptyStr.isEmpty()) // true
    println("is not blank : " + blank.isNotBlank()) // false
    println("is not empty : " + emptyStr.isNotEmpty()) // false
    println("is null or blank : " + blank.isNullOrBlank()) // true
    println("is null or empty : " + emptyStr.isNullOrEmpty()) // true
}