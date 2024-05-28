object Tut3 {
  def main(args: Array[String]): Unit = {

    var defaultName = "helloworld"

    val args: Array[String] = Array.empty

    var fileName = "default.txt"

    // example of if else statement
    val newName = if (args.length > 0) args(0) else "else.txt"

    print(newName)

    // scala takes last expression and returns it so need to have return statement exclusively

  }
}