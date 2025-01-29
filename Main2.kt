fun main() {

    var num1 = 34
    //similar to seitch case -- when  statement in kotlin
    when (num1) {
        1 -> println("Case 1")
        2 -> println("Case 2")
        in 5..25 ->{
            println("Range added in case")
           println( num1 + 30)
    }
        34 -> println("Case 34")
        else -> println("else case matched")
}
    println("\n==========\n")
    //if else statmenets in kotlin
    var numberOne :Int = 23
    var numberTwo : Int = 45
    var maximum :Int=if(numberOne > numberTwo){
        println("$numberOne is greater than $numberTwo")
        numberOne
    }else{
        println("$numberOne is less then $numberTwo")
        numberTwo - 10
    }
    println("$maximum")
    println("\n==========\n")
    //ranges in kotlin
    var numbers : IntRange = 0 .. 20
    for (i in numbers){
        println("$i")
    }
    println("\n==========\n")

    //reversing range
    var range1 = 10.downTo(5)
    for (i in range1){
        println("$i")
    }
    println("\n==========\n")
    var numbers1 = 10 .. 50
    var range2 = numbers1.step(2)
    for (eachElement in range2){
        println("$eachElement")
    }
    println("\n==========\n")
    var numbers3 = (-20 .. 10).reversed().step(2)
    for (eachElement in numbers3){
        println("$eachElement")
    }
}