package no4_sorting;


public class No3_Player implements Comparable<No3_Player> {
    String name;
    int score;

    No3_Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(No3_Player o) {
        if(this.score > o.score){
            return -1;
        }else if(this.score < o.score){
            return 1;
        }else if(this.name.compareTo(o.name) > 0){
            return -1;
        }else{
            return 1;
        }
    }
}
