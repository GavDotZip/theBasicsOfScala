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
    for (i <- 1 to 9; j <- 1 to 3) { // For-Loop automatically takes as mutable variable
      println("i using to " + i + " " + j);
    }

    val lst = List(1,2,3,4,5,6,7,8,9);
    for (i <- lst) { // For-Loop automatically takes as mutable variable
      println("i using lst " + i);
    }
    for (i <- lst; if i < 6) { // For-Loop automatically takes as mutable variable
      println("i using lst " + i);
    }


  }

}
