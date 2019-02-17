package Observer;

import java.util.Observable;

public class CurrentConditionsDisplay implements java.util.Observer, DisplayElemnt {

    Observable observable;
    private float humidity;
    private float temperature;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + humidity + " "
         + temperature);
    }

    @Override
    public void update(Observable obs, Object  arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
