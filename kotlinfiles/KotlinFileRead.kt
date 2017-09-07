package kotlinfiles

import java.io.FileReader


fun ReadFromFile(){
    try{
        val fin= FileReader("test.txt");
        var c:Int?
        do{
            c=fin.read();
            print(c.toChar())
        }while (c!=-1)
    }catch (ex:Exception){
        print(ex.message);
    }
}

fun main(args: Array<String>) {
    ReadFromFile();
}