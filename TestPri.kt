import java.util.*

fun main(args:Array<String>) {


    var year=Calendar.getInstance().get(Calendar.YEAR);
//    var date=Calendar.getInstance().get(Calendar.DATE);
//    println(date)`
    println("Enter Ypur year");
    var dob= readLine()!!.toInt();
    var age=year-dob;
    if(age>=18){
        println("Sufficient enter Amount now");
        var amount= readLine()!!.toDouble();
        if(amount>100.0){
            println("SAystem out of memory")
        }else{
            amount=amount*67;
            println("Your amount In $ to INR is $amount")
        }
    }else{
        println("Amul Baby");
    }

}