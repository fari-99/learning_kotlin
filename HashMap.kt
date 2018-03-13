
fun main(args:Array<String>){
    /**
     * HashMap
     * hash table based implementation of the MutableMap interface
     */

    var hashMapData = HashMap<Int,String>()
    hashMapData.put(1,"Test 1")
    hashMapData.put(2,"Test 2")
    hashMapData.put(3,"Test 3")
    hashMapData.put(4,"Test 4")
    hashMapData[5] = "Test 5"

    println(hashMapData) // {1=Test 1, 2=Test 2, 3=Test 3, 4=Test 4, 5=Test 5}
    println(hashMapData.entries) // [1=Test 1, 2=Test 2, 3=Test 3, 4=Test 4, 5=Test 5]
    println(hashMapData.size) // 5
    println(hashMapData.keys) // [1, 2, 3, 4, 5]
    println(hashMapData.values) // [Test 1, Test 2, Test 3, Test 4, Test 5]
    println(hashMapData.containsKey(1)) // true
    println(hashMapData.containsValue("Test 5")) // true

    println("***** Print All value using keys *****")
    for (index in hashMapData.keys){
        println(hashMapData.get(index))
    }

    println("***** Print All value using values *****")
    for (value in hashMapData.values){
        println(value)
    }

    println("***** Update data *****")
    hashMapData.put(3,"Change Value")
    println(hashMapData.values) // [Test 1, Test 2, Change Value, Test 4, Test 5]

    println("***** Remove Some Data *****")
    hashMapData.remove(3)
    println(hashMapData.values) // [Test 1, Test 2, Test 4, Test 5]

    println("***** Clear Data *****")
    hashMapData.clear()
    println(hashMapData.values) // []
}