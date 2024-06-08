// Generic type and HOFs
import scala.io.Source
import java.io.File

// in following function A is generic type
// A is type parameter and can be inferred
// We can supply a function literal from String => A to the function
// We also can provide fallback default value

def withFileContents[T](file: File, fn: String => T, default: T): T = {
  val source = Source.fromFile(file)
  try {
    source.getLines().toSeq.headOption.map { line =>
      fn(line)
    }.getOrElse(default)
  } finally source.close()
}


val my_file = new File("C:\\Users\\pc\\IdeaProjects\\LearnScala\\src\\localfile.txt")
withFileContents(my_file, _.trim.endsWith("?"), false)
withFileContents(my_file, _.trim.toUpperCase, "")