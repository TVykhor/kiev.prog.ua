package task2;

public class Main {
    public static void main(String[] args){
        Engine bmwEngine = new Engine(0, 2.5);
        Car bmw = new Car("bmw", bmwEngine);

        Engine ferrariEngine = new Engine(0, 6.2);
        Climate ferrariClimate = new Climate();
        Car ferrari = new Car("ferrari", ferrariEngine, ferrariClimate);

        bmw.turnOn();
        ferrari.turnOn();

        final int[] speeds = new int[] {20, 60, 100};

        for(int s: speeds) bmw.start(s, 0.5);
        for(int s: speeds) ferrari.start(s, 1);

        bmw.turnOff();
        ferrari.turnOff();

        System.out.println(bmw.getName()+":\nmileage: "+bmw.getMileage()+" km");
        System.out.println("gasolineConsumption: "+bmw.getGasolineConsumption()+" l\n");
        System.out.println(ferrari.getName()+":\nmileage: "+ferrari.getMileage()+" km");
        System.out.println("gasolineConsumption: "+ferrari.getGasolineConsumption()+" l");

    }
}
