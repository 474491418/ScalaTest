package edu.sust.test

import scala.actors.Actor

/**
 * Created by envy15 on 2015/6/22 0022.
 */
class CountActor extends Actor {
  def act() = {
    while (true) {
      receive {
        case MyCount(name, money, sex) => println(name + " is saving money: " + money + " ," + name + " is " + sex)
          val act1 = new MyActor
          act1.start()
          act1 ! "Hi"
      }
    }
  }
}
