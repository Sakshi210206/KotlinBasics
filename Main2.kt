fun main(){
    //ranges in kotlin
    var numbers : IntRange = 0 .. 20
    for (i in numbers){
        println("$i")
    }

    //reversing range
    var range1 = 10.downTo(5)
    for (i in range1){
        println("$i")
    }
}