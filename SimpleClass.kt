/**
 * Simple Class Example
 */
class Car(name:String, year:Int, mileAge:Int){
    var name:String?=null
    var year:Int?=null
    var mileAge:Int?=null
    var init_data:String?=null

    init {
        this.init_data = "This is init data ** car **"
        println(this.init_data)

        this.name = name
        this.year = year
        this.mileAge = mileAge
    }

    fun display():Unit{
        println("This is function display ** car **")
        println("car name : $name")
        println("car year : $year")
        println("car mileAge : $mileAge")
    }
}

/**
 * Class Init and Constructor Example
 */
open class Person(){
    var name_person:String?=null
    var age_person:Int?=null
    var height_person:Double?=null
    var init_data:String?=null
    var construct_data:String?=null

    init {
        this.init_data = "This is init data ** person **"
        println(this.init_data)
    }

    constructor(name:String, age:Int, height:Double):this(){
        this.construct_data = "This is construct data ** person **"
        this.name_person = name
        this.age_person = age
        this.height_person = height
        println(this.construct_data)
    }

    constructor(name:String):this(){
        this.construct_data = "This is construct data 2 ** person **"
        this.name_person = name
        println(this.construct_data)
    }

    fun display():Unit{
        println("This is function display ** person **")
        println("name : " + this.name_person)
        println("age : " + this.age_person)
        println("height : " + this.height_person)
        println(this.init_data)
        println(this.construct_data)
    }
}

/**
 * Inner And Nested Class
 * (Class in the class)
 */
class Outer{
    private var private_variable_outer = "this is outer class private variable"

    fun show(){
        println(private_variable_outer)
    }

    class NestedClass{
        private var private_variable = "this is nested class private variable"

        fun show(){
            println(this.private_variable)
//            println(private_variable_outer) // can't access it
        }
    }

    inner class InnerClass{
        private var private_variable = "this is inner nested class private variable"

        fun show(){
            println(this.private_variable)
            println(private_variable_outer) // can access it
        }
    }
}

fun main(args:Array<String>){

    // create new instance class
    var newPerson = Person("test_person", 20, 192.2)
    var newPerson2 = Person("test_person2")
    var car = Car("test_car", 2018, 1)

    // accessing variable on class
    println("print person name : " + newPerson.name_person)
    newPerson.name_person = "change_name"
    println("print person name : " + newPerson.name_person)
    println("print car name : " + car.name)
    car.name = "change_car_name"
    println("print car name : " + car.name)

    // accessing function on class
    newPerson.display()
    newPerson2.display()
    car.display()

    // testing inner and nested class
    var outer_class = Outer()
    var nested_class = Outer.NestedClass()
    var inner_class = outer_class.InnerClass()

    outer_class.show()
    nested_class.show()
    inner_class.show()

}