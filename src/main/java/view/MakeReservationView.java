package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import lombok.Getter;
import org.komponente.dto.carrental.CompanyCarDto;

import java.util.ArrayList;

@Getter
public class MakeReservationView extends GridPane {

    private TableView<CompanyCarDto> tvCars;
    private ObservableList<CompanyCarDto> olCars;

    private Label lblFrom;
    private Label lblTo;

    private DatePicker dpFrom;
    private DatePicker dpTo;

    private Button btnRes;

    public MakeReservationView(){
        init();
        initElements();
        addElements();
    }

    private void init(){
        this.setHgap(10);
        this.setVgap(10);
        this.setPadding(new Insets(15, 15, 15, 15));
    }

    private void initElements(){
        tvCars=new TableView<>();
        olCars= FXCollections.observableList(new ArrayList<>());

        lblFrom=new Label("From");
        lblTo=new Label("To");

        dpFrom=new DatePicker();
        dpTo=new DatePicker();

        btnRes=new Button("Make Reservation");

        TableColumn tcCompany=new TableColumn("Company");
        TableColumn tcVehicle=new TableColumn("Vehicle");
        TableColumn tcType=new TableColumn("Type");
        TableColumn tcPrice=new TableColumn("Price");
        TableColumn tcQuantity=new TableColumn("Quantity");

        tcCompany.setCellValueFactory(new PropertyValueFactory<>("companyDto"));
        tcVehicle.setCellValueFactory(new PropertyValueFactory<>("vehicleDto"));
        tcType.setCellValueFactory(new PropertyValueFactory<>("type"));
        tcPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        tcQuantity.setCellValueFactory(new PropertyValueFactory<>("numberofcars"));

        tvCars.getColumns().addAll(tcCompany,tcVehicle,tcType,tcPrice,tcQuantity);
    }

    private void addElements(){
        this.add(tvCars,0,0);
        this.add(lblFrom,0,1);
        this.add(dpFrom,1,1);
        this.add(lblTo,0,2);
        this.add(dpTo,1,2);
        this.add(btnRes,0,3);
    }

}
