public class BeerSong {
    public static void main (String [] args){
      /*  int x = 1;
        while (x < 3) {
            System.out.print("Do");
            System.out.print("Be");
            x = x + 1;
        }
        if (x == 3){
            System.out.print("Do");
        }
    }*/
        int numBeer = 4;
        String word = " бутылки";
        while (numBeer > 0) {

            if (numBeer == 1) {
                word = " бутылка";
            }
            System.out.println(numBeer + " " + word + " пива на стене" );
            System.out.println(numBeer + " " + word + " пива." );
            System.out.println("Возьми одну. " );
            System.out.println("Пусти по кругу. " );
            numBeer = numBeer - 1;

            if (numBeer == 0) {
//                System.out.println(numBeer + " " + word + " пива на стене" );}
//            else {
                System.out.println("Нет бутылок на столе");
            }
        }
        }
}
