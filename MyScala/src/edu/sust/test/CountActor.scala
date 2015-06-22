package edu.sust.test

import scala.actors.Actor
import edu.sust.test.MyCount

/**
 * Created by envy15 on 2015/6/22 0022.
 */
class CountActor  extends Actor{
   def act()={
     while(true){
       receive{
         case  MyCount("",) =>
       }
     }
   }
}
