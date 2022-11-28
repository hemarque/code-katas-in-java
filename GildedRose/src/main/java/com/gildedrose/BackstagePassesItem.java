package com.gildedrose;

public class BackstagePassesItem extends Item {
    public BackstagePassesItem(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void update() {
        if (quality < 50) {
            increaseQuality();
            if (sellIn < 11) {
                if (quality < 50) {
                    increaseQuality();
                }
            }
            if (sellIn < 6) {
                if (quality < 50) {
                    increaseQuality();
                }
            }
        }
        decreaseSellIn();
        if (sellIn < 0) {
            quality = 0;
        }
    }
}
