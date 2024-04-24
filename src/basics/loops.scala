package basics

object loops {
  def main(args: Array[String]): Unit = {
    var x =0;

    // While Loop
    while(x<10) {
      println("x = " + x)
      x += 1; //add 1 to existing value of x
    }

    // Do-While Loop
//    var y = 0;
//    do {
//      println("y = " + y);
//      y += 1;
//    } while (y<10);

    // For-Loop
    for (i <- 1 to 5) { // For-Loop automatically takes as mutable variable
      println("i using to " + i);
    }

    for (i <- 1.to(5)) { // For-Loop automatically takes as mutable variable
      println("i using to " + i);
    }

    for (i <- 1.until(6)) { // For-Loop automatically takes as mutable variable
      println("i using to " + i);
    }


  }

}
