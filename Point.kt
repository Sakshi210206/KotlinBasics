class Point {
    private var x :Int = 0
    private var y : Int = 0
    //secondary constructors in kotlin
    constructor(){
        this.x =0
        this.y = 0
    }
    constructor(x: Int , y: Int){
        this.x = x
        this.y = y
    }
    fun setX(x : Int){
        this.x=x
    }
    fun setY(y :Int){
        this.y =y
    }
    fun getX() :  Int{
        return this.x
    }
    fun getY() : Int{
        return this.y
    }

    fun display(){
        println("x is $x -- y is $y")
    }

    override fun equals(other: Any?): Boolean {
       var p1 = other as  Point
        if(this.x == p1.x){
            return this.x ==p1.x
        }
        return this.y == p1.y
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return "Point(x= $x , y =$y"
    }
}