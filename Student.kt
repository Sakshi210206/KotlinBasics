import java.util.*
import java.sql.Date
class Student(var name : String, var birthYear : Int) {
    var age : Int = -1
        get() {
            return Date(System.currentTimeMillis()).year - birthYear
        }
}