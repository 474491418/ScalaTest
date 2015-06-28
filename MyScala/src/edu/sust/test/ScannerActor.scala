package edu.sust.test

import java.util.Scanner

import scala.actors.Actor;

/**
 * Created by envy15 on 2015/6/27 0027.
 */
class ScannerActor extends Actor {


  override def act(): Unit = {
    var flag = true
    while (flag) {
      react {
        case Some(mes) => println(mes.toString);
        case "Hi" => println("hi" + Thread.currentThread().getName);
        case "bye" => exit();

      }
    }
  }
}

object ScannerActor {
  def main(args: Array[String]) {
    val sca = new ScannerActor();
    sca.start();
    while (true) {


      var sc: Scanner = new Scanner(System.in);
      println("请输入")
      val messageIn = sc.nextLine();
      sca ! messageIn;

    }

  }
}