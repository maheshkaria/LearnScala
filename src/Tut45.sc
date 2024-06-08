// use contents of a file
import java.io.File
import scala.io.Source

def fileContainsQuestions(file: File): Boolean = {
  val source = Source.fromFile(file)

  try {
    source.getLines().toSeq.headOption.map {
      line => line.trim.endsWith("?")
    }.getOrElse(false)
  }
  finally source.close()
}

def emphasizeFileContents(file: File): String = {
  val source = Source.fromFile(file)

  try {
    source.getLines().toSeq.headOption.map { line =>
      line.trim.toUpperCase
    }.getOrElse("")
  }
  finally source.close()
}

val my_file = new File("C:\\Users\\pc\\IdeaProjects\\LearnScala\\src\\localfile.txt")

fileContainsQuestions(my_file)

emphasizeFileContents(my_file)

// if you see in above examples there is no code re-use.. we are reading and validating after reading from a file
// apart from condition and return type most of the code is identical in both the functions




