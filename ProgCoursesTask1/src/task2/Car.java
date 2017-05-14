package task2;

public class Car {

    private String name;
    private Engine engine;
    private Climate climate;

    public Car (String name, Engine engine){
        this.name = name;
        this.engine = engine;
    }

    public Car (String name, Engine engine, Climate climate){
        this.name = name;
        this.engine = engine;
        this.climate = climate;
    }

    public String getName(){
        return name;
    }

    public double getMileage(){
        return engine.getMileage();
    }

    public void turnOn(){
        engine.turnOn();
        if(climate != null) {
            climate.turnOn();
            climate.setTemperature(21);
        }
    }

    public void turnOff(){
        engine.turnOff();
        if (climate != null){
            climate.turnOff();
        }
    }

    public void start (int speed,double hours){
        //если мотор заведен
        if(engine.isStarted()){
            double distance = hours * speed;
            engine.addMileage(distance);
        }
    }

    public double getGasolineConsumption(){
        return this.engine.gasolineConsumption();
    }
}
