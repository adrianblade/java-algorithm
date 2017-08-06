package simulatedAnnealing;

import java.util.ArrayList;
import java.util.List;

public class SingleTravelManager {

    public static List<City> destinationCities = new ArrayList<>();
    public static int numOfCities = 0;

    public static void addCity(City city) {
        SingleTravelManager.destinationCities.add(city);
        SingleTravelManager.numOfCities++;
    }

    public static City getCity(int index) {
        return SingleTravelManager.destinationCities.get(index);
    }
}
