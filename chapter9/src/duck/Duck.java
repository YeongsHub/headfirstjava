package duck;

public class Duck {
    int size;
    int age;
    public Duck(int duckSize){
        if (duckSize==0) {
            size = 27;
        } else {
            size = duckSize;
        }
    }

    public Duck(int size, int age) {
        this(size);
        this.age = age;
    }


    @Override
    public String toString() {
        return "Duck{" +
                "size=" + size +
                '}';
    }
}
