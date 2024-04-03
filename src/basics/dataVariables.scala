package basics


object dataVariables {
  def main(args: Array[String]): Unit = {
    // Keyword=var(mutable). Variable Name=a. Data Type=Int. Data Value=12
    var a : Int = 12
    println(a)

    println(a+30)

    var b : Int = 12
    print(a+b+2)

    // Will interpret a Boolean
    var c =true

    // Will interpret a Float
    var d = 12.3
  }
}
