
/**
 *  This AND Super
 *  you can access function or variable on the class itself with THIS
 *  you can access funciton or variable on Parent Class with SUPER
 *
 *  Note:
 *  all inheritance rules is applied too, so careful when accessing variable and function
 */
open class SuperClassTest(){
    protected var super_variable_protected:String = "This is super protected variable"

    fun getProtectedFunction(){
        println(this.super_variable_protected)
    }
}

open class ChildClassTest(): SuperClassTest(){
    protected var local_variable_protected:String = "This is local protected variable"

    fun getProtectedParentFunction(){
        println(super.super_variable_protected)
    }

    fun getLocalVariableFunction(){
        println(this.local_variable_protected)
    }
}

fun main(args:Array<String>){
    var super_class = SuperClassTest()
    var child_class = ChildClassTest()

    child_class.getProtectedParentFunction()
    super_class.getProtectedFunction()

    child_class.getLocalVariableFunction()
}