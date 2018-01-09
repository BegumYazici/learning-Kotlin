package KotlinTutorial8

fun main(args: Array<String>) {

    var num: Int = 3

    var str = when (num) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        else -> "Give a proper input"
    }

    println("Str is $str")
}