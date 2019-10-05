package the.best;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<BacteriaFlyweight> bacteriaColony;
    static BacteriaUniqueState bacteriaUniqueState;

    public static void main(String[] args) {

        bacteriaUniqueState = new BacteriaUniqueState();
        bacteriaColony = new ArrayList<>();

        for(long t = 1, i = 0; i < 20; t *= 2, ++i){
            for(int j = 0; j < t; ++j) {
                bacteriaColony.add(new BacteriaFlyweight(bacteriaUniqueState));
            }
            System.out.println("Total count of bacteria colony is " + bacteriaColony.size());
        }
    }
}
