package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import lombok.Getter;
import org.komponente.dto.vehicle.VehicleTypeDto;

import java.util.ArrayList;
@Getter
public class AddVehicleView extends GridPane {

    private Label lblName;
    private Label lblType;

    private TextField tfName;

    private ComboBox cbType;
    private ObservableList<VehicleTypeDto> olType;

    private Button btnAdd;

    public AddVehicleView(){
        init();
        initElements();
        addElements();
    }

    private void initElements(){
        lblName=new Label("Vehicle Name");
        lblType=new Label("Vehicle Type");

        tfName=new TextField();

        olType= FXCollections.observableList(new ArrayList<>());
        cbType=new ComboBox(olType);

        btnAdd=new Button("Add Vehicle");

    }

    private void init(){
        this.setHgap(10);
        this.setVgap(10);
        this.setPadding(new Insets(15, 15, 15, 15));
    }

    private void addElements(){
        this.add(lblName,0,0);
        this.add(lblType,0,1);
        this.add(tfName,1,0);
        this.add(cbType,1,1);
        this.add(btnAdd,1,2);

    }
}
