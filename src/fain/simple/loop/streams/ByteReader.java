//package fain.simple.loop.streams;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//
//public class ByteReader {
//
//    public static void main (String [] args) {
//        FileInputStream myFile = null;
//        try {
//// Открытие байтового потока, указывающего на файл
//            myFile = new FileInputStream("c:\\temp\\abc.gif ");
//            while (true) {
//                int intValueOfByte = MyFile.read();
//                System.out.print(" " + intValueOfByte);
//                if (intValueOfByte == -1) {
//                    // достигнут конец файла нужно выйти из цикла
//                    break;
//                }
//            }  // конец цикла while} // конец цикла while
//            // myFile.close(); не помещайте этот вызов здесь
//        } catch (IOException e) {
//            System.out.println("No possible to read file: " + e.toString());
//        } finally {
//            try {
//                myFile.close();
//            } catch (Exception e1) {
//                e1.printStackTrace();
//            }
//            System.out.println("Sucsess read");
//            }
//        }
//    }
