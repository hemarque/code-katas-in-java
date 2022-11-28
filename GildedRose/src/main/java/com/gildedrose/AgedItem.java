package com.gildedrose;

public class AgedItem extends Item {
    public AgedItem(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public void update() {
        if (quality < 50) {
            increaseQuality();
        }
        decreaseSellIn();
        if (sellIn < 0) {
            if (quality < 50) {
                increaseQuality();
            }
        }
    }
}
