package com.gildedrose;

public class Item {

     String name;

     int sellIn;

     int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return name + ", " + sellIn + ", " + quality;
    }

    public void update() {
        decreaseQuality();
        decreaseSellIn();
        if (sellIn < 0) {
            decreaseQuality();
        }
    }

    void decreaseSellIn() {
        sellIn--;
    }

    private void decreaseQuality() {
        if (quality > 0) {
            quality--;
        }
    }

    void increaseQuality() {
        this.quality++;
    }
}
