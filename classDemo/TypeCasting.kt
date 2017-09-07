package classDemo
open class operations{
    open  fun sum(n1:Int,n2:Int):Int{
        return n1+n2;
    }

}
class mulitoperations:operations(){
    override fun sum(n1:Int,n2:Int):Int{
        return n1+n2+3;
    }
}
fun main(args: Array<String>) {
    var op=operations();
    var multi=mulitoperations();
    var typeop=multi as operations
    println(typeop.sum(10,20));
}