package Observer;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable{

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float preassure;

    public WeatherData() {
    }


    public void measurementChanged() {
        setChanged();
        notifyObservers();
    }


    public ArrayList getObservers() {
        return observers;
    }

    public void setObservers(ArrayList observers) {
        this.observers = observers;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPreassure() {
        return preassure;
    }

    public void setPreassure(float preassure) {
        this.preassure = preassure;
    }

    public void setMeasurements(float preassure, float
            humidity, float temperature) {

        this.preassure = preassure;
        this.temperature = temperature;
        this.humidity = humidity;
        measurementChanged();

    }
}
