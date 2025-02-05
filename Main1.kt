fun main(){
    var m1 = Maths()
    m1.addition()
    m1.multiply()
    m1.subtraction()
    m1.division()

    var p = Point()
    var p1 = Point(10,23)
    p.equals(p1)

    var pointObject = Point1(10,20) //primary constructor
    pointObject.display()

    var p3 = Point1()  //secondary constructor
    var p4 = Point1(12) //secondary constructor

    var p5 = Point1()
    p5.name = "Sakshi"
    p5.display()

    var s1 = Student("Sakshi",2003)
    println("${s1.age}")

    var n : Any // any is superclass or base class
    var arr : Array<Int> = arrayOf(10,20,30,40,50)  //method in kotlin arrayOf
    var intArr : IntArray = intArrayOf(11,20,45,62,85) //method in kotlin intArrayOf
    var arr1 = arrayOf("Java","C","C++","Kotlin","Swift")
    // different ways to use loop
    //way 1 are not use
    //way 1 - range specification
    for (i in 0 .. arr.size-1){
        println(arr[i])

    }
    for (i in arr.indices){
        println(arr[i])
    }

    for (i in 0 until arr.size-1){
        println(arr[i])
    }


    //way 2 -- these are used
    for (eachElement in arr){
        println(eachElement)
    }
    
    for (eachElement in arr1){
        println(eachElement)
    }
    
    //object of array class in Kotlin with lambda function as last argument
    
    var a1 = Array<Int>(5){i -> i +10}
    
    for(a in a1){
        println("$a")
        println(a)
    }
    //to create array IntArray class
    var a2 = IntArray(10);
    var a3 = IntArray(10){i -> i+5}
}