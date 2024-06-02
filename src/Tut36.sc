// functions - other useful functions

val fn1: (Int, Int) => Int = (a, b) => a + b

val fn1curried = fn1.curried
// curried basically returns new function from old function on which we can apply a param
// in following example fn1curried is curried function fn1 on which when we apply (2) it returns again a function
// on which we can apply second param and so on.. once all params are applied actual function fn1 gets executed
print(fn1curried(2)(3))

// we can pass variable as tuple using tupled as shown
val fn1tupled = fn1.tupled
val tup = (2, 3)

fn1tupled(tup)
