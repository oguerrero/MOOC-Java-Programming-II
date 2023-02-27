package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings = new ArrayList<>();

    public AverageSensor() {
        this.sensors = new ArrayList<>();
    }
    @Override
    public boolean isOn() {
        return sensors.stream().allMatch(Sensor::isOn);
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (sensors.isEmpty() || !isOn()) {
            throw new IllegalStateException("No sensors or sensors are off");
        }
        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.read();
        }
        int average = sum / sensors.size();

        readings.add(average);

        return average;
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    public List<Integer> readings() {
        return readings;
    }
}
