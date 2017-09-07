fun main(args: Array<String>) {
    println("Ebter the number of gifts by REEMa");
    var giftsReema= readLine()!!.toInt();
    println("Ebter the number of gifts by SEEMa");
    var giftsSeema= readLine()!!.toInt();
    var finbalGifts=if(giftsReema>giftsSeema)giftsReema else giftsSeema;
    if(finbalGifts==giftsReema){
        println("What vis your age Reema")
        var age= readLine()!!.toInt();
        var reply:String?=when(age){
            in 18..21->"Lets go for date"
            else ->"Forget about its dear "
        }
        println(reply)
    }else{
        println("What vis your age Seema")
        var age= readLine()!!.toInt();
        var reply:String?=when(age){
            in 18..21->"Lets go for date"
            else ->"Forget about its dear "
        }
        println(reply)
    }

}