package dataclasss

data class User(val name: String, val age: Int)

fun main(args: Array<String>) {
    val u1 = User("jack", 29)
    val u2 = u1.copy(name="Lavakumar")
    println("name = ${u2.name}")
    println("age = ${u2.age}")
    println(u1.toString())
    println("u1 hashcode = ${u1.hashCode()}")
    println(u1.component1())
}