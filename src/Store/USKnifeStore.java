package Store;

import Knife.*;

public class USKnifeStore extends KnifeStore{
    @Override
    Knife createKnife(String type) {
        if (type.equals("chef")) {
            return new USChefKnife();
        } else if (type.equals("steak")) {
            return new USSteakKnife();
        } else return null;
    }
}
