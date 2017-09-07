package functionKotlin

fun summing(n1:Int, n2:Int):Int{
    return n1+n2;
}
fun summing(n1:Int, n2:Int,n3:Int):Int{
    return n1+n2+n3;
}
fun main(args: Array<String>) {
    var sum= summing(10,20);
    println("Sum in two $sum");
    var sumthree= summing(10,20,30);
    println("Sum is three $sumthree");

}