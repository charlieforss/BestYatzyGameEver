import java.awt.*;

public class Player extends Person{

    //Den som har hand om färg får bestämma hur man vill ha färger
    private String color;
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addScore(int addedScore) {
        score += addedScore;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
