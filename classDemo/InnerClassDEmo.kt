package classDemo


class outer(){
    fun showMyTextOuter(n1:String){
        println("I am in outer  $n1")
    }
    inner class Nested(){
        fun showMyText(n1:String){
            println("I am call FromInner"+n1)
        }
    }
}
fun main(args: Array<String>) {
    var ot=outer();
    ot.showMyTextOuter("Jr.Ntr");
    var innerValue=ot.Nested().showMyText("Lavakumar");
    println(innerValue);
}