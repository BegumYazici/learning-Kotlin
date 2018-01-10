package KotlinTutorial11

import java.util.*

fun main (args : Array<String>){

    var aliens = TreeMap<String, Int>()
    aliens["Navin"] = 543
    aliens["Kishor"] = 409

    for((name,age) in aliens){
        println("$name : $age")
    }
}