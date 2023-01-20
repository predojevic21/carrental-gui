package view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import lombok.Getter;

@Getter
public class EditCompanyView extends GridPane {
    private Label lblName;
    private Label lblDesc;

    private TextField tfName;
    private TextField tfDesc;

    private Button btnEdit;

    public EditCompanyView(){
        init();
        initElements();
        addElements();
    }

    private void initElements(){
        lblName=new Label("Edit Company Name");
        lblDesc=new Label("Edit Description");

        tfName=new TextField();
        tfDesc=new TextField();

        btnEdit=new Button("Edit Company");
    }

    private void init(){
        this.setHgap(10);
        this.setVgap(10);
        this.setPadding(new Insets(15, 15, 15, 15));
    }

    private void addElements(){
        this.add(lblName,0,0);
        this.add(tfName,1,0);
        this.add(lblDesc,0,1);
        this.add(tfDesc,1,1);
        this.add(btnEdit,0,2);
    }
}
