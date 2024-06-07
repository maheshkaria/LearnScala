// closures
// all closures are function literal (lambda) but not all function literals are closures
// a closure is so-called because it encloses around some other state than that passed into the function params

val incBy1 = (x: Int) => x + 1 // it is not closure but lambda/function literal

val more = 10
val incByMore = (x: Int) => x + more // closure here this function is using value of more val i.e. state outside the function so its called as closure

incByMore.apply(10)

/////////////////////////

// avoid using var with closure

