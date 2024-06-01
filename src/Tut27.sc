import scala.annotation.tailrec
// while loop always returns Unit

var x = 0
while (x < 5) {
  x += 1
  println(s"hello $x")
}

// in scala while loops and var are discouraged and we can use tailrec (tail recursion)

@tailrec
def greet(n: Int, curr: Int = 0): Unit = {
  if (curr < n) {
    println(s"hello $curr")
    greet(n, curr + 1)
  } else ()
}

greet(5)