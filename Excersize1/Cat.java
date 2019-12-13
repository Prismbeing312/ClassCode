package Excersize1;

public class Cat extends Animal{
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

    public Cat(String name) {
        super(name);
        legs = 3;
        healingTime = 2;
    }
}
