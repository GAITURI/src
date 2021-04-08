//7. Declare a class car with the data members brand and model , then have member functions
class Car {
    //member data
    var brand = "Toyota"
    var brand1: String = "BMW"
    var model1: String = "Land cruiser"
    var model2: String = "x"


    //create functions
    fun accelerate() {

        println("The " + brand + model1 + " accelerates at a rate of 30m/s ")
        println("While " + brand1 + model2 + " has a slightly higher acceleration ")
    }

    private fun println(s: String, s1: String) {

    }

    fun carColor() {
        println("The " + brand + model1 + " is mostly preferred as silver black")

        println("The " + brand1 + model2 + "normally takes a silky white color")

    }

    fun carBrand() {
        println("Enter your brand:")
        val cBrand = readLine()
        try {
            if ("$cBrand" == "volvo") {
                println("This " + cBrand + " is more accomodative than" + brand)
            } else if ("$cBrand" == "honda") {
                println("A " + cBrand + " this is for the carbon print geeks  ")

            }
        } finally {
            "any car is valid"
        }


    }
}
fun main () {
    //instance of the object
    val obj = Car()
    println("${obj.accelerate()}")
    println("${obj.carColor()}")
    println(" = ${obj.carBrand()}")
}

