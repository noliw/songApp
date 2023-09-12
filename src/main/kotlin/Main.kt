// A class is a template that defines what properties and functions are associated with objects of that type
// the things an object knows about itself are its properties
// the things an object can do are its functions
//

fun main(args: Array<String>) {
    var myDog = Dog(name ="Figo", weight = 70, breed = "Mixed")
    println(myDog.name) // go to the myDog container and get its name
    myDog.weight = 75 // got to myDog and set its weight to 75
    myDog.bark() // got to myDog and call its bark function.

    // What is the Dog is in a Dog array
    // the code below creates 2 Dog objects, and adds them to an array<Dog> array named dogs
    var dogs = arrayOf(Dog(name ="Figo", weight = 70, breed = "Mixed"), Dog(name ="Ripper", weight = 10, breed = "Poodle"))
    dogs[1].weight = 15 // get the second object from the dogs array, change its weight to 15 lbs and make it bark
    dogs[1].bark()
}

class Dog(
    val name: String,
    var weight: Int,
    val breed: String
) {
    fun bark() { // this is a member function, or a method
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}