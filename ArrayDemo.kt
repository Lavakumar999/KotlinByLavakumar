fun main(args: Array<String>) {
    println("enter the size eof the aray");
   // var N= readLine()!!.toInt();
    val x: Array<Int> = arrayOf(1,2,3,4,5,6)
    println("Enter the values into array");
//    for (i in x) {
//        x[i]= readLine()!!.toInt();
//    }
    println("The array Elemnents are");
    for(i in x)
        print(i);
    var array=ArrayList<String>();
    println("ente rthe size of array");
    var N= readLine()!!.toInt();
    for(i in 1..N){
        var value=readLine()!!;
        array.add(value);
    }
    
    for(element in array.indices)
        println(array[element])
}