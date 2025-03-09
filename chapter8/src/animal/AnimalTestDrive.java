package animal;

public class AnimalTestDrive {
    public static void main(String[] args){
        MyAnimalList list = new MyAnimalList();
        Dog a = new Dog();
        Cat c = new Cat(5);
        list.add(a);
        list.add(c);

    }
}
