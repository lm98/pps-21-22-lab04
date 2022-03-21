package u04lab.polyglot.a01a
import Logics.*
import u04lab.code.List.*
/** solution and descriptions at https://bitbucket.org/mviroli/oop2019-esami/src/master/a01a/sol2/ */
class LogicsImpl(private val size: Int, private val boat: Int) extends Logics:
  //1. creo nave random
  //.2 implemento hit

  def hit(row: Int, col: Int) =
    Result.HIT
