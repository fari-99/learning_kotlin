
class SimpleSingleton{
    var name:String?=null

    constructor(){
        println("instance is created")
    }
}

class LazySingleton{
    var name:String?=null

    private constructor(){
        println("instance is created")
    }

    companion object {
        val instance:LazySingleton by lazy { LazySingleton() }
    }
}

object ObjectSingleton{
    var name:String?=null
    init {
        println("instance is created")
    }
}

fun main(args:Array<String>){

    /**
     * Simple singleton where you create instance
     */
    var simpleSingleton1 = SimpleSingleton()
    simpleSingleton1.name = "Test 1"
    println(simpleSingleton1.name) // Test 1

    var simpleSingleton2 = SimpleSingleton()
    println(simpleSingleton2.name) // null

    /**
     * Singleton using lazy
     * lazy is checking if the instance already created, and return it
     * it's like making a duplicate object
     */
    var lazySingleton1 = LazySingleton.instance
    lazySingleton1.name = "Test 1"
    println(lazySingleton1.name) // Test 1

    var lazySingleton2 = LazySingleton.instance
    println(lazySingleton2.name) // Test 1

    /**
     * Singleton using object declaration
     * https://github.com/dbacinski/Design-Patterns-In-Kotlin/blob/master/src/main/kotlin/Singleton.kt
     */
    var objectSingleton1 = ObjectSingleton
    objectSingleton1.name = "Test 1"
    println(objectSingleton1.name)

    var objectSingleton2 = ObjectSingleton
    println(objectSingleton2.name)

}