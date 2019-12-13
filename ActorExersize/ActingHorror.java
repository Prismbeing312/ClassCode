package ActorExersize;

public class ActingHorror implements Acting {
    @Override
    public void actingWithDrama() {
        System.out.println("'whisper whisper' so sad");
    }

    @Override
    public void actingWithAction() {
        System.out.println("'whisper 'whisper get to the chopper!!");
    }

    @Override
    public void actingWithHorror() {
        System.out.println("'whisper 'whisper oh fuuuuuuuck!");
    }
}
