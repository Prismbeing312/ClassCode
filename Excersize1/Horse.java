package Excersize1;

public class Horse extends Animal{

    @Override
    public int getHealingTime() {
        return healingTime;
    }

    @Override
    public boolean isBreatheFire() {
        return false;
    }

    @Override
    public int legsAmount() {
        return legs;
    }

    public Horse(String name) {
        super(name);
        legs = 6;
        healingTime = 10;
    }
}
