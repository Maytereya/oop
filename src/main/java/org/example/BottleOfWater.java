package org.example;

import java.util.Objects;

public class BottleOfWater extends product {
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Бутылка воды, " + "бренд: " + super.getName() +
                ", объем: " + volume + " l";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BottleOfWater that)) return false;
        return volume == that.volume;
    }

    public BottleOfWater(String name, double price, int volume) {
        super(name, price);
        this.volume = volume;

    }
}
