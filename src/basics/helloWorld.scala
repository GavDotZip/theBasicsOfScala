package basics

object helloWorld {
  def main(args: Array[String]): Unit = {
    // String Interpolation
    val name = "Phoenix"
    val age = 31
    println(name + "is " + age + " years old")
  }
}