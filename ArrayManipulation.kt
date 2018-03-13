
fun main(args:Array<String>){
    /**
     * Array is created by defined the size when it's created
     * if you init with emptyArray it will remain empty
     * if you want to add element when the array empty, please use ArrayList instead
     */

    val size:Int = 5
    var arrayString = Array<String>(size){"test"} // create array with all 0 values
    var nullArray = arrayOfNulls<String>(size) // create array with all null values
    var emptyArrays = emptyArray<String>() // create empty array
    var arrayList = ArrayList<String>() // Create Array List

    arrayList.add("test 1")
    arrayList.add("test 2")
    arrayList.add("test 3")
    arrayList.add("test 4")
    println(arrayList)

    arrayList.set(1,"test 5")
    println(arrayList)

    println(arrayList.contains("test 3")) // true
    println(arrayString.equals(arrayList)) // false
    println(arrayString.hashCode()) // 1416233903
    println(arrayList.toString()) // [test 1, test 5, test 3, test 4]

    println(arrayString.indices) // 0..4
    println(arrayString.lastIndex) // 4
    println(arrayString.count()) // 5
    println(arrayString.size) // 5

    // Print All Array
//    for (value in arrayString){
//        println(value)
//    }
//
//    for (index in arrayString.indices){
//        println(arrayString[index])
//    }
//
//    for (index in 0..arrayString.size-1){
//        println(arrayString[index])
//    }

    /**
     * Multi-dimensional Array
     */
    println("***** Multi Dimension Array *****")
    var num = 0
    var firstDimension = Array<Int>(3){num++}
    var secondDimension = Array<Array<Int>>(4){firstDimension}
    var thirdDimension = Array<Array<Array<Int>>>(5){secondDimension}

    println("print first dimension")
    for (value in firstDimension){
        println(value)
    }

    println("print second dimension")
    for (index1 in secondDimension.indices){
        println(index1)
        for (index2 in secondDimension[index1].indices){
            print(secondDimension[index1][index2])
            if(index2 == secondDimension[index1].lastIndex){
                println("")
            }
        }
    }

    println("print third dimension")
    for (index1 in thirdDimension.indices){
        println(index1)
        for (index2 in thirdDimension[index1].indices){
            print(index2)
            for (index3 in thirdDimension[index1][index2].indices){
                print(thirdDimension[index1][index2][index3])
                if(index3 == thirdDimension[index1][index2].lastIndex){
                    println("")
                }
            }
        }
    }
}