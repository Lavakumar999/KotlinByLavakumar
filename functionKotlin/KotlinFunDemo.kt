package functionKotlin

fun sum(n1:Int, n2:Int):Int{
    return n1+n2;

}
fun Display(sum:Int):Unit{

    println("The functionKotlin.sum ="+sum);
}

fun main(args: Array<String>) {
    var sum= sum(10, 20);
    Display(sum);
}