// expressions vs statements
// expression has return value while statement doesn't
// in scala we dont have void keyword so everything need to have a return type and statement has return type Unit

1 + 2 // expression return type int

print("hello") // statement with return type Unit

// Unit
// Unit return type implies that method doesn't have anything to return
// i.e. method mostly be doing IO operation or setting up or updating variable
// Unit is sometimes referred as empty tuple ()
// Unit is descended from AnyVal like other primitives

// Alternative to returning unit
// if we want to have fluent API we can return this instead of Unit

// if expression in Scala
// In scala we dont have ternary operator like Java
// In Scala if is expression i.e. it can return value

val x = if (1 > 0) 1 else 0 // it will return and assign val 1 to x

// try... catch ...finally... too are expression in scala

val args = Array.empty[String]

val fileName1 =
  try {
    args.head // throws exception as array is empty
  } catch {
    case _: NoSuchElementException => "localfile.txt"
  } finally {
    println("finally block")
    "result" // even though finally block is expression to but its returned value is never used
  }