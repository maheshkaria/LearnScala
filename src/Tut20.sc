// scala doesn't have operator overloading however we can create method name using symbols
// for example following add method we can replace with symbol +

class Rational(val n: Int, val d: Int) {

  override def toString: String = s"R($n/$d)"

  def min(other: Rational): Rational =
    if ((n.toDouble / d) < (other.n.toDouble/other.d))
      this else other

//  def add(other: Rational): Rational =
//    new Rational(n * other.d + d * other.n, d * other.d)

    def +(other: Rational): Rational =
      new Rational(n * other.d + d * other.n, d * other.d)


}

val half = new Rational(1, 2)
val fifth = new Rational(1, 5)

val smaller = fifth min half
val sum = fifth + half

print(smaller)

print(sum)