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
    var y = 0;
    do {
      println("y = " + y)
      y += 1;
    } while (y<10);

  }

}
