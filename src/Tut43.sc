// args and var args
//


// in following example names is variable argument which can take multiple values and we can iterate over it as shown
// pls note that var args should be last argument in function definition if there are multiple params
// also variable argument is optional so you can call such functions without providing that value
def sayHello(names: String*): Unit = {
  for (name <- names) {
    println(s"Hello $name")
  }
}

sayHello()

sayHello("mahesh")

sayHello("A", "B", "c")

val names = List("D", "E", "F")

// we can pass list of names as shown below while passing value to variable argument
sayHello(names: _*) // _* will unpack list and pass as param