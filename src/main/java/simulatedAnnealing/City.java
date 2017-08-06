package simulatedAnnealing;

public class City {

	private String cityName;
	private int coordinateX;
	private int coordinateY;

	public City(String cityName, int coordinateX, int coordinateY) {
		this.cityName = cityName;
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getCoordinateX() {
		return coordinateX;
	}

	public void setCoordinateX(int coordinateX) {
		this.coordinateX = coordinateX;
	}

	public int getCoordinateY() {
		return coordinateY;
	}

	public void setCoordinateY(int coordinateY) {
		this.coordinateY = coordinateY;
	}

	/**
	 * Eucledian distance
	 * @param city
	 * @return
	 */
	private double distanteTo(City city) {
		int xDistance = Math.abs(this.coordinateX-city.getCoordinateX());
		int yDistance = Math.abs(this.coordinateY-city.getCoordinateY());
		return Math.sqrt(xDistance*xDistance) + (yDistance*yDistance);
	}

	@Override
	public String toString() {
		return cityName;
	}
}
