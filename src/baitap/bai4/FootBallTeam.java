package baitap.bai4;

public class FootBallTeam {
    int id,numberOfPlayer,score;
    String name;

    public FootBallTeam() {
    }

    public FootBallTeam(int id, int numberOfPlayer, int score, String name) {
        this.id = id;
        this.numberOfPlayer = numberOfPlayer;
        this.score = score;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfPlayer() {
        return numberOfPlayer;
    }

    public void setNumberOfPlayer(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FootBallTeam{" +
                "id=" + id +
                ", numberOfPlayer=" + numberOfPlayer +
                ", score=" + score +
                ", name='" + name + '\'' +
                '}';
    }
}
