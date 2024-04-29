package basics

object matchExpressions {
  def main(args: Array[String]): Unit = {

    // Use Match as Statement
    val age = "30"
    age match { // pass an argument with keyword
      case "20" => println(age);
      case "18" => println(age); // one condition met, will print
      case "30" => println(age);
      case "40" => println(age);
      case "50" => println(age);
      case _ => println("default"); // _ means the default case variable doesn't match any case

    }

    // Use Match as Expression
    val result = age match { // pass an argument with keyword
      case "20" => age;
      case "18" => age; // one condition met, will print
      case "30" => age;
      case "40" => age;
      case "50" => age;
      case _ => "default"; // _ means the default case variable doesn't match any case

    }

    println("result = " + result)


  }
}