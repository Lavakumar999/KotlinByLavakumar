fun main(args: Array<String>) {
    var ch:String?;
    val a = 12
    val b = 5
    do{
            println("Enter operator either +, -, * % or /")
            val operator = readLine()

            val result = when (operator) {
                "+" -> a + b
                "-" -> a - b
                "*" -> a * b
                "/" -> a / b
                "%" -> a % b
                else -> "$operator operator is invalid operator."
            }
            println("result = $result")

        println("Enbter the choie Y?N");
        ch= readLine();
    }while (ch!="N");
}