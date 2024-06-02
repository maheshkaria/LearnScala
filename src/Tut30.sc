// match expressions

val x = 1
// match is similar switch of java
x match {
  case 1 => println("its one")
  case 2 => println("its two")
  case _ => println("its something else")
}

// match is expression so we can return result like this
val res = x match {
  case 1 => "one"
  case 2 => "two"
  case _ => "something else"
}
println(res)

// match with gurards
val n = -1

val res1 = n match {
  case 0 => "zero"
  case v if v > 0 => "positive"
  case _ => "negative"
}

println(res1)

// different examples of match

def matchIt(x: Any): String = x match {
  case "hello" => "hello world"
  case 1:: rest => s"list starting with one $rest"
  case Nil => "empty list"
  case 5 => "number 5"
  case _: List[_] => "some kind of list, not 1 not empty"
  case _=> "something bad"

}



print(matchIt(5))
print(matchIt(List(1,2,3)))
print(matchIt(List(1)))
print(matchIt(List(2,3)))
print(matchIt(Nil))
print(matchIt(2.0))
