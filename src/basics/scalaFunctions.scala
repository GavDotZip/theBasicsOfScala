package basics

object scalaFunctions {

  object Math { // If it's a new class, we need new instance of object. Here, it is just a new object
    def add(x: Int, y: Int): Int = {
      return x + y
    }
    def square(x : Int) = x * x
  }
  // If a block of code is repeating in program, best declare as a function
  // function takes form: def functionName(argument : dataType of argument) : dataType of Return
  def add(x : Int, y : Int) : Int = {
    return x + y
  }

  def subtract(x: Int, y: Int): Int = {
    x - y // Last line of function automatically considered return statement
  }

  def multiply(x: Int, y: Int): Int = x * y // Can also place on one line

  def divide(x: Int, y: Int) = x / y // No need to add return type if certain of return data type

  def main(args: Array[String]): Unit = {
    println(Math.add(45, 15)) // Call the add function from Math object
    println(Math square 3) // Call the square function from Math object

    println(add(45, 15)) // Call the add function
    println(subtract(45, 15)) // Call the subtract function
    println(multiply(45, 15)) // Call the multiply function
    println(divide(45, 15)) // Call the divide function
  }
}