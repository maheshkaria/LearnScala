// create your own while loop

import scala.annotation.tailrec

@tailrec
def fruitLoop(pred: => Boolean)(body: => Unit): Unit = {
  if (pred) {
    body
    fruitLoop(pred)(body)
  }
}

var y = 0
fruitLoop(y < 5) {
  println(y*y)
  y += 1
}

// by-name functions are discouraged and function0 are encouraged over it
// by-name functions are those functions which we can invoke just by name without explicit brackets around it like this ()
