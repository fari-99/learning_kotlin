/**
 * In Java, you must create Setter and Getter for each variable,
 * in this example you doesn't need to create that
 */
data class Customer(val name: String, val email: String, val company: String)

fun main(args:Array<String>){
    val name = "Fadhlan Rizal"
    val email = "fadhlan.fari@gmail.com"
    val company = "Company"
    val customer = Customer(name, email, company)
    println(customer.name)
    println(customer.email)
    println(customer.company)
}