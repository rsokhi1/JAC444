package Task1;

public class JACLogs {
    private String username;
    private String exerciseName;
    private double score;
    private boolean submitted;

    public JACLogs(String username, String exerciseName, double score, boolean submitted) {
        this.username = username;
        this.exerciseName = exerciseName;
        this.score = score;
        this.submitted = submitted;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public boolean isSubmitted() {
        return submitted;
    }

    public void setSubmitted(boolean submitted) {
        this.submitted = submitted;
    }

    @Override
    public String toString() {
        return "JACLogs{" +
                "username='" + username + '\'' +
                ", exerciseName='" + exerciseName + '\'' +
                ", score=" + score +
                ", submitted=" + submitted +
                '}';
    }
}
