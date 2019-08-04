//package fain.simple.loop;
//
//// Exception Test, first look
//
//import java.awt.event.*;
//
//public class ExceptionMeet {
//
//    void actionPerformed(ActionEvent e) {
//        try {
//            bikeOrder.checkOrder("Firebird ", quantity);
//            //следующая строка не выполняется в случае исключения
//            txtFieldOrderConfirmation.setText("размещение вашего заказа завершено");
//        } catch (ToManyBikesException e) {
//            txtFieldOrderConfirmation.setText(e.getMessage());
//        }
//    }
//
//    void checkOrder(String bikeModel, int quantity) throws ToManyBikesException {
////        some code here
//        throw new ToManyBikesException(" No possible" + quantity + "model" + bikeModel + " one delivery");
//    }
//
//   /*  ExceptionMeet() {
//         divideByZero();
//    }
//        int divideByZero (){
//         return 25 / 0;
//        }
//        /*public void getScores(){
//         try {
//             fileScores.read();
//             System.out.println(" good ");
//         } catch (IOException e) {
//            System.out.println(" bad " + e.getMessage());
//         }
//         }
//         */
//
//      public  static void main (String[] args){
//         new ExceptionMeet();
//        }
// }
