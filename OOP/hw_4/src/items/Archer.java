package items;

import Armour.Armour;
import Armour.Lats;
import weapons.Bow;

public class Archer extends Warrior<Bow, Lats> implements DistanceAttacker {
    private int distance;

    public Archer(String name, Bow weapon, Lats armour) {
        super(name, weapon, armour);
        distance = weapon.getDistance() + rnd.nextInt(10);
    }

    public Archer(String name, Bow weapon) {
        super(name, weapon);
        distance = weapon.getDistance() + rnd.nextInt(10);
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return super.toString() + " Type = Archer{" +
                "distance=" + distance +
                '}';
    }
}
