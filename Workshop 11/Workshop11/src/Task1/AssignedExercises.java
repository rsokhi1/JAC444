package Task1;

public class AssignedExercises {
    private String instructorEmail;
    private String exerciseName;
    private double maxscore;

    public AssignedExercises(String instructorEmail, String exerciseName, double maxscore) {
        this.instructorEmail = instructorEmail;
        this.exerciseName = exerciseName;
        this.maxscore = maxscore;
    }

    public String getInstructorEmail() {
        return instructorEmail;
    }

    public void setInstructorEmail(String instructorEmail) {
        this.instructorEmail = instructorEmail;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public double getMaxscore() {
        return maxscore;
    }

    public void setMaxscore(double maxscore) {
        this.maxscore = maxscore;
    }

    @Override
    public String toString() {
        return "AssignedExercises{" +
                "instructorEmail='" + instructorEmail + '\'' +
                ", exerciseName='" + exerciseName + '\'' +
                ", maxscore=" + maxscore +
                '}';
    }
}
