//two constructor in kotlin in android -primary and secondary constructor
class Point1 (private var x : Int,private var y:Int){

    var name : String = ""

        //backing field in kotlin
        set(value){
           // field = value
            if(value in arrayOf("lokesh","Sakshi","nidhi","yash")) field = value
        }
        get() = " Name is $field"
    init {
        println("init block of Point1 class called")
        this.x=0
        this.y=0
    }
    constructor(): this(0,0){
       println("Secondary Constructor 1")
    }
    constructor(cor:Int):this(cor,cor){
        println("Secondary Constructor 2")
    }
    //way 1
  /*  fun display(){
        println("Display method called")
    }*/
    //way 2
  fun display() = print("Display Method Called")

}