/**
 * Example Extension
 * Creating function swap for array list because swap doesn't exist on ArrayList
 */
fun ArrayList<String>.swap(index1:Int,index2: Int){
    var temp_index1 = this.get(index1)
    this.set(index1, this.get(index2))
    this.set(index2, temp_index1)
}

fun main(args:Array<String>){
    var arr = ArrayList<String>()
    arr.add("Hello")
    arr.add("World")
    arr.add("123!!")
    println(arr) // [Hello, World, 123!!]

    arr.swap(1,2) // swap is an extension function, because swap function doesn't exist on ArrayList
    println(arr) // [Hello, 123!!, World]
}