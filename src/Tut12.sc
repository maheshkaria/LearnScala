import scala.collection._

// scala collections
// maps are basically key value pair and like set it has both mutable and immutable implementations

val s1 = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)

var s2 = immutable.Map("e" -> 9, "r" -> 5, "s" -> 6)

print(s1 ++= s2)

println(s2)


s2 += "x" -> 8

print(s2)

s1 + "r" -> 5

print(s1)