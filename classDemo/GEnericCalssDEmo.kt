package classDemo

class PrintMydata<T>(n1:T) {
    init {
        println(n1)
    }
    fun operate(n1:T,n2:T):Unit{
        println("N1 and N2 are $n1 and $n2")

    }

}

fun main(args: Array<String>) {
    var value=PrintMydata<String>("LavaKumar");
    var valueInt=PrintMydata<Int>(18);
    valueInt.operate(2,3);
}