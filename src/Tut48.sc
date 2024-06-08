// Function arity
// Function have an arity, which means the number of input parameters
// scala limits number of params to 22

import scala.util.Random

val sq: Int => Int = x => x * x // Function1[Int, Int] this function has arity 1 as it takes only one param

val add: (Int, Int) => Int = (a, b) => a + b // Function2[Int, Int, Int] this function has arity 2 as it takes two param

val mul3: (Int, Int, Int) => Int = _ * _ * _ // Function3[Int, Int, Int, Int] this function has arity 3 as it takes three param

// function which doesn't take any parameter has arity 0 or also called as function0


val makeARandom: () => Double = () => Random.nextDouble()

// we can create same function using function arity as shown though following syntax is not encouraged

val makeARandomArity: Function0[Double] = () => Random.nextDouble()