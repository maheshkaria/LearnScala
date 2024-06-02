// partial application of function
// basically it means partially apply a function without all params and then apply remaining function later with remaining params

val add3Nums = (a: Int, b: Int, c: Int) => c + b + a

val add6and3 = add3Nums(6, (_: Int), 3)

print(add6and3(5))