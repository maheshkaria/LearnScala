object Tut2 {
  def main(args: Array[String]): Unit = {

    // variable relationship with type of data

    var z: Int = 10 // we can exclusively define what kind of value a variable holds
    // type annotation helps to assign appropriate value
    // usually type is inferred but its good to define
    z = 123

    // this is how we can define a method
    def add(x: Int, y: Int): Int = x + y
    println(add(4,5))
  }
}