package org.joyofcoding.objectcalisthenics.Items;

/**
 * Created by yerath on 27/03/2017.
 */
public class Armor implements Item {
    public String name;
    public int quality;
    public int sellIn;

    public Armor(String name, int sellIn, int quality) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    @Override
    public void updateQuality(){
        if (this.quality > 0)
            this.decreaseQuality(1);

        this.decreaseSellIn(1);

        if (this.sellIn < 0 && quality > 0) {
            this.decreaseQuality(1);
        }
    }

    @Override
    public void decreaseSellIn(int amount){
        this.sellIn -= 1;
    }

    @Override
    public void decreaseQuality(int quality) { this.quality -= quality; }

    @Override
    public void increaseQuality(int quality) { this.quality += quality; }

    @Override
    public String getName(){ return this.name; }

    @Override
    public int getQuality(){ return  this.quality; }

    @Override
    public int getSellIn(){ return  this.sellIn; }

}
