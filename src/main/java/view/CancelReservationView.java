package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import lombok.Getter;
import org.komponente.dto.reservation.ActiveReservationDto;

import java.util.ArrayList;

@Getter
public class CancelReservationView extends VBox {

    private TableView<ActiveReservationDto> tvRes;
    private ObservableList<ActiveReservationDto> olRes;

    private Button btnCancel;

    public CancelReservationView(){
        init();
        initElements();
        addElements();
    }

    private void init(){
        this.setPadding(new Insets(15,15,15,15));
        this.setSpacing(15);
        this.setAlignment(Pos.CENTER);
    }

    private void initElements(){
        tvRes=new TableView<>(olRes);
        olRes= FXCollections.observableList(new ArrayList<>());
        tvRes.setItems(olRes);

        btnCancel=new Button("Cancel Reservation");

        TableColumn tcId=new TableColumn("ID");
        TableColumn tcVehicle=new TableColumn("Vehicle");
        TableColumn tcBegin=new TableColumn("Begin Date");
        TableColumn tcEnd=new TableColumn("End");
        TableColumn tcPrice=new TableColumn("Total Price");

        tcId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tcVehicle.setCellValueFactory(new PropertyValueFactory<>("companyCarDto"));
        tcBegin.setCellValueFactory(new PropertyValueFactory<>("begindate"));
        tcEnd.setCellValueFactory(new PropertyValueFactory<>("enddate"));
        tcPrice.setCellValueFactory(new PropertyValueFactory<>("totalprice"));

        tvRes.getColumns().addAll(tcId,tcVehicle,tcBegin,tcEnd,tcPrice);
    }

    private void addElements(){
        this.getChildren().addAll(tvRes,btnCancel);
    }


}
