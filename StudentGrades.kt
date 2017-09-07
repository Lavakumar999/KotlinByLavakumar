fun main(args: Array<String>) {
    println("Pleae Enter Your fav Teacher");
    var name:String= readLine()!!;
    var feedback:String?
    println("Pleas Grade your Teacher from 1 to 5")
    var inputStar= readLine()!!.toInt();
    when(inputStar){
        1->{
            feedback="Teacher is Worst"
        }
        2->feedback="Teacher is ok"
        3->feedback="Teacher is good"
        4->feedback="TREacher is best"
        5->feedback="Teacvher is Excell;ent"
        else-> feedback="No Words To describe Teacher"
    }
    
    println("HOw Many Lectures " +
            "delevired by this teacher" );
    var lectures= readLine()!!.toInt();
    var lecturesFeedback:String?
    when(lectures){
        1,2,3,4 ->lecturesFeedback="Sorry , we feel bad "
        in 20..30->lecturesFeedback="ok, we will try t imprive"
        !in 0..60 ->lecturesFeedback="Oh!! Exremly sorry"
        else->lecturesFeedback="You are at wqrong place"
    }
    println("Final; feedback $name ,$feedback who delivered $lectures based on that we give $lecturesFeedback")

}