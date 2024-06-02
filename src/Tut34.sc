// functions - scoping in nested methods
// in inner nested method we can access val or var of outer method directly

import scala.annotation.tailrec

object FactSeq {
  def factSeq(n: Int): List[Long] = {
    @tailrec
    def factSeqInner(acc: List[Long], ct: Int): List[Long] = {
      if (ct > n) acc else factSeqInner( ct * acc.head :: acc, ct + 1)
    }

    factSeqInner(List(1L), 2)
  }
}

FactSeq.factSeq(8)