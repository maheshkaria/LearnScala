// classes/object/apps and more

// Define a scala class

// Following is having in default constructor (in scala constructor code goes in class and not in def)
class Tut15 {

  val x: Int = 10
  println("construction of object..")

  def times(): Int = { this.x }

}


val t = new Tut15
println(t.times())


// following parameterized constructor example
class Tut15ConstructorExample(name: String) {

  def sayHello(): Unit = {
    println(this.name)
  }


}


val t = new Tut15ConstructorExample("mahesh")

t.sayHello()
