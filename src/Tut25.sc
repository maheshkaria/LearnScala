import language.implicitConversions // when we use implicit keyword we need to import this to avoid warnings

// implicit conversion

// implicit used by scala to solve type problems
// we can have implicit val/object/class/companion
// it is mandatory use implicit keyword to make it available

object Rational {
  def apply(n: Int, d: Int): Rational = new Rational(n, d)
  implicit def apply(i: Int): Rational = new Rational(i, 1)
}


class Rational private (val n: Int, val d: Int) { // private keyword makes this constructor private so only companion object can access it now

  override def toString: String = s"R($n/$d)"

  def min(other: Rational): Rational =
    if ((n.toDouble / d) < (other.n.toDouble/other.d))
      this else other

  def +(other: Rational): Rational =
    new Rational(n * other.d + d * other.n, d * other.d)


  // we don't need overloaded following method if we have implicit factory method in place
//  def +(i: Int): Rational =
//    this + Rational(i)

}
// when we make class private we can't create object of class Rational directly we are forced to use companion object
// val half = new Rational(1, 2)
// val fifth = new Rational(1, 5) <--- will fail

val sum = Rational(5) + 5

print(sum)

val sum = 5 + Rational(5) // this is allowed because in companion object factory method method apply is implicit (in earlier example it will give error) .. implicit keyword implicitly converts input if factory method is implicit
