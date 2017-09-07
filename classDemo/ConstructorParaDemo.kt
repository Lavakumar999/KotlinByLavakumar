package classDemo
class choclate(){
    var type:String?=null
    var cost:Double?=null
    var company:String?=null
    var rawMaterial:String?=null
    var supplier:String?=null
     init{
         println("Default Constructor")
     }

    constructor(type:String,cost:Double,company:String):this(){
        this.type=type
        this.cost=cost
        this.company=company
        println("This COnstructor with 3 arguments");
    }
    constructor(rawMaterial:String,supplier:String):this(){
        this.supplier=supplier
        this.rawMaterial=rawMaterial
        println("This COnstructor with 2 arguments");
    }

}
fun main(args: Array<String>) {
    var choclate1=choclate();
    var choclate2=choclate("StrawBErry",1200.00,"cadbery");
    var chocalte3=choclate("ChcolateMilk","Dairy");
}