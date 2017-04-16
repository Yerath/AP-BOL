package org.joyofcoding.objectcalisthenics.Items;

/**
 * Created by yerath on 27/03/2017.
 */
public class Weapon implements Item {

    public String name;
    public int quality;
    public int sellIn;

    public Weapon(String name, int sellIn, int quality) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    @Override
    public void updateQuality() {

    }

    @Override
    public void decreaseSellIn(int amount) { this.sellIn -= amount;}

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
