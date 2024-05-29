// re-writing or infix expressions

1 + 2

// above expression can be written as follows too

1.+(2) // <--- it is called as infix expression

val s = "hello"
s.charAt(1) // <--- infix expression

List(1, 2 , 3).map(_ * 2) // <--- infix

List(1, 2, 3) map {_ * 2} // <-- non infix

println("helloworld")

// println "helloworld" //this wont work

System.out println "hellowolrd" // this will work

// Following both statements are same // rewriting apply expressions
val args = Array("Mahesh", "Karia")
Array.apply("Mahesh", "Karia")

// we cam get elements from array using apply method as well as shown
println(args(0))
println(args.apply(0))


//re-writing rules for update
args(1) = "Test" // update returns unit so it wont have anything in return
args.update(0, "Test 0") // update returns unit so it wont have anything in return

args





