package functionKotlin
fun show(n1:Int){
    println(n1)
}
fun show(n2:String){
    println(n2)
}
fun show(n3:Float){
    println(n3)
}

fun main(args: Array<String>) {
    show(123);
    show("Lavakumar");
    show(123.4F);

}