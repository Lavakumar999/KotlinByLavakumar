import java.util.*
import kotlin.collections.HashMap

fun main(args: Array<String>) {
    var rand=Random();
    println(rand.nextInt(1000));
    var maapDemo=HashMap<Int,String>();
    maapDemo.put(1,"lava");
    maapDemo.put(2,"kumar");
    for(item in maapDemo.keys){
        println(maapDemo.get(item))
    }
 println("===============================");
    var map= hashMapOf<Int,String>(1 to "Lavakumar",2 to "JrNtr",3 to "Billgates")
    map.put(66,"Rohit");
    for(item in map.keys)
        println(map[item]);

}