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
                decreaseQualityWhenIsNotSulfuras(item);
            }
        } else {
            if (isQualityLessThan50(item)) {
                increaseQuality(item);
                if (isBackstagePasses(item)) {
                    increaseQualityWhenIsLessThan11(item);
                    increaseQualityWhenIsLessThan6(item);
                }
            }
        }
        if (!isSulfuras(item)) {
            decreaseSellIn(item);
        }
        if (isSellInLessThan0(item)) {
            if (isAgedBrie(item)) {
                if (isQualityLessThan50(item)) {
                    increaseQuality(item);
                }
            } else {
                if (isBackstagePasses(item)) {
                    makeQualityZero(item);
                } else {
                    if (isQualityGreaterThanZero(item)) {
                        decreaseQualityWhenIsNotSulfuras(item);
                    }
                }
            }
        }
    }

    private void increaseQualityWhenIsLessThan11(Item item) {
        if (isSellInLessThan11(item)) {
            increaseQuality(item);
        }
    }

    private void increaseQualityWhenIsLessThan6(Item item) {
        if (isQualityLessThan6(item)) {
            increaseQuality(item);
        }
    }

    private void decreaseQualityWhenIsNotSulfuras(Item item) {
        if (!isSulfuras(item)) {
            decreaseQuality(item);
        }
    }

    private boolean isSellInLessThan11(Item item) {
        return item.sellIn < 11;
    }

    private boolean isSellInLessThan0(Item item) {
        return item.sellIn < 0;
    }

    private void decreaseSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
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