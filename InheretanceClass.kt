open class Operations(){
    public var public_variable:String = "This is public variable 1"
    protected var protected_variable:String = "This is protected variable 1"
    private var private_variable:String = "This is private variable 1"

    open var override_variable = "This is parent variable"

    open fun overrideFunction(){
        println("This is parent function")
    }

    fun sum(n1:Int, n2:Int):Int{
        return n1+n2
    }

    fun sub(n1:Int, n2:Int):Int{
        return  n1-n2
    }

    fun getPrivateVariable():String{
        return this.private_variable
    }

    fun getProtectedVariable():String{
        return this.protected_variable
    }

    open fun castingFunction(){
        println("This is parent function test casting")
    }

    public fun publicFunction():Unit{
        this.protectedFunction()
        this.privateFunction()
        println("This is public function 1")
    }

    protected fun protectedFunction():Unit{
        println("This is public function 1")
    }

    private fun privateFunction():Unit{
        println("This is private function 1")
    }
}

class CastingFunction(): Operations(){
    override fun castingFunction(){
        println("This is casting child function")
    }

    fun notOnCastingFunction(){
        println("This function can't be accessed with casting")
    }
}

open class MultiOperations(): Operations(){
    // public var public_variable:String = "This is public variable 2" // can't have the same variable, because parent already have
    // protected var protected_variable:String = "This is protected variable 2" // can't have the same variable, because parent already have
    private var private_variable_2:String = "This is private variable 2"
    public var public_variable_2:String = "This is public variable 2"
    protected var protected_variable_2:String = "This is protected variable 2"

    override var override_variable:String = "this is override child variable"

    override fun overrideFunction(){
        println("This is override child function")
    }

    fun mul(n1:Int, n2:Int):Int{
        return n1*n2
    }

    fun div(n1:Int, n2:Int):Int{
        return n1/n2
    }

    fun getChildPrivateVariable():String{
        return this.private_variable_2
    }

    fun getChildProtectedVariable():String{
        return this.protected_variable_2
    }

    public fun publicChildFunction():Unit{
        this.protectedChildFunction()
        this.privateChildFunction()
        println("This is public function 2")
    }

    public fun accessingParent():Unit{
        println("variable parent public : " + this.public_variable)
        println("variable parent protected : " + this.protected_variable)
        super.publicFunction()
        super.protectedFunction()
    }

    protected fun protectedChildFunction():Unit{
        println("This is public function 2")
    }

    private fun privateChildFunction():Unit{
        println("This is private function 2")
    }
}

class AnotherOperations(): MultiOperations(){
    fun sqr(n1: Int):Double{
        return Math.sqrt(n1.toDouble())
    }

    fun exp(n1: Int):Int{
        return Math.getExponent(n1.toDouble())
    }
}

fun main(args:Array<String>){

    val n1:Int = 100
    val n2:Int = 50

    /**
     * Parent operation only have 2 function
     * Note : Parent can't access function or variable on child class
     */
    var parent_function = Operations()
    println("sum : " + parent_function.sum(n1,n2))
    println("sub : " + parent_function.sub(n1,n2))

    /**
     * Child operation have 2 function + all public function on parent have
     */
    var child_function = MultiOperations()
    println("sum : " + child_function.sum(n1, n2))
    println("sub : " + child_function.sub(n1, n2))
    println("mul : " + child_function.mul(n1, n2))
    println("div : " + child_function.div(n1, n2))

    /**
     * Example when the parent have inheritance form another class
     */
    var child_child_function = AnotherOperations()
    println("sum : " + child_child_function.sum(n1, n2))
    println("sub : " + child_child_function.sub(n1, n2))
    println("mul : " + child_child_function.mul(n1, n2))
    println("div : " + child_child_function.div(n1, n2))
    println("sqrt : " + child_child_function.sqr(n1))
    println("exp : " + child_child_function.exp(n1))

    /**
     * Visibility using public, protected and private
     * public : Can be accessed in and out class itself, and can be accessed in the child class
     * protected : Can't be accessed out of the class itself, but can be accessed in class itself and child class
     * private : Can only be accessed within the class itself
     *
     * Note:
     * if you want to access protected or private variable, please create function to get/set that variable
     */
    var testParent_visibility = Operations()
    println(testParent_visibility.public_variable)
    println(testParent_visibility.getProtectedVariable())
    println(testParent_visibility.getPrivateVariable())
    testParent_visibility.publicFunction()

    var testChild_visibility = MultiOperations()
    println(testChild_visibility.public_variable)
    println(testChild_visibility.public_variable_2)
    println(testChild_visibility.getProtectedVariable())
    println(testChild_visibility.getPrivateVariable())
    println(testChild_visibility.getChildProtectedVariable())
    println(testChild_visibility.getChildPrivateVariable())
    testChild_visibility.publicFunction()
    testChild_visibility.publicChildFunction()
    testChild_visibility.accessingParent()

    /**
     * Override
     * override can be used for function and variable
     * but you need to add "open" in front of the function or variable
     */
    var override_parent = Operations()
    println(override_parent.override_variable)
    override_parent.overrideFunction()

    var override_child = MultiOperations()
    println(override_child.override_variable)
    override_child.overrideFunction()

    /**
     * Casting
     * Casting is when you want to override the function on parent function
     * but you doesn't need another function on your class
     */

    var test_casting = CastingFunction() as Operations
    parent_function.castingFunction()
    test_casting.castingFunction()
}