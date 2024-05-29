import scala.collection._

// just like set map doesn't guarantee order and maintains only unique key
// -> associates a key to value and returns as tuple
print("hello" -> 88)


print("hello".reverse)

// how to iterate over map ?

val s1 = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)


for ((k,v) <- s1) {
  println(s"$k and $v")
}
