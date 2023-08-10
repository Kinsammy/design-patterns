package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherInfo implements IObservable{
    private List<IObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherInfo(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        int index = observers.indexOf(observer);
        if (index > 0){
            this.observers.remove(observer);
        }
    }


    @Override
    public void notifyObservers() {
//        for (int index =0 ;index <observers.size(); index++){
//            IObserver observer = observers.get(index);
//            observer.update(temperature, humidity, pressure);
//        }
        for (IObserver observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
