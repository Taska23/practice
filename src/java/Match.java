public class Match {
    private String firstTeam;
    private String secondTeam;
    private String score;
    private String date;

    public Match(String firstTeam, String secondTeam, String score, String date) {
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        this.score = score;
        this.date = date;
    }

    public String getFirstTeam() {
        return firstTeam;
    }

    public String getSecondTeam() {
        return secondTeam;
    }

    public String getScore() {
        return score;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(date + " " + firstTeam + " сыграли против ").append(secondTeam + " cо счётом: " + score);
        return  sb.toString();
    }
}
