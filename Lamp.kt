class Lamp {
    var isturn:Boolean=true;
    fun turnOn(){
        isturn=true;
    }
    fun turnOf(){
        isturn=false;
    }
    fun displayStatus(lamp: String){
        if(isturn==true)
            println("$lamp is on");
        else
            println("$lamp is in off mode");

    }
}
fun main(args:Array<String>){
    var l1=Lamp();
    var l2=Lamp();
    l1.isturn=false;
    l1.displayStatus("l1");
    l2.displayStatus("l2");
}