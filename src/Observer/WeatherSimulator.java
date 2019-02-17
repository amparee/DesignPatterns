package Observer;

public class WeatherSimulator {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(75,100,36);
        weatherData.setMeasurements(32,20,72);
    }

}
