package task2;

public class Engine {
    private double mileage;
    private boolean started;
    private double capacity;

    public Engine(double mileage, double capacity){
        this.mileage = mileage;
        this.capacity = capacity;
    }

    public double getMileage(){
        return mileage;
    }

    public void addMileage(double mileage){
        if(started)
            this.mileage += mileage;
    }

    public boolean isStarted(){
        return started;
    }

    public void turnOn(){
        started = true;
    }

    public void turnOff(){
        started = false;
    }


    public double gasolineConsumption (){
        return (capacity * mileage / 10);
    }

    public double getCapacity(){
        return capacity;
    }

}

