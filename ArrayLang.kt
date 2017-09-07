fun main(args: Array<String>) {

    var language = arrayOf("Ruby", "Koltin", "Python", "Java")
     println(language.indices)
    for (item in language.indices) {

        if (item%2 == 0)
            println(language[item])
    }
}
