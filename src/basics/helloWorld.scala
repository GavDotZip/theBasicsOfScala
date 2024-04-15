package basics

object helloWorld {
  def main(args: Array[String]): Unit = {
    // String Interpolation
    val name = "Phoenix"
    val age = 31
    println(name + " is " + age + " years old")
    // Can alsa do the following...
    println(s"$name is $age years old") // S String Interpolation
    // Can also do the following for a type safe manner...
    println(f"$name%s is $age%d years old") // F String Interpolation
  }
}