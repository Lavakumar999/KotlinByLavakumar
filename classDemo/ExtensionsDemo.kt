package classDemo

fun ArrayList<String>.swap(n1:Int,n2:Int){
    var temp=this.get(n1);
    this.set(n1,this.get(n2));
    this.set(n2,temp);
}
fun main(args: Array<String>) {
    var arrNames=ArrayList<String>();
    arrNames.add("Lava");
    arrNames.add("Kumar");
    arrNames.add("Ntr");
    println(arrNames);
    arrNames.swap(0,1);
    println(arrNames)
}
