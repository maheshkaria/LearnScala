
// when we provide both data type for input and output its called as fully typed
def max(x: Int, y: Int): Int = if (x > y) x else y

// however its good practice but not mandatory in scala to provide return type, compiler can infer return type by evaluating expressions
def max2(x: Int, y: Int) = if (x > y) x else y

// for params its mandatory to have type