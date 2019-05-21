/*class TapeDeck {
    boolean canRecord = false; void playTape() {
        System.out.println("пленка проигрывается");
    }
    void recordTape() {
        System.out.println("идет запись на пленку");
    }
}
class TapeDeckTestDrive {
   public static void main(String[] args) {
        TapeDeck t = new TapeDeck();
       t.canRecord = true;
        t.playTape();
        if (t.canRecord == true) {
            t.recordTape();
        }
Byte x = 255;
        x= x + 1;
        System.out.println(x);
    }
}
*/

// Сила тяжести на Луне составляет около 17% земной. Напишите программу,
//которая вычислила бы ваш вес на Луне.

class Moon {
    public static void main(String args[]) {
        double earthweight; // вес на Земле
        double moonweight; // вес на Луне
        earthweight =51; // вес на Земле в киллограммах
        moonweight = earthweight * 0.17;
        System.out.println(earthweight + " земных киллограмма эквивалентны " + moonweight +
                        " лунным киллограммам.");
    }
}