// classes/object/apps and more

// Class example and methods

class Rational(val n: Int, val d: Int) // <- this is perfectly valid class


class Rational2(val n: Int, val d: Int) {

  override def toString: String = "Test"

}


val r = new Rational2(1,2)

print(r.toString)