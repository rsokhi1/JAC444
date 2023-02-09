package Task1;

import java.sql.*;
import java.util.ArrayList;

public class Task1 {
    private static final String DB_NAME = "LiveLab.db";
    private static final String CONNECTION_STRING = "jdbc:sqlite:R:\\Seneca\\Semester 4\\JAC444\\Workshop 11\\Workshop11\\src";
    private static final String TABLE_JACSTUDENTS = "jacStudents";
    private static final String TABLE_ASSIGNEDEXERCISES = "AssignedExercises";
    private static final String TABLE_JACLOGS = "JACLogs";

    private static ArrayList<JACStudents> studentsList = new ArrayList<>();

    private static ArrayList<AssignedExercises> exerciseList = new ArrayList<>();

    private static ArrayList<JACLogs> logList = new ArrayList<>();

    public static void main(String[] args) throws SQLException {
        try(Connection connection = DriverManager.getConnection(CONNECTION_STRING + DB_NAME)){
            Statement statement = connection.createStatement();
            createTables(statement);
//            insertValues(statement);

            statement.execute("select * from " + TABLE_JACSTUDENTS);
            ResultSet resultSet = statement.getResultSet();
            while(resultSet.next()){
                studentsList.add(new JACStudents(resultSet.getString("username"),resultSet.getString("password"),resultSet.getString("fullname"),resultSet.getString("instructorEmail")));
            }

            statement.execute("select * from " + TABLE_ASSIGNEDEXERCISES);
            resultSet = statement.getResultSet();

            while (resultSet.next()){
                exerciseList.add(new AssignedExercises(resultSet.getString("instructorEmail"),resultSet.getString("exerciseName"),resultSet.getDouble("maxScore")));
            }

            statement.execute("select * from " + TABLE_JACLOGS);
            resultSet = statement.getResultSet();
            while (resultSet.next()){
                logList.add(new JACLogs(resultSet.getString("username"),resultSet.getString("exerciseName"),resultSet.getDouble("score"),resultSet.getBoolean("Submitted")));
            }

            ArrayList<JACLogs> listTobeAdded = new ArrayList<>();
            statement.execute("Select J.username, A.exerciseName from "+ TABLE_JACSTUDENTS+" J LEFT JOIN " + TABLE_ASSIGNEDEXERCISES + " A ON J.instructorEmail = A.instructorEmail");
            resultSet = statement.getResultSet();
            while (resultSet.next()){
//                System.out.println(resultSet.getString("username") + " " + resultSet.getString("exerciseName"));
                listTobeAdded.add(new JACLogs(resultSet.getString("username"),resultSet.getString("exerciseName"),0,false));
            }

            for(JACLogs j : listTobeAdded){
                System.out.println(j.toString());
            }

            System.out.println();
            System.out.println("==================================");
            updateLogsTable(statement,listTobeAdded);





        }
    }

    public static void updateLogsTable(Statement statement,ArrayList<JACLogs> listToBeAdded) {
        for (int i = 0; i < listToBeAdded.size() ; i++) {
            for (int j = 0; j < logList.size(); j++) {
                if (!listToBeAdded.get(i).getUsername().contains(logList.get(j).getUsername()) && !listToBeAdded.get(i).getExerciseName().contains(logList.get(j).getExerciseName())) {
                    System.out.println(listToBeAdded.get(i).toString());
                }

            }
        }
    }

    public static void createTables(Statement st) throws SQLException {
        st.execute("Create table if not exists " + TABLE_JACSTUDENTS + " (" +
                "username varchar(50) not null, " +
                "password varchar(50) not null, " +
                "fullname varchar(200) not null, " +
                "instructorEmail varchar(100) not null, " +
                "constraint pkJACStudent primary key (username)" +
                ")");

        st.execute("Create table if not exists " + TABLE_ASSIGNEDEXERCISES + " (" +
                "instructorEmail varchar(100), " +
                "exerciseName varchar(100), " +
                "maxscore double default 10, " +
                "constraint pkCustomExercise primary key (instructorEmail, exerciseName)" +
                ")");

        st.execute("Create table if not exists " + TABLE_JACLOGS + " (" +
                "username varchar(50), " +
                "exerciseName varchar(100), " +
                "score double default null, " +
                "submitted bit default 0, " +
                "constraint pkLog primary key (username, exerciseName)" +
                ")");
    }

    public static void insertValues(Statement statement) throws SQLException {
        statement.execute("Insert into " + TABLE_JACSTUDENTS + " (username, password, fullname, instructorEmail) values('abc','p1','Kyle Wright' , 'a@senecacollege.ca')");
        statement.execute("Insert into " + TABLE_JACSTUDENTS + " (username, password, fullname, instructorEmail) values('cde','p2','Yao Mil' , 'c@senecacollege.ca')");
        statement.execute("Insert into " + TABLE_JACSTUDENTS + " (username, password, fullname, instructorEmail) values('wbc','p3','Jack Jill' , 'a@senecacollege.ca')");

        statement.execute("Insert into " + TABLE_ASSIGNEDEXERCISES + " (instructorEmail,exerciseName,maxScore) values('a@senecacollege.ca','e1',10)");
        statement.execute("Insert into " + TABLE_ASSIGNEDEXERCISES + " (instructorEmail,exerciseName,maxScore) values('a@senecacollege.ca','e2',10)");
        statement.execute("Insert into " + TABLE_ASSIGNEDEXERCISES + " (instructorEmail,exerciseName,maxScore) values('c@senecacollege.ca','e1',4)");
        statement.execute("Insert into " + TABLE_ASSIGNEDEXERCISES + " (instructorEmail,exerciseName,maxScore) values('c@senecacollege.ca','e4',20)");

        statement.execute("Insert into " + TABLE_JACLOGS + " (username,exerciseName,score,submitted) values('abc','e1',9,1)");
        statement.execute("Insert into " + TABLE_JACLOGS + " (username,exerciseName,score,submitted) values('wbc','e2',7,1)");
    }
}
