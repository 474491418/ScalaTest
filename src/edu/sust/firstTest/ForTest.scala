package edu.sust.firstTest

import java.util.Scanner

/**
 * Created by envy15 on 2015/2/22 0022.
 */
class ForTest {
  //
  //  val list = List(1, 2, 3, 4, 5, 6);
  //  for (l <- list if l%2==0) println(l)
// var sc=new Scanner(System.in);
// val say=sc.nextLine();
//  print(say)
//val say="salt";
  val say =readLine("What do you want:");
  val firstArg = if (say.length > 0) say else "";

  val friend = firstArg match {
  case "salt" => "pepper"
    case "chips" => "salsa"
     case "eggs" => "bacon"
    case _ => "huh?"
   }
  println(friend)

}

object ForTest {
  def main(args: Array[String]) {

    new ForTest();
  }
}
