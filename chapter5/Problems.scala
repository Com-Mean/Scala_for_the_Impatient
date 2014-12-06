
// problem 5.1
class Counter {
    private var value = 0
    def increment() {
        if (value < Int.MaxValue)
            value += 1
    }
    def current = value
}

// problem 5.2
class BankAccount {
    private var balance = 0

    def deposit(money : Int) { 
        balance += money
        balance
    }

    def withdraw(money : Int) {
        if (balance > money)
            balance -= money
        else
            println("Balance not enough!")
    }

    def current = balance
}

// problem 5.3
class Time(private val hours: Int = 0, private val minutes: Int = 0) {
    def before(other: Time) {
        if (hours < other.hours || \
            hours == other.hours && minutes < other.minutes) True
        else False
    }
}

// problem 5.4
class Time(private val hours: Int = 0, private val minutes: Int = 0) {
    private val totalMinutes = hours * 24 + minutes // 0 to (23 * 60 - 1)
    def before(other: Time) { totalMinutes < other.totalMinutes }
}

// problem 5.5
import scala.reflect.BeanProperty
class Student(@BeanProperty var name: string, @BeanProperty var id: Long){}

// problem 5.6
class Person(private var name:string, private var age : Int) {
    if (age < 0) age = 0
}

// problem 5.7
class Person(name: String) {
    private val firstname = name.substring(0, name.indexOf(" "))
    private val lastname  = name.substring(name.indexOf(" ") + 1, name.length)
}

// problem 5.8 
class Car(private val manufacturer: String, var mode: Int = -1, var year : Int = -1, platenum: String="") {
    def the_manufacturer = manufacturer
}

// problem 5.10
class Employee(val name : String = "John Q. Public", val salay: Double = 0.0){}
