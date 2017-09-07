package classDemo
class Dog{
    fun twoEars():Unit{
        println("The Dog has two ears");
    }
    fun FourLegs():Unit {

        println("The Dog has Four Legs");
    }
}
fun main(args: Array<String>) {
    var d=Dog();
    d.twoEars();
    d.FourLegs();


}