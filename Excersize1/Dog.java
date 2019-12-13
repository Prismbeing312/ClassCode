package Excersize1;

public class Dog extends Animal{

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

    public Dog(String name) {
        super(name);
        legs = 4;
        healingTime = 5;
    }
}
