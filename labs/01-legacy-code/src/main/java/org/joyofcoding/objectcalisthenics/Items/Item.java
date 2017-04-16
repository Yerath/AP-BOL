package org.joyofcoding.objectcalisthenics.Items;

/**
 * Created by yerath on 27/03/2017.
 */
public interface Item {
    void updateQuality();

    void decreaseSellIn(int amount);

    void decreaseQuality(int quality);

    void increaseQuality(int quality);

    int getSellIn();

    String getName();

    int getQuality();
}
