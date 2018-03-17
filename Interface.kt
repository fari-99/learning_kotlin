
interface DefaultOperation{
    fun defaultImplementation(){
        println("This is default code if implementation not set")
    }

    fun sum(n1:Int, n2:Int):Int
    fun sub(n1:Int, n2:Int):Int
}

class ImplementationInterface:DefaultOperation{
    override fun sum(n1: Int, n2: Int): Int {
        return n1+n2
    }

    override fun sub(n1: Int, n2: Int): Int {
        return n1-n2
    }
}

fun main(args:Array<String>){
    var test_implementation = ImplementationInterface()
    test_implementation.defaultImplementation()
    println(test_implementation.sum(1,2))
    println(test_implementation.sub(2,1))
}