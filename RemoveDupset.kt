fun main(args: Array<String>) {
    var array = ArrayList<String>();
    var hasharray=HashSet<String>();
    println("Enter Size of Array")
    var n = readLine()!!.toInt();
    var count = 0;
    println("Enter The Elements");
    for (i in 0..n - 1) {
        array.add(readLine()!!);


    }
    for (i in 0..array.size - 1) {

        hasharray.add(array.get(i));

    }
    val itr = hasharray.iterator()
    while (itr.hasNext()) {
        println(itr.next())
    }

}