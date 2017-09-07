fun main(args: Array<String>) {
    var array=ArrayList<String>();
    println("Enter Size of Array")
    var n= readLine()!!.toInt();
    var count=0;
    println("Enter The Elements");
    for(i in 0..n-1){
        array.add(readLine()!!);
    }
    for(i in 0..array.size-1){
        for(j in i+1..array.size-1){
            if(array.get(i).equals(array.get(j))){
                count=j;
                println(array.get(j))
                array.removeAt(count);
                println(array.size)
            }
        }

    }
    println("=====================")
    for(i in 0..array.size-1){
        println(array.get(i));
    }
}