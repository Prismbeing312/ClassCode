package Class;

public interface InterfaceTest2 extends InterfaceTest {

    @Override
    default String sayHiToo(String name){
        return GREET + " " + name;
    }

}
