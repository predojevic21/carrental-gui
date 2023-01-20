package view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class EditManagerView extends GridPane {
    private Label lblFirstName;
    private Label lblLastName;
    private Label lblUsername;
    private Label lblPassword;
    private Label lblPhoneNumber;
    private Label lblBirthDate;
    private Label lblEmail;
    private Label lblCompany;

    private TextField tfFirstName;
    private TextField tfLastName;
    private TextField tfUsername;
    private TextField tfPassword;
    private TextField tfPhoneNumber;
    private TextField tfBirthDate;
    private TextField tfEmail;
    private TextField tfCompany;

    private Button btnEdit;

    public EditManagerView(){
        init();
        initElements();
        addElements();
    }

    private void initElements(){
        lblFirstName=new Label("First Name");
        lblLastName=new Label("Last Name");
        lblUsername=new Label("Username");
        lblPassword=new Label("Password");
        lblPhoneNumber=new Label("Phone Number");
        lblEmail=new Label("Email");
        lblBirthDate=new Label("Date of Birth");
        lblCompany=new Label("Company Name");

        tfFirstName=new TextField();
        tfLastName=new TextField();
        tfUsername=new TextField();
        tfPassword=new TextField();
        tfPhoneNumber=new TextField();;
        tfEmail=new TextField();
        tfBirthDate=new TextField();
        tfCompany=new TextField();

        btnEdit=new Button("Edit Profile");

    }

    private void init(){
        this.setHgap(10);
        this.setVgap(10);
        this.setPadding(new Insets(15, 15, 15, 15));
    }

    private void addElements(){
        this.add(lblFirstName,0,0);
        this.add(lblLastName,0,1);
        this.add(lblUsername,0,2);
        this.add(lblPassword,0,3);
        this.add(lblPhoneNumber,0,4);
        this.add(lblEmail,0,5);
        this.add(lblBirthDate,0,6);
        this.add(lblCompany,0,7);

        this.add(tfFirstName,1,0);
        this.add(tfLastName,1,1);
        this.add(tfUsername,1,2);
        this.add(tfPassword,1,3);
        this.add(tfPhoneNumber,1,4);
        this.add(tfEmail,1,5);
        this.add(tfBirthDate,1,6);
        this.add(lblCompany,1,7);

        this.add(btnEdit,0,8);

    }
}
