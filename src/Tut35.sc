// functions - function literals or lambda or anonymous function

def mulFunction(a: Int,b: Int): Int = a * b

print(mulFunction(5, 6))


val mulFunLambda = (a: Int, b: Int) => a * b // example of literal function or lambda

print(mulFunLambda(5,6))

// where to use anonymous functions ?
// while using data filter methods instead of creating a method we can have anonymous function

val nums = 1 to 10
print(nums.filter(i => i % 2 == 0))
print(nums.map(i => i * 3))

// how function literals work ?
// behind the scenes it uses lambda of Java
