package fain.simple.loop;

// Exception Test, first look

public class ExceptionMeet {

     ExceptionMeet() {
         divideByZero();
    }
        int divideByZero (){
         return 25 / 0;
        }
        /*public void getScores(){
         try {
             fileScores.read();
             System.out.println(" good ");
         } catch (IOException e) {
            System.out.println(" bad " + e.getMessage());
         }
         }*/

      public  static void main (String[] args){
         new ExceptionMeet();
        }
 }
