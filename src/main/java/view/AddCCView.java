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
import org.komponente.dto.company.CompanyDto;
import org.komponente.dto.vehicle.VehicleDto;

import java.util.ArrayList;
@Getter
public class AddCCView extends GridPane {
    private Label lblVehicle;
    private Label lblPrice;
    private Label lblQuantity;

    private TextField tfPrice;
    private TextField tfQuantity;

    private ComboBox cbVehicle;
    private ObservableList<VehicleDto> olVehicle;

    private Button btnAdd;

    public AddCCView(){
        init();
        initElements();
        addElements();
    }

    private void initElements(){
        lblVehicle=new Label("Vehicle");
        lblPrice=new Label("Price");
        lblQuantity=new Label("Quantity");

        tfPrice=new TextField();
        tfQuantity=new TextField();

        olVehicle=FXCollections.observableList(new ArrayList<>());
        cbVehicle=new ComboBox(olVehicle);

        btnAdd=new Button("Add Company Car");

    }

    private void init(){
        this.setHgap(10);
        this.setVgap(10);
        this.setPadding(new Insets(15, 15, 15, 15));
    }

    private void addElements(){
        this.add(lblVehicle,0,0);
        this.add(cbVehicle,1,0);
        this.add(lblPrice,0,1);
        this.add(tfPrice,1,1);
        this.add(lblQuantity,0,2);
        this.add(tfQuantity,1,2);
        this.add(btnAdd,0,3);

    }
}
