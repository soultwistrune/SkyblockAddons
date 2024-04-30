package codes.biscuit.skyblockaddons.utils.skyblockdata;

import codes.biscuit.skyblockaddons.core.Rarity;
import lombok.Getter;

@SuppressWarnings("unused")
public class PetInfo {

    @Getter private String type;
    private boolean active;
    private double exp;
    private Rarity tier;
    private  boolean hideInfo;
    private String heldItem;
    private int candyUsed;
}
