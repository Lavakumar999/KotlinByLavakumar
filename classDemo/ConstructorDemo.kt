package classDemo

class Dogs(twoLegs:String,twoEyes:String,oneNose:String){
    var twoLegs:String?=""
    var twoEyes:String?=""
    var oneNose:String?=""
    init{
        this.oneNose=oneNose;
        this.twoEyes=twoEyes;
        this.twoLegs=twoLegs;
    }
    fun twoLegs():Unit{
        println(twoLegs);
    }
    fun twoEyes():Unit {

        println(twoEyes);
    }
    fun oneNose():Unit{
        println(oneNose);
    }
}
fun main(args: Array<String>) {
    var d=Dogs("two Legs","two Eyes","OneNose");

    d.twoLegs();
    d.twoEyes();
    d.oneNose()



}