package KotlinTutorial1

import KotlinTutorial1.Alies

fun main(args: Array<String>){

    println("Hello KotlinTutorial1.Alies");

    var tittu = Alies();

    tittu.name = "Harsh";

    println("Name is: " + tittu.name);

    tittu = Alies();

    println("Second name is: " + tittu.name);
}