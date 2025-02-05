package automation.vehiclebike;

import automation.vehicle.Vehicle;

public class Bike extends Vehicle {
    int nbrOfGears;

    public void nbrOfGears(int nbr) {
        this.nbrOfGears = nbr;
    }

    public void increaseSpeed(int force,int gear){
        super.speed = force*nbrOfGears*(10+(40/nbrOfGears*gear))/32/10;
    }
}
