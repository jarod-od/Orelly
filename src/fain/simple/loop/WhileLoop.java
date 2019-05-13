package fain.simple.loop;

public class WhileLoop {
    public static void main(String[] args) {
        String[] friends = new String[20];
        friends[0] = "Dima";
        friends[1] = "Sasha";
        friends[2] = "Borya";
        friends[3] = "Siroja";
        friends[18] = "Vova";
        friends[19] = "Ben";

        int totalFriends = friends.length;
        int i = 0;

        while (i < totalFriends) {
            if (friends[i] == null) {//если элемент массива без номера, то увеличь значение на 1 и вернись в начало условия цикла
                i++;
                continue;
            }
            System.out.println("My bro is " + friends[i]);
            i++;
        }
        System.out.println("Peace to everybody");
    }
}


