package startup;

public class SimpleStartUp {
    private int[] locationCells;
    private boolean[] hitCells;
    private int numOfHits = 0;
    private int originalLength = 3;
    public void setLocationCells(int[] locs){
        locationCells = locs;
        originalLength = locs.length;
    }

    public void setHitCells(boolean[] hits){
        this.hitCells = hits;
    }

    public String checkYourself(int guess){
        String result = "miss";
        if (guess<0) {
            System.out.println("only positive number");
            return result;
        }

       for(int i=0; i< locationCells.length; i++){
            int cell = locationCells[i];
            if(guess==cell && !hitCells[i]){
                result = "hit";
                numOfHits++;
               // locationCells[i] = -1;
                hitCells[i] = true;
                break;
            }
        }
        if(numOfHits == originalLength) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
