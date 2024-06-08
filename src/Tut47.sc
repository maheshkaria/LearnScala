// Generic curried function

import scala.io.Source
import java.io.File

// in following function A is generic type is curried rest remains same as previous example

def withFileContents[T](file: File, default: T)(fn: String => T): T = {
  val source = Source.fromFile(file)
  try {
    source.getLines().toSeq.headOption.map { line =>
      fn(line)
    }.getOrElse(default)
  } finally source.close()
}

// we
val my_file = new File("C:\\Users\\pc\\IdeaProjects\\LearnScala\\src\\localfile.txt")
withFileContents(my_file, false)(_.trim.endsWith("?"))
withFileContents(my_file, "")(_.trim.toUpperCase)