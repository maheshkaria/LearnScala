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