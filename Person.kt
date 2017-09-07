fun main(args: Array<String>) {
    val person1 = Person("joe", 25)
}

class Person(fName: String, personAge: Int) {
    val firstName = fName.toUpperCase()
    var age = personAge

    // initializer block
    init {
        println("First Name = $firstName")
        println("Age = $age")
        println(fName)
    }
}