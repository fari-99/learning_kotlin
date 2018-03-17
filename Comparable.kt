
class PersonDetails(var name:String, var age:Int):Comparable<PersonDetails>{
    override fun compareTo(other: PersonDetails): Int {
        return this.age - other.age
    }
}

fun main(args:Array<String>){
    // Sorting by comparable default data type (String)
    val listOfName = ArrayList<String>()
    listOfName.add("Lena")
    listOfName.add("Jena")
    listOfName.add("Hussein")

    println("before sorting :")
    listOfName.forEach({
        println(it)
    })

    println("sorting")
//    Collections.sort(listOfName)
    listOfName.sort()

    println("after sorting :")
    listOfName.forEach({
        println(it)
    })

    // Sorting by custom sort
    // because it's using data type custom (PersonDetails)
    val personList = ArrayList<PersonDetails>()
    personList.add(PersonDetails("Lena", 10))
    personList.add(PersonDetails("Jena", 8))
    personList.add(PersonDetails("Hussein", 29))

    println("before sorting :")
    personList.forEach({
        println("name : " + it.name)
        println("age : " + it.age)
    })

    personList.sort()
    println("before sorting :")
    personList.forEach({
        println("name : " + it.name)
        println("age : " + it.age)
    })
}