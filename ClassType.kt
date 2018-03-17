/**
 * Abstract Function And Class Example
 */
abstract class AbstractClass(){
    fun getFunction():Unit{
        println("This is function on abstract class")
    }

    abstract fun abstractFunction():Unit
}

class ChildAbstractClass():AbstractClass(){
    fun getAbstractFunction(){
        getFunction()
    }

    override fun abstractFunction() {
        println("This is override for abstract function")
    }
}

/**
 * Enum Class Example
 */
enum class EnumClassExample{
    NORTH, SOUTH, EAST, WEST
}

/**
 * Generic Class Example
 */
class GenericClassTest<T>(gen_param:T){
    init {
        println(gen_param)
    }
}

/**
 * Bonus
 * Generic Function
 */
fun <T> GenericFunction(gen_param:T){
    println(gen_param)
}

fun main(args:Array<String>){
    /**
     * Test Abstract Class
     */
    var test_abstract_class = ChildAbstractClass()
    test_abstract_class.getAbstractFunction()
    test_abstract_class.abstractFunction()

    /**
     * Test Enum Class
     */
    println(EnumClassExample.EAST)

    /**
     * Test Generic Class
     */
    var generic_test1 = GenericClassTest<String>("Test")
    var generic_test2 = GenericClassTest<Int>(12)
    var generic_test3 = GenericClassTest<Double>(12.2)

    /**
     * Test Generic Function
     */
    var generic_func1 = GenericFunction<String>("Test")
    var generic_func2 = GenericFunction<Int>(1)
    var generic_func3 = GenericFunction(12.3)
}
