package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import org.komponente.dto.reservation.ActiveReservationDto;

import java.util.ArrayList;
import java.util.List;

public class ListReservationsView extends VBox {


    private TableView<ActiveReservationDto> tvRes;
    private ObservableList<ActiveReservationDto> olRes;

    private Button btnCancel;
    private Button btnRate;

    private ComboBox cbStars;
    private ObservableList<Integer> olStars;

    private TextArea taComment;

    public ListReservationsView(){
        init();
        initElments();
        addElements();
    }

    private void init(){
        this.setPadding(new Insets(15,15,15,15));
        this.setSpacing(15);
        this.setAlignment(Pos.CENTER);
    }

    private void initElments(){
        tvRes=new TableView<>();
        olRes= FXCollections.observableList(new ArrayList<>());
        tvRes.setItems(olRes);

        btnCancel=new Button("Cancel Reservation");
        btnRate=new Button("Rate Reservation");

        cbStars=new ComboBox();
        olStars=FXCollections.observableArrayList(1,2,3,4,5);
        cbStars.setItems(olStars);

        taComment=new TextArea();

        TableColumn tcId=new TableColumn("ID");
        TableColumn tcVehicle=new TableColumn("Vehicle");
        TableColumn tcClient=new TableColumn("Client ID");
        TableColumn tcBegin=new TableColumn("Begin Date");
        TableColumn tcEnd=new TableColumn("End");
        TableColumn tcPrice=new TableColumn("Total Price");

        tcId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tcVehicle.setCellValueFactory(new PropertyValueFactory<>("companyCarDto"));
        tcClient.setCellValueFactory(new PropertyValueFactory<>("clientId"));
        tcBegin.setCellValueFactory(new PropertyValueFactory<>("begindate"));
        tcEnd.setCellValueFactory(new PropertyValueFactory<>("enddate"));
        tcPrice.setCellValueFactory(new PropertyValueFactory<>("totalprice"));

        tvRes.getColumns().addAll(tcId,tcVehicle,tcClient,tcBegin,tcEnd,tcPrice);
    }

    private void addElements(){
        this.getChildren().addAll(tvRes,btnCancel,taComment,cbStars,btnRate);
    }
}
