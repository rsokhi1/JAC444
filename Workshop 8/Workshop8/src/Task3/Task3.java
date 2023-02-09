/**********************************************
 Workshop 8 Task3
 Course:<JAC444> - 4th Semester
 Last Name: Sokhi
 First Name:Rajbeer
 ID:124969205
 Section: NBB
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Signature
 Date: 29-07-2022
 **********************************************/
package Task3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.Map;

public class Task3 extends Application {
    private Map<String, String> country = new HashMap<>();

    /**
     * This function will trigger the GUI and handle the logic for the program
     * */
    @Override
    public void start(Stage stage) throws Exception {
        GridPane gp = new GridPane();
        gp.setAlignment(Pos.CENTER);
        gp.setHgap(5);
        gp.setVgap(5);

        loadData();
        gp.add(new Label("Enter a country name: "),0,0);
        TextField cn = new TextField();
        gp.add(cn,1,0);

        Button btnSearch = new Button("Search Capital");
        Button btnClear = new Button("Clear");
        gp.add(btnSearch,1,1);
        gp.add(btnClear,1,2);

        Label result = new Label();
        result.setText("Result goes here");
        gp.add(result,1,4);

        btnSearch.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String countryUI = cn.getText();
                countryUI = countryUI.substring(0, 1).toUpperCase() + countryUI.substring(1);
                String city = country.get(countryUI);

                result.setText("The capital of " + countryUI + " is " + city);

            }
        });

        btnClear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                result.setText("Result goes here");
                cn.setText("");
            }
        });




        Scene sci = new Scene(gp,400,400);
        stage.setScene(sci);
        stage.setTitle("Search Capital");
        stage.show();

    }

    /**
     * This function just loads the data for the map.
     * */
    public void loadData(){
        country.put("Afghanistan","Kabul");
        country.put("Albania","Tirana");
        country.put("China","Beijing");
        country.put("India","Delhi");
        country.put("Japan","Tokyo");
        country.put("Canada","Ottawa");
        country.put("Bangladesh","Dhaka");
        country.put("Brazil","Brasilia");
        country.put("Colombia","Bogota");
        country.put("Pakistan","Islamabad");
        country.put("Phillippines","Manila");
        country.put("Australia","Canberra");
        country.put("Chile","Santiago");
        country.put("Denmark","Copenhagen");
        country.put("Cuba","Havana");
        country.put("France","Paris");
        country.put("Germany","Berlin");
        country.put("Ghana","Accra");
        country.put("Greece","Athens");
        country.put("Hungary","Budapest");
        country.put("Indonesia","Jakarta");
        country.put("Iran","Tehran");
        country.put("Iraq","Baghdad");
        country.put("Italy","Rome");
        country.put("Jordan","Amman");
    }

}
