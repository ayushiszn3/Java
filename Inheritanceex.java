class Bicycle{
    public int gear;
    public int speed;

    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }
    public void applybreak(int dec)
    {
        speed -= dec;
    }
    public void speedup(int inc)
    {
        speed += inc;
    }
    public void info()
    {
        System.out.println("the speed of the bicycle is"+ speed + "and no. of gears are"+ gear);

    }
}
class MountainBike extends Bicycle {
    public int seatHeight;
    public MountainBike( int gear, int speed, int startheight)
    {
        super(gear, speed);
        seatHeight = startheight;
    }
    public void startheight(int newValue)
    {
        seatHeight = newValue;
    }
    @Override public String toString()
    {
        return (super.toString()+ "\nseat height is" + seatHeight);
    }
}
public class Inheritanceex {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(30, 120, 40);
        System.out.println(mb.toString());
    }
}
