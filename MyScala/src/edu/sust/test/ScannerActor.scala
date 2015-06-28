package edu.sust.test

import scala.actors.Actor._
import scala.actors.{Actor, TIMEOUT}

/**
 * Created by envy15 on 2015/6/27 0027.
 */
class ScannerActor extends Actor {


  override def act(): Unit = {


  }
}

object ScannerActor {
  def main(args: Array[String]) {
    val caller = self
    val sca = actor {
      var flag = true
      loopWhile(flag) {
        reactWithin(500) {
          case TIMEOUT => flag = false; caller ! 10;
          case number: Int => println(number)
          case "Hi" => println("hi" + Thread.currentThread().getName);
          case "bye" => exit();

        }
      }
    }


    sca ! "Hi"
    sca ! 1
    sca ! "Hi"
    receiveWithin(1000) {
      case result => println("结果是：" + result)
    }
  }
}