import scala.util.{Failure, Success, Try}

def stringToInt(str: String) : Option[Int] = {
  Try(str.toInt) match {
    case Success(i) => Some(i)
    case Failure(_) => None
  }
}

println(List("hola", "1", "2", "4").flatMap(stringToInt))

