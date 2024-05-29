// scala collections

// Array is mutable
val array1: Array[Int] = Array.empty
val array2: Array[Int] = Array(1, 2, 3)

println(array1.size)
println(array2.size)


// List is immutable
val list1: List[String] = List("String1", "String2", "String3")
println(list1.size)


// Any type will accept any type int/float/string etc
def lengthOfList(xs: List[Any]): Int = {
  xs.size
}

print(lengthOfList(list1))

// we can create empty list as fowllows

print(Nil.::(1)) // this will create new list and add 1 in it

print(Nil.::(1).::(2)) // this will create new list and add 2 and 1 in it

// we can concat 2 list as shown

val x1 = List(1,2,3)
val x2 = List(4,5,6)

print(x1 ::: x2)



