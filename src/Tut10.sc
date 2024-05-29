// scala collections

// Both list and array are subset of sequence

print(Seq(1,2,3)) // this will create an immutable list

val a1: Seq[Int] = Array(1,2,3)

println(a1) // this will be created as an array

// There are many more sequence types

// 1. vector // its immutable and very much efficient sequence compared to other lists/array
val v1 = Vector(1,2,3)
println(v1)

// we can pass vector/array/list wherever input is expected to be sequence