package basics


object dataVariables {
  def main(args: Array[String]): Unit = {
    // Keyword=var(mutable). Variable Name=a. Data Type=Int. Data Value=12
    var a : Int = 12
    println(a)

    println(a+30)

    var b : Int = 12
    println(a+b+2)

    // Will interpret a Boolean
    var c =true

    // Will interpret a Double
    var d = 12.3

    // Will interpret a Float
    var e = 12.3f

    // Declare multiple values
    val x = {val y : Int = 200 ; val z : Int = 300; y+z } // y+z is the result and is assigned to x
    println(x)

    // Lazy Loading
    val f = 500
    println(f * 30)

    lazy val g = 500
    println(g * 2) // Value of variable only initialised when used


    val j = 20
    val y = 30
    var res = ""
    if (j == 20 && y == 30) { // || for OR statement
      //println("j IS 20");
      res = "j == 20 and y == 30"
    } else {
      //println("j IS NOT 20");
      res = "j != 20"
    }

    println(res)

    // Can also do an If loop like this
    val res2 = if (j == 20) "j == 20" else "j != 20"
    println(res2)
    // Also...
    println(if (j == 20) "j == 20" else "j != 20")

  }
}
