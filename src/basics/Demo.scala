package basics

object Demo {
  def main(args: Array[String]): Unit = {
    val x = 20
    val y = 30
    var res = ""
    if (x == 20 && y == 30) { // || for OR statement
      //println("X IS 20");
      res = "x == 20 and y == 30"
    } else {
      //println("X IS NOT 20");
      res = "x != 20"
    }

    println(res)

    // Can also do an If loop like this
    val res2 = if(x == 20) "x == 20" else "x != 20"
    println(res2)
    // Also...
    println(if (x == 20) "x == 20" else "x != 20")

  }

  }
