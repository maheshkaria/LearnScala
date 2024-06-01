// factory methods and companion object
// When we do List.apply() here apply is factory method
// an object in the same source file with the same name as the class or trait is called as companion objects
// companion objects share private state and behavior with the class (and vice versa)
// its scala's alternative to static
// its good place to put factory methods


object Rational {

  def apply(n: Int, d: Int): Rational = new Rational(n, d)
  def apply(i: Int): Rational = new Rational(i, 1)
}


class Rational private (val n: Int, val d: Int) {

  override def toString: String = s"R($n/$d)"

  def min(other: Rational): Rational =
    if ((n.toDouble / d) < (other.n.toDouble/other.d))
      this else other

    def +(other: Rational): Rational =
      new Rational(n * other.d + d * other.n, d * other.d)


}
// when we make class private we can't create object of class Rational directly we are forced to use companion object
// val half = new Rational(1, 2)
// val fifth = new Rational(1, 5) <--- will fail

val sum = Rational(1,5) + Rational(5)

print(sum)
