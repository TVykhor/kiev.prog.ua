/**
 * Created by TVykhor on 29.03.2017.
 */
public class Car {
    private int speed; //speed = 0
    private boolean engineStarted; //engineStarted=false

    public void startEngine(){
        engineStarted = true;
    }

    public void stopEngine(){
        engineStarted = false;
    }

    public void startMove() {
        startEngine();
        speed += 10;
    }

    public void stopMove(){
        stopEngine();
        speed = 0;
    }

    public void setSpeed(int speed){
       this.speed = speed;
    }

    public int getSpeed(){
        return speed;
    }

    public static void main(String [] args){
        Car c = new Car();
        c.startMove();
        System.out.println("data after car started moving: \nengineStarted: " + c.engineStarted);
        System.out.println("speed: " + c.speed);
        c.stopMove();
        System.out.println("data after car stopped moving: \nengineStarted: " + c.engineStarted);
        System.out.println("speed: " + c.speed);
    }
}
