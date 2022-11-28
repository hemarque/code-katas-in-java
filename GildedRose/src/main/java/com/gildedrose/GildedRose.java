package com.gildedrose;

import java.util.Arrays;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Arrays.stream(items).forEach(this::update);
    }

    private void update(Item item) {
        if (isAgedBrie(item)) {
            if (item.quality < 50) {
                increaseQuality(item);
            }
            decreaseSellIn(item);
            if (item.sellIn < 0) {
                if (item.quality < 50) {
                    increaseQuality(item);
                }
            }
        } else if (isBackstagePasses(item)) {
            if (item.quality < 50) {
                increaseQuality(item);
                if (item.sellIn < 11) {
                    if (item.quality < 50) {
                        increaseQuality(item);
                    }
                }
                if (item.sellIn < 6) {
                    if (item.quality < 50) {
                        increaseQuality(item);
                    }
                }
            }
            decreaseSellIn(item);
            if (item.sellIn < 0) {
                item.quality = 0;
            }
        } else if (isSulfuras(item)) {
        } else {
            if (item.quality > 0) {
                decreaseQuality(item);
            }
            decreaseSellIn(item);
            if (item.sellIn < 0) {
                if (item.quality > 0) {
                    decreaseQuality(item);
                }
            }
        }
    }

    private void decreaseSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    private void decreaseQuality(Item item) {
        item.quality = item.quality - 1;
    }

    private void increaseQuality(Item item) {
        item.quality = item.quality + 1;
    }

    private boolean isAgedBrie(Item item) {
        return item.name.equals("Aged Brie");
    }

    private boolean isBackstagePasses(Item item) {
        return item.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    private boolean isSulfuras(Item item) {
        return item.name.equals("Sulfuras, Hand of Ragnaros");
    }
}