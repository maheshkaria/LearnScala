// tuple example
def sumAndDifference(a: Int, b: Int): (Int, Int) = {
  (a + b, a -b)
}

val res = sumAndDifference(5, 6)
// we can refer result of tuples using _1 .. _2 and so on
println(res._1)
println(res._2)

val tup5 = (0, "f", 1.0, 55, "too")
println(tup5._1)
println(tup5._2)
println(tup5._3)
println(tup5._4)
println(tup5._5)

// we can unpack tuple as follows
val (a, b, c, d, e) = tup5
println(a)
println(b)
println(c)
println(d)
println(e)

// tuple has limitation of holding 22 items only and they are immutable