//5. Make a console application that will allow me to enter
//a string text , then write a function which will accept the string as
//an argument and check if the word contains the letter ‘a’ .

fun main(){
    println("Enter your name:")
    val name = readLine()
 try {
     if ("$name".contains("a")){
         println("your name contains an a")
     }
     else{
         throw Exception ("We require a name with a")
     }

 } catch (e:Exception){println(e.message)}
}