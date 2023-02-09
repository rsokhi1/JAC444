package Task1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Task1 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        GridPane gp = new GridPane();
        gp.setAlignment(Pos.CENTER);
        gp.setHgap(5);
        gp.setVgap(5);

        gp.add(new Label("Enter the Year:"),0,0);
        TextField yr = new TextField();
        gp.add(yr,1,0);

        gp.add(new Label("Enter the Gender:"),0,1);
        TextField gdr = new TextField();
        gp.add(gdr,1,1);

        gp.add(new Label("Enter the Name: "),0,2);
        TextField nme = new TextField();
        gp.add(nme,1,2);

        Button btnSubmitQry = new Button("Submit Query");
        Button btnExit = new Button("Exit");
        gp.add(btnSubmitQry,1,3);
        gp.add(btnExit,1,4);

        btnSubmitQry.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
//                String yearStr = yr.getText();
//                int year = Integer.parseInt(yearStr);
//
//                String genderStr = gdr.getText();
//                char gender = genderStr.charAt(0);
//
//                String name = nme.getText();
                Baby b = new Baby();
                b.initiliazeData(2009);
//                b.displayNames();

            }
        });

        Scene sci = new Scene(gp,400,400);
        stage.setScene(sci);
        stage.setTitle("Task1");
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
