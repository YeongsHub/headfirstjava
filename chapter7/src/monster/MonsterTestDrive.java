package monster;

public class MonsterTestDrive {
    public static void main(String[] args) {
        Monster[] monsters =new Monster[3];
        monsters[0] = new Vampire();
        monsters[1] = new Dragon();
        monsters[2] = new Monster();
        for(int i= 0;i< monsters.length;i++ ) {
            monsters[i].frighten(i);
        }
    }
}
