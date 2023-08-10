package observerPattern;

public class CurrentConditionDisplay implements IObserver, IDisplayElement{
    private float temperature;
    private float humidity;
    private WeatherInfo weatherInfo;

    public CurrentConditionDisplay(WeatherInfo weatherInfo){
        this.weatherInfo = weatherInfo;
        weatherInfo.registerObserver(this);
    }

//    public double getHeatIndex(float temperature, float humidity){
//        double heatHeatIndex =
//    }


    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
        + "F degree and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
