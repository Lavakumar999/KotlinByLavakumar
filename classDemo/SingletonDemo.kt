package classDemo

class  SingletonDemo{
    constructor(){
        println("I am called");
    }
    var name:String?=null;
    companion object {
        val instance:SingletonDemo by lazy { SingletonDemo() }
    }
}

fun main(args: Array<String>) {
       var sin1=SingletonDemo.instance;
       sin1.name="Lavakumar";
       println(sin1.name);
       var sin2=SingletonDemo.instance;
       println(sin2.name);
}
 