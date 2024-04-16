package projects.beginner.A1
import scala.io.StdIn // Works similar to Scanner in Java

case class Tester(name: String, id: Int) {
  object Tester extends App {
    // Read in the number of students to be printed
    println("Welcome! Personalized Student Class Tester initialized...")
    println("How many students would you like to add?")
    val numberOfStudents = StdIn.readInt()
  }

}
