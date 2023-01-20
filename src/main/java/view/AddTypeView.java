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

import java.util.ArrayList;
@Getter
public class AddTypeView extends GridPane {

    private Label lblName;

    private TextField tfName;

    private Button btnAdd;

    public AddTypeView(){
        init();
        initElements();
        addElements();
    }

    private void initElements(){
        lblName=new Label("Type Name");

        tfName=new TextField();

        btnAdd=new Button("Add Type");
    }

    private void init(){
        this.setHgap(10);
        this.setVgap(10);
        this.setPadding(new Insets(15, 15, 15, 15));
    }

    private void addElements(){
        this.add(lblName,0,0);
        this.add(tfName,1,0);
        this.add(btnAdd,0,1);
    }
}
