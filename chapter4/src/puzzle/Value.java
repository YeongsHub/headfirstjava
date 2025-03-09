package puzzle;

class Value {
    int intValue;
    public int doStuff(int factor){
        if(intValue > 100){
            return intValue * (5 - factor);
        } else {
            return intValue* (2 + factor);
        }
    }
}
