package Excersize1;

public abstract class Animal {
    protected int legs;
    protected boolean breatheFire;
    protected int healingTime;

    public abstract int getHealingTime();

    public abstract boolean isBreatheFire();

    public abstract int legsAmount();

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected String name;

}
