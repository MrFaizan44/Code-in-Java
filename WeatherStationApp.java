// Sensor interface
interface Sensor {
    String getSensorType();
    double readValue();  // simulate reading sensor data
}

// Display interface
interface Display {
    void show();
}

// TemperatureSensor class
class TemperatureSensor implements Sensor {
    @Override
    public String getSensorType() {
        return "Temperature Sensor";
    }

    @Override
    public double readValue() {
        return 20 + Math.random() * 15; // Simulated temperature (20 to 35 °C)
    }
}

// HumiditySensor class
class HumiditySensor implements Sensor {
    @Override
    public String getSensorType() {
        return "Humidity Sensor";
    }

    @Override
    public double readValue() {
        return 30 + Math.random() * 50; // Simulated humidity (30% to 80%)
    }
}

// WeatherStation class implements Display
class WeatherStation implements Display {
    private Sensor temperatureSensor;
    private Sensor humiditySensor;

    public WeatherStation(Sensor temperatureSensor, Sensor humiditySensor) {
        this.temperatureSensor = temperatureSensor;
        this.humiditySensor = humiditySensor;
    }

    @Override
    public void show() {
        System.out.println("=== Weather Station Report ===");
        System.out.printf("%s: %.2f °C%n", temperatureSensor.getSensorType(), temperatureSensor.readValue());
        System.out.printf("%s: %.2f %% RH%n", humiditySensor.getSensorType(), humiditySensor.readValue());
        System.out.println("==============================");
    }
}

// Main class
public class WeatherStationApp {
    public static void main(String[] args) {
        Sensor tempSensor = new TemperatureSensor();
        Sensor humiditySensor = new HumiditySensor();
        Display weatherStation = new WeatherStation(tempSensor, humiditySensor);

        // Simulate readings
        weatherStation.show();
    }
}
