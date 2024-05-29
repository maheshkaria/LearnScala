object ex1 {

  def main(args: Array[String]): Unit = {

    var x: Int = 1
    while (x <= 5) {
      var y: Int = 1
      while (y <= 5) {
        val res = (x*y).toString
        if (res.contains('4') || res.contains('6')) {
          println(s"$x times $y is ${res}")
        }
        y += 1
      }
      x += 1
    }

  }

}
