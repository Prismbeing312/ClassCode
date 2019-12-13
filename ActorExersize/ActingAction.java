package ActorExersize;

public class ActingAction implements Acting{
    @Override
    public void actingWithDrama() {
        System.out.println("Bang Bang so sad");
    }

    @Override
    public void actingWithAction() {
        System.out.println("bang bang get to the chopper!");
    }

    @Override
    public void actingWithHorror() {
        System.out.println("bang bang oh fuuuuuuuck!");

    }
}
