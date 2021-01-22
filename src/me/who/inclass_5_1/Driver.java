package me.who.inclass_5_1;

public class Driver {
    private static final double X = -3, Y = -2, Z = -1, DISTANCE = 5;

    public static void main(String[] args) {
        Player[] players = {
                new Player("_Who", 10, 0, 2),
                new Player("Nate", 4.99, 0, 0),
                new Player("Gold_Noobs", 1, 3, 1)
        };
        for (Player player : players) {
            print(player);
        }
    }

    public static void print(Player player) {
        System.out.println(player.getName() + " " + player.getLocation() + " [IS" + (player.isWithin(X, Y, Z, DISTANCE)  ? " " : " NOT") + " WITHIN]");
    }

}
