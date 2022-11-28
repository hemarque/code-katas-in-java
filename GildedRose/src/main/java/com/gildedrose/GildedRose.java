package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            update(item);
        }
    }

    private void update(Item item) {
        if (!isAgedBrie(item)
                && !isBackstagePasses(item)) {
            if (isQualityGreaterThanZero(item)) {
                if (!isSulfuras(item)) {
                    decreaseQuality(item);
                }
            }
        } else {
            if (isQualityLessThan50(item)) {
                increaseQuality(item);

                if (isBackstagePasses(item)) {
                    if (item.sellIn < 11) {
                        increaseQuality(item);
                    }

                    if (isQualityLessThan6(item)) {
                        increaseQuality(item);
                    }
                }
            }
        }

        if (!isSulfuras(item)) {
            item.sellIn = item.sellIn - 1;
        }

        if (item.sellIn < 0) {
            if (isAgedBrie(item)) {
                if (isQualityLessThan50(item)) {
                    increaseQuality(item);
                }
            } else {
                if (isBackstagePasses(item)) {
                    makeQualityZero(item);
                } else {
                    if (isQualityGreaterThanZero(item)) {
                        if (!isSulfuras(item)) {
                            decreaseQuality(item);
                        }
                    }
                }
            }
        }
    }

    private void makeQualityZero(Item item) {
        item.quality = 0;
    }

    private void decreaseQuality(Item item) {
        item.quality = item.quality - 1;
    }

    private void increaseQuality(Item item) {
        item.quality = item.quality + 1;
    }

    private boolean isQualityLessThan6(Item item) {
        return item.sellIn < 6;
    }

    private boolean isQualityLessThan50(Item item) {
        return item.quality < 50;
    }

    private boolean isQualityGreaterThanZero(Item item) {
        return item.quality > 0;
    }

    private boolean isBackstagePasses(Item item) {
        return item.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    private boolean isSulfuras(Item item) {
        return item.name.equals("Sulfuras, Hand of Ragnaros");
    }

    private boolean isAgedBrie(Item item) {
        return item.name.equals("Aged Brie");
    }
}