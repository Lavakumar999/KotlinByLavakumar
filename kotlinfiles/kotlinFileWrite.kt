package kotlinfiles

import java.io.FileWriter

fun WriteToFile(str:String){
    try{
        val fo= FileWriter("test.txt",true)
        fo.write(str+"\n")
        fo.close()
        println("Data is saved");
    }catch (ex:Exception){
          println(ex.message)
    }
}

fun main(args: Array<String>) {
    println("Enter Some Text");
    var s:String= readLine()!!;
    WriteToFile(s);
}