// preconditions in scala
// It basically checks if inputs are correct, if they aren't correct we get illegal argument exception

class Rational(val a: Int, val d: Int) {
  require(d > 0, "reason for fail")


}

val r = new Rational(1,0)

print(r)
