import scala.io.Source

// mutability vs functional style guidelines
// aim for expressions, vals and immutability whenever possible
// use vars and mutability for performance and other factors
// we dont need mutable var instead choose mutable val or immutable var
// keep methods short and uncomplicated, separate early and often
// avoid mutability get into APIs it can have performance related consequences


for (line <- Source.fromFile("localfile.txt")) {
  println(line)
}