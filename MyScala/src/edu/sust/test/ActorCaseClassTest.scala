package edu.sust.test

import scala.actors.Actor
import scala.actors.Actor._

/**
 * Created by envy15 on 2015/6/28 0028.
 */

object ActorCaseClassTest {


  case class Add(number: Int)

  case class GetResult(selfActor: Actor)

  class ActorCaseClassTest extends Actor {
    var selfActor: Actor = null;


    def act: Unit = process(0)

    def process(number: Int): Unit = {
      reactWithin(500) {
        case Add(value) => process(number + value)
        case GetResult(a) => a ! number; process(number)
        case _ => process(number)
      }
    }
  }

  def main(args: Array[String]) {

    val acct = new ActorCaseClassTest;
    acct.start();
    acct ! Add(1)
    acct ! Add(2)
    acct ! Add(3)
    acct ! GetResult(self);
    receiveWithin(500) {
      case result => println("Total is " + result)
    }

  }
}