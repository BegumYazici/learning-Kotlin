package KotlinTutorial4

fun main(args: Array<String>){

    var num1 : Int = 4;
    var num2 : Int = 7;

    var result = num1 + num2 ;

    println("The addition of $num1 and $num2 is $result");

    var navin = Alien();
    navin.name = "Examples";

    println("Alien name is : ${navin.name}");
}