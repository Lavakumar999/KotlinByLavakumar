fun main(args: Array<String>) {

    val a = 12
    val b = 5

    println("Enter operator either +, -, * % or /")
    val operator = readLine()

    val result = when (operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        "%" ->  a % b
        else -> "$operator operator is invalid operator."
    }

    println("result = $result")
     println("Enter the N value To test");

        val n = readLine()!!.toInt();

        when (n) {
            in 1..100 -> println("n is a positive less than 100.")
            0 -> println("n is zero")
            -1,-2,-3-> println("n is a negative integer greater than 3.")
        }

}