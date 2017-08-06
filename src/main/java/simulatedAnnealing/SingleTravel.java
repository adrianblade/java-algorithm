package simulatedAnnealing;

import java.util.ArrayList;
import java.util.List;

public class SingleTravel {

    private List<City> tourList;
    private int distance;

    public SingleTravel() {
        this.tourList = new ArrayList<>();
        for (int i = 0; i < SingleTravelManager.numOfCities; i++) {
            tourList.add(null);
        }
    }

    public SingleTravel(List<City> tourList) {
        this.tourList = tourList;
    }

    public List<City> getTourList() {
        return tourList;
    }

    public void setTourList(List<City> tourList) {
        this.tourList = tourList;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
