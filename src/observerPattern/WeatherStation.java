package observerPattern;

public class WeatherStation {
    public static void main(String[] args) {
        var weatherInfo = new WeatherInfo();
        var currentDisplay = new CurrentConditionDisplay(weatherInfo);
        weatherInfo.setMeasurements(80, 65, 30.4f);
    }
}
