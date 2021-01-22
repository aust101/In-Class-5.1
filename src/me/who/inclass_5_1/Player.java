package me.who.inclass_5_1;

public class Player {
    private final String name, gender;
    private double x, y, z;
    public Player(String name, String gender, double x, double y, double z) {
        this.name = name;
        this.gender = gender;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String getName() {
        return name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public boolean isWithin(double x, double y, double z, double distance) {
        return  (this.x <= (x + distance) && this.x >= (x - distance)) &&
                (this.y <= (y + distance) && this.y >= (y - distance)) &&
                (this.z <= (z + distance) && this.z >= (z - distance));
    }


    public String getLocation() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    @Override
    public String toString() {
        return "Player{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

}
