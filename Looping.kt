

fun main(args: Array<String>) {
    var flag:Boolean =true;
    var i=0;
    var j=0;
   mainwhile@ while(j<5) {

        while (i < 10) {
            println("heloo in 1st while  $i")
            if (i == 5) {
                j = 0;
                break@mainwhile
            }
            i++;
        }
    }

}