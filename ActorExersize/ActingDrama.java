package ActorExersize;

public class ActingDrama implements Acting {
    @Override
    public void actingWithDrama() {
        System.out.println("I cant do it (tear up), so sad");

    }

    @Override
    public void actingWithAction() {
        System.out.println("I cant do it(tear up), get to the chopper!");

    }

    @Override
    public void actingWithHorror() {
        System.out.println("I cant do it(tear up), oh fuuuuuuuck!");
    }
}
