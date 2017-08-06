package simulatedAnnealing;

import java.util.ArrayList;
import java.util.List;

public class Repository {
	private static List<City> cities = new ArrayList<>();
	
	public void addCity(City c){
		cities.add(c);
	}
	public static City getCity(int index){
		return cities.get(index);
	}
	public static int numberOfCities(){
		return cities.size();
	}
}
