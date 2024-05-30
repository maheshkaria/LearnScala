// self reference
// this keyword refers to current instance

class Rational(val n: Int, val d: Int) {

  override def toString: String = s"R($n/$d)"

  def min(other: Rational): Rational =
    if ((n.toDouble / d) < (other.n.toDouble/other.d))
      this else other

  def add(other: Rational): Rational =
    new Rational(n * other.d + d * other.n, d * other.d)

}

val half = new Rational(1, 2)
val fifth = new Rational(1, 5)

val smaller = fifth min half
val sum = fifth add half

print(smaller)

print(sum)