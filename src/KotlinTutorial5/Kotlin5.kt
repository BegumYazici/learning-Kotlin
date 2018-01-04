package KotlinTutorial5

fun main(args: Array<String>) {

    var num1: Int = 10;
    var num2: Int = 12;

    var result: Int = 0;

    result = if(num1 > num2)
        num1
    else
        num2

    println("Result is $result")
}