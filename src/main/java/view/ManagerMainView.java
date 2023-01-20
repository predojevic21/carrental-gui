package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import lombok.Getter;

@Getter
public class ManagerMainView extends VBox {

    private Button btnAddVehicle;
    private Button btnAddType;
    private Button btnAddCC;
    private Button btnEditCompany;
    private Button btnEditCC;
    private Button btnCancelRes;
    private Button btnEditProfile;

    public ManagerMainView(){
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
        btnAddVehicle=new Button("Add New Vehicle");
        btnAddType=new Button("Add New Vehicle Type");
        btnAddCC=new Button("Add New Company Car");
        btnEditCC=new Button("Edit Company Car");
        btnEditCompany=new Button("Edit Company");
        btnCancelRes=new Button("Cancel Reservation");
        btnEditProfile=new Button("Edit Profile");
    }

    private void addElements(){
        this.getChildren().addAll(btnAddVehicle,btnAddType,btnAddCC,btnEditCC,btnEditCompany,btnCancelRes,btnEditProfile);
    }


}
