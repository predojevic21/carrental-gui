package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import lombok.Getter;

@Getter
public class ClientMainView extends HBox {
    private Button btnRes;
    private Button btnList;
    private Button btnEdit;

    public ClientMainView(){
        init();
    }

    private void init(){
        this.setPadding(new Insets(15,15,15,15));
        this.setSpacing(15);
        this.setAlignment(Pos.CENTER);
    }

    private void initElements(){
        btnRes=new Button("Make Reservation");
        btnList=new Button("List Reservations");
        btnEdit=new Button("Edit Profile");
    }

    private void addElements(){
        this.getChildren().addAll(btnRes,btnList,btnEdit);
    }
}
