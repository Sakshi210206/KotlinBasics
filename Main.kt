fun basics1(){
    var i = 10
    val j = 12
    i++
    println("i is -- $i j is --$j")
}
fun basics2():Int{
    var n1 :Int = 10
    var n3 : Int = 23
    var n2 :Float = 34.23F
    return n1 + n3
}
fun basicDataTypes(){
    var n:Int = 21
    var m: Float = 21F
    var s: Double = 45.356
    var name:String= "Sakshi"
    var nFloat : Float = n.toFloat()
    println("float number -- $nFloat")
    println("n -- $n  m -- $m  s -- $s  name--$name")
}
fun addition(n1 :Int,n2 :Int):Int{
    return n1+n2
}
fun main(){
    var addRes = addition(21,12)
    println("Addition Result is -- $addRes")
//Treat it as computation
    println("Add res is : ${addition(25, 56)}")

    var result = basics2()
    println("result -- $result")
    basics1()
    println(" --------------- ")
    basicDataTypes()
}