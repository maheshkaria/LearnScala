// named and default params

def greet(name: String): String = {
  s"hello $name"
}

greet("name") // default params, make sure order of params are correct

greet(name = "test-name") // named params, order can be changed as values which will be passed to correct variable

// named parameters are encouraged and it tells more about code if you are aware about params, makes code more readable