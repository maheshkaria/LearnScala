// functions - nested method just like every other language we can have nested method inside another method
// however a method can not be protected or private if its inside another method
// inner method is inherently private as its scope is limited to outer method

import scala.annotation.tailrec

object FactSeq {
  def factSeq(n: Int): List[Long] = {
    @tailrec
    def factSeqInner(n: Int, acc: List[Long], ct: Int): List[Long] = {
      if (ct > n) acc else factSeqInner(n, ct * acc.head :: acc, ct + 1)
    }

    factSeqInner(n, List(1L), 2)
  }
}

FactSeq.factSeq(8)