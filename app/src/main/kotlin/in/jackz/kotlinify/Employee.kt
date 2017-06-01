package `in`.jackz.kotlinify

/**
 * Created by jackson on 22/5/17.
 */
class Employee {
    var firstName: String? = null

    var lastName: String? = null

}

val Employee.fullName: String?
    get() = firstName +" "+lastName