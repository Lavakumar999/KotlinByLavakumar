package multithreading

class Mythread():Thread(){
    var threadName:String?=null
    constructor(threadName:String):this(){
        this.threadName=threadName;
    }
    override  fun run(){
        for (item in 1..5){
            println("$threadName is running $item")
            Thread.sleep(1000);
        }

    }
}

fun main(args: Array<String>) {
    var myThread=Mythread("Lamborgini");
    myThread.start();
    myThread.join();
    var myThread2=Mythread("Range rover");
    myThread2.start();
    var myThread3=Mythread("BMW");
    myThread3.start();

}