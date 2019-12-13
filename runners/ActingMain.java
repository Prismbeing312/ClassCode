package runners;

import ActorExersize.Acting;
import ActorExersize.ActingAction;
import ActorExersize.ActingDrama;
import ActorExersize.ActingHorror;

public class ActingMain{
    public static void main(String[] args) {
     ActingAction action = new ActingAction();
     ActingDrama drama = new ActingDrama();
     ActingHorror horror = new ActingHorror();

     Acting[] actors = {action, drama, horror};

        for (Acting actresses:actors) {
            actresses.actingWithHorror();
            actresses.actingWithDrama();
            actresses.actingWithAction();
        }
    }
}
