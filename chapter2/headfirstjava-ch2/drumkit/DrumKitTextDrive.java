package drumkit;

public class DrumKitTextDrive {
    public static void main(String[] args){
        DrumKit d = new DrumKit();
        d.snare= false;
        d.playSnare();
        d.playTopHot();

        if(d.snare==true) {
            d.playSnare();
        }
    }
}
