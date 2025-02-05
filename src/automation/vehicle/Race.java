package automation.vehicle;

import automation.vehiclebike.Bike;

public class Race {
    public static void main(String[] args) {
        Car volvo = new Car();
        volvo.showSpeed();
        volvo.increaseSpeed(50);
        volvo.showSpeed();
        volvo.increaseSpeed(20);
        volvo.showSpeed();

        Bike crescent = new Bike();
        crescent.showSpeed();
        crescent.nbrOfGears(5);
        crescent.increaseSpeed(100,4);
        crescent.showSpeed();
    }

}
