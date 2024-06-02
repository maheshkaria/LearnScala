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
