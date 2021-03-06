package edu.sust.test

import scala.actors.Actor
import scala.actors.Actor._
/**
 * Created by envy15 on 2015/6/22 0022.
 */
class MyActor extends Actor {
  def act() = {
    while (true) {
      receive {
        case "Hi" => println("Hi you")
      }
    }
  }
}

object MyActor {
  def main(args: Array[String]) {
    val act1 = new MyActor();
    val act2 = actor {
      while (true) {
        receive {
          case "Hello" => println("Hello you")
          case number => print(number)
        }
      }
    }
    val act3 = new CountActor;
    act3.start();
    act3 ! new MyCount("Bob", 20, "男");
    //act1.start();
    //act1 ! "Hi"
  }
}
