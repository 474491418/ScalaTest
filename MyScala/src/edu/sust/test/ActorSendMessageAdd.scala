package edu.sust.test

import scala.actors.Actor._
import scala.actors.TIMEOUT

/**
 * Created by envy15 on 2015/6/28 0028.
 * 以消息传递为核心的设计：使用Actor的actor方法，使用不可变对象，不考虑数据共享问题，以消息传递为设计核心。
 */
class ActorSendMessageAdd {

}

object SendMessageStyle {

  def main(args: Array[String]): Unit = {
    val caller = self
    val accumulator = actor {
      var continue = true
      var sum = 0
      loopWhile(continue) {
        //react在while中会死循环，所以只能用loop或者loopWhile什么的
        reactWithin(500) {
          case number: Int => sum += number
          case TIMEOUT =>
            continue = false
            caller ! sum

        }

      }

    }
    accumulator ! 1
    accumulator ! 2
    accumulator ! 3
    accumulator ! 4
    receiveWithin(1000) {
      case result => println("Total is " + result)

    }

  }
}