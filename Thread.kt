
fun main(args:Array<String>){
    var t1 = thread("Thread 1 (One)")
    t1.start()

    var t2 = thread("Thread 2 (Two)")
    t2.start()

    var t3 = thread("Thread 3 (Three)")
    t3.start()

    t3.join() // waiting thread 3 to finish, then run the next code

    println("all process is done")
}

class thread():Thread(){
    var threadName:String?=""

    constructor(threadName:String):this(){
        this.threadName = threadName
    }

    override fun run() {
        var count = 0
        while (count < 10){
            println(this.threadName + "Count : $count")
            count++

            try {
                Thread.sleep(500)
            }
            catch (Ex:Exception){
                println(Ex.message)
            }
        }
    }
}