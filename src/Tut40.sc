// partial application of function
// basically it means partially apply a function without all params and then apply remaining function later with remaining params

// we can partially apply params to not just one two but even all params

val add3Nums = (a: Int, b: Int, c: Int) => c + b + a

val add6and3 = add3Nums((_: Int), (_: Int), (_:Int))

print(add6and3(5,6,7))





