package org.joyofcoding.objectcalisthenics.Items;

/**
 * Created by yerath on 27/03/2017.
 */
public class Potion implements Item {

    public String name;
    public int quality;
    public int sellIn;

    public Potion(String name, int sellIn, int quality) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    @Override
    public void updateQuality(){
        if (quality > 0) {
            if(sellIn < 0){
                this.decreaseQuality(1);
            }else {
                this.decreaseQuality(1);
            }
        }
        this.decreaseSellIn(1);
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
