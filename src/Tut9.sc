// scala collections

// Array is mutable
val array1: Array[Int] = Array.empty
val array2: Array[Int] = Array(1, 2, 3)

println(array1.size)
println(array2.size)


// List is immutable
val list1: List[String] = List("String1", "String2", "String3")
println(list1.size)

def lengthOfList(xs: List[Any]): Int = {
  xs.size
}

print(lengthOfList(list1))