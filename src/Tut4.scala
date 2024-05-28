object Tut4 {
  def main(args: Array[String]): Unit = {

    // try catch example

    val div = try {
      10 / 0
    } catch {
      case ae: ArithmeticException => 0
    } finally {
      println("this is incorrect op")
      100
    }

    println(div)

  }
}