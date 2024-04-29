package basics

object scalaFunctions {


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

  object Math { // If it's a new class, we need new instance of object. Here, it is just a new object
    def add(x: Int = 45, y: Int = 15): Int = { // default values for parameters
      return x + y
    }

    def +(x: Int, y: Int): Int = { // Can use operators as function names
      return x + y
    }

    def **(x: Int) = x * x

    def square(x: Int) = x * x
  }

  def print(x : Int, y : Int): Unit = {
    println(x+y);
  } // Function which does not return anything uses 'Unit'

  def main(args: Array[String]): Unit = {
    val sum = 10 + 20 // this + is also a function
    println(Math ** 3)
    print(100, 200)
    println(Math.add(60, 20)) // Call the add function from Math object
    println(Math square 3) // Call the square function from Math object

    println(add(45, 15)) // Call the add function
    println(subtract(45, 15)) // Call the subtract function
    println(multiply(45, 15)) // Call the multiply function
    println(divide(45, 15)) // Call the divide function

    // functions are treated as first class citizens: can assign function
    // to a variable using anonymous functions
    var addAnon = (x : Int, y : Int) => x + y
    println(addAnon(300, 500))
  }
}