
fun main(args:Array<String>){
    println("Example using hashMapOf")
    var map = hashMapOf(1 to "Test 1", 2 to "Test 2")
    map.put(3, "Test 3")
    println(map.get(3))
    println(map[3])

    println("print all map value")
    for (index in map.keys){
        println(map[index])
    }

    println("Example using arrayOf")
    var arr = arrayOf(1,2,3,4)
    println(arr.get(1))
    println(arr[1])

    println("print all array value")
    for (index in arr.indices){
        println(arr[index])
    }

    println("Example using mutableListOf")
    var list = mutableListOf(1,2,3,4)
    println(list.get(1))
    println(list[1])

    println("print all list value")
    for (index in list.indices){
        println(list[index])
    }

    println("Example using setOf and mutableSetOf")
    /**
     * setOf, variable using setOf can't be add more element to it
     * mutableSetOf, variable using mutableSetOf can be add more element to it
     *
     * notes: if you add element that already exists, it will not add to the variable
     */
    println("Using setOf")
    var test_SetOf = setOf(1,2,3,4,55,55)
    // test_SetOf.add(77) // not work because there is no extension for this
    for (value in test_SetOf){
        println(value)
    }

    println("Using mutableSetOf")
    var test_mutableSetOf = mutableSetOf(1,2,3,4,55,55)
    test_mutableSetOf.add(77)
    for (value in test_mutableSetOf){
        println(value)
    }
}