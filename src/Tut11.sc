import scala.collection._

// scala collections

// array/list/vector are ordered sequence and allows duplicate elements

// there is another collection i.e. Set which doesn't maintain order but it maintains only unique elements

print(Set(1,2,4,5,4,1,3,2,4,8,9))

// array is mutable
print(new Array[String](3)) // creates an array with null values

// list and vector are immutable so we need to create new using existing variable every time and assign it to existing list everytime

// sets are mutable as well as immutable
val m1 = mutable.Set(1,2,3)
var m2 = immutable.Set(5,6,7)

m1.add(5)
m2 += 10 // this basically created new set and assigned it to var m2

print(m1)
print(m2)


// var and mutable collection are never recommended to use together
// either you use var or mutable collection as a thumb rule
