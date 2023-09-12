// A class is a template that defines what properties and functions are associated with objects of that type
// the things an object knows about itself are its properties
// the things an object can do are its functions
// constructor runs when you instantiate an object. It's used to define properties and initialize them
// custom getters and setters help us tweaks property's return value or validate a value before it gets assigned to a property
// a getters sole purpose in life is to send back a return value, the value of whatever it is that particular getter is supposed to be getting
// a setter	lives and breathes for the chance to take an argument value, and use it to set the value of a property

fun main(args: Array<String>) {
    var myDog = Dog(name = "Figo", weight = 70, breed = "Mixed")
    println(myDog.name) // go to the myDog container and get its name
    myDog.weight = 75 // got to myDog and set its weight to 75
    myDog.bark() // got to myDog and call its bark function.

    // What is the Dog is in a Dog array
    // the code below creates 2 Dog objects, and adds them to an array<Dog> array named dogs
    var dogs =
        arrayOf(Dog(name = "Figo", weight = 70, breed = "Mixed"), Dog(name = "Ripper", weight = 10, breed = "Poodle"))
    dogs[1].weight = 15 // get the second object from the dogs array, change its weight to 15 lbs and make it bark
    dogs[1].bark()

    myDog.weights = -1
    println("\n new weight is ${myDog.weights}")
}

class Dog(
    // this is a constructor. Technically a primary constructor
    val name: String, // properties declared with vals cannot be modified
    var weight: Int,
    val breed: String,
) {
    init {
        println("Dog $name has been created")
    }
    var activities = arrayOf("Walks")
    val breeds = breed.uppercase()
    init {
        println("The breed is $breed")
    }
    val weightInKgs: Double
        get() = weight / 2.2
    var weights = weight
        set(value) {
            if (value > 0) field = value
        }



    init {
        println("The breed is $breed")
    }

    fun bark() { // this is a member function, or a method
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}