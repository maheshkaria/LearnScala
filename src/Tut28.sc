// For expression works of some items it can be sequence or options or futures

// for/foreach returns unit when there is no yield


for (i <- 1 to 10) {
  println(i)
}

(1 to 10).foreach(i => {
  println(i)
})

(1 to 3).foreach(i=> (i to 3).foreach(j=> {println(i*j)}))

for (i <- 1 to 3;  j <- 1 to 3) {
  println(i*j)
}


for {
  i <- 1 to 3
  j <- 1 to 3} {
  println(i*j)
}


// For.. yield
// yield basically returns something while iterating
val x = for (i <- 1 to 10) yield i
println(x) // type of x is Vector/sequence

(1 to 10).map(i => i * i) // map function does same thing as of for and yield combined.. map returns vector type

val res = for (i <- 1 to 3; j <- 1 to 3) yield i * j
print(res)

// when we are iterating over sequence at that we should be flatMap instead of Map
(1 to 3).flatMap(i => (1 to 3).map(j => i*j ))