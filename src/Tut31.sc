// string interpolation

val x = 10

val y = 2.12

val name = "mahesh"

print(s"$name $x $y")

print(s"${x * y}") // output -> 21.200000000000003

print(f"${x * y}%08.4f") // output -> 21.2000


print(f"${name}s")

println(s"\t\t\tmahesh\t\t\tkaria\t\n\t\t\n\t\t\ttest")


// docstring/multiline string
val s = """ I can have multiple lines
  | like this
  |for example
  |
  |
  |""".stripMargin

println(s)