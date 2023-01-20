package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import lombok.Getter;
import org.komponente.dto.user.UserDto;

import java.util.ArrayList;
@Getter
public class AdminView extends VBox {

    private TableView<UserDto> tvUsers;
    private ObservableList<UserDto> olUsers;

    private Button btnDeny;
    private Button btnGive;

    private HBox hbButtons;

    public AdminView(){
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
      tvUsers=new TableView<>();
      olUsers= FXCollections.observableList(new ArrayList<>());

      btnDeny=new Button("Deny Access");
      btnGive=new Button("Give Access");

      hbButtons=new HBox(10);
      hbButtons.setPadding(new Insets(10,10,10,10));

        TableColumn tcId=new TableColumn("ID");
        TableColumn tcUser=new TableColumn("Username");
        TableColumn tcFirstName=new TableColumn("First Name");
        TableColumn tcLastName=new TableColumn("Last Name");
        TableColumn tcEmail=new TableColumn("Email");

        tcId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tcUser.setCellValueFactory(new PropertyValueFactory<>("username"));
        tcFirstName.setCellValueFactory(new PropertyValueFactory<>("name"));
        tcLastName.setCellValueFactory(new PropertyValueFactory<>("surname"));
        tcEmail.setCellValueFactory(new PropertyValueFactory<>("email"));

        tvUsers.getColumns().addAll(tcId,tcUser,tcFirstName,tcLastName,tcEmail);
    }

    private void addElements(){
        hbButtons.getChildren().addAll(btnDeny,btnGive);

        this.getChildren().addAll(tvUsers,hbButtons);

    }


}
