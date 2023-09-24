package org.example;

import java.util.Objects;

public class hotDrink extends product {
    private int volume;
    private int temperature;

    public int getVolume() {
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Горячий напиток, " + "название: " + super.getName() +
                ", объем: " + volume + " ml " + "температура подачи: " + temperature + " град.С";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof hotDrink hotDrink)) return false;
        return volume == hotDrink.volume && temperature == hotDrink.temperature;
    }

    public hotDrink(String name, double price, int volume, int temperature) {
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;

    }
}
