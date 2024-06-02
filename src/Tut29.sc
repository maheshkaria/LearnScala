// for expression rules
// Generator: Do not mix generators and futures
// Guard: controls filtering behavior so make sure conditions are correct
// inline-assiGnment: we can have inline assignment but ideally should be avoided
// Give or yield: if possible make sure your for expression returns something
// make use of maps and flatmap rather for expressions

// For expression is more than just loops
// we can use for with futures/try/option/either or any other type
import scala.concurrent._
import duration._
import ExecutionContext.Implicits.global

val f1 = Future(1.0)
val f2 = Future(2.0)
val f3 = Future(3.0)

val f4 = for {
  v1 <- f1
  v2 <- f2
  v3 <- f3
} yield v1 + v2 + v3

Await.result(f4, 10.seconds)