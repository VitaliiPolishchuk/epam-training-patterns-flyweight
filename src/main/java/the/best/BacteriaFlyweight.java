package the.best;

import java.util.Random;

public class BacteriaFlyweight {
    BacteriaUniqueState uniqueState;
    private double speed;

    public BacteriaFlyweight(BacteriaUniqueState uniqueState) {
        this.uniqueState = uniqueState;
        speed = Math.random();
    }
}
