package afternooncoffee;

public class Coffee {
    private final String name;

    Coffee(String name ){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return name ;
    }
}
