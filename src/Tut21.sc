// how to create auxiliary constructor ?

class Rational(val n: Int, val d: Int) {

  override def toString: String = s"R($n/$d)"

  def this(i: Int) = this(i, 1) // this creates auxiliary constructor

  def min(other: Rational): Rational =
    if ((n.toDouble / d) < (other.n.toDouble/other.d))
      this else other

    def +(other: Rational): Rational =
      new Rational(n * other.d + d * other.n, d * other.d)


}

val half = new Rational(1, 2)
val fifth = new Rational(1, 5)

val sum = fifth + new Rational(1)

print(sum)
