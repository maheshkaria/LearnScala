// self reference
// this keyword refers to current instance

class Rational(val n: Int, val d: Int) {

  override def toString: String = s"R($n/$d)"

  def min(other: Rational): Rational =
    if ((n.toDouble / d) < (other.n.toDouble/other.d))
      this else other
}

val half = new Rational(1, 2)
val fifth = new Rational(1, 5)

val smaller = fifth min half

print(smaller)