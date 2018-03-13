
fun main(args:Array<String>){
    /**
     * Loop
     * loop is when you want to repeat one line on the code on N times
     */
    // BEFORE
    println("Hello World !")
    println("Hello World !")
    println("Hello World !")
    println("Hello World !")
    println("Hello World !")

    /**
     * Loop - FOR
     */
    for (count in 1..5){
        println("Hello World !")
    }

    /**
     * Loop in loop
     */
    for (count in 1..5){
        println("Hello World !")
        for (happy in 1..5){
            println("HAPPY")
        }
    }

    /**
     * Loop - WHILE
     */
    var count:Int = 1
    while (count <= 5){
        println("Hello World !")
        count++ // you need to add this line of code for count to reach conditions false, if not this will loop forever
    }

    /**
     * Loop - DO WHILE
     * running in DO block code for one time,
     * if conditions in WHILE is true, than run DO block code again
     * if conditions in WHILE is false, than exit the loop
     */
    var count1:Int = 1
    do {
        println("Hello World !")
        count1++
    }while (count1 < 1)

    /**
     * RETURN AND JUMP
     * IF you don't want some of specific code to run use continue
     * IF you want to break out from the loop you are in use break
     * break@name is when you want to break "name" loop
     */
    loop_name@ for (count2 in 1..10){
        if (count2 == 4){
            continue
        }

        for (count3 in 1..5){
            if (count3 == 3){
                break
            }
            // count3 > 3 will not printed
            // because when count3 == 3 it will break out from this loop
            println("count3:$count3")
        }

        for (count4 in 1..5){
            if (count4 == 3){
                // this will break the "loop_name"
                break@loop_name
            }
            println("count4:$count4")
        }

        println("count:$count2")
    }
    println("All loop done")
}