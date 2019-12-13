package Excersize1;

public class Phoenix extends Animal{

    public Phoenix(String name) {
        super(name);
        legs = -1;
        healingTime = 0;
    }

    @Override
    public int getHealingTime() {
        return 0;
    }

    @Override
    public boolean isBreatheFire() {
        return true;
    }

    @Override
    public int legsAmount() {
        return legs;
    }
}
