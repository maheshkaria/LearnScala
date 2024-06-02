// partial application of function
// basically it means partially apply a function and then apply remaining function later

val add3Nums = (a: Int, b: Int, c: Int) => c + b + a

val add6and3 = add3Nums(6, (_: Int), 3)

print(add6and3(5))