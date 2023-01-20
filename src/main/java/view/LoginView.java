package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import lombok.Getter;

@Getter
public class LoginView extends VBox {

    private Label lblUsername;
    private Label lblPassword;
    private TextField tfUsername;
    private TextField tfPassword;
    private Button btnLogin;
    private Button btnRegisterManager;
    private Button btnRegisterUser;

    public LoginView() {
        init();
        initElements();
        addElements();
    }

    private void initElements(){
        this.lblUsername = new Label("Username:");
        this.lblPassword = new Label("Password:");
        this.tfUsername = new TextField();
        this.tfPassword = new TextField();
        this.btnLogin = new Button("Login");
        this.btnRegisterUser = new Button("Register as user");
        this.btnRegisterManager = new Button("Register as manager");

    }

    private void addElements(){
        this.getChildren().addAll(lblUsername,tfUsername,lblPassword,tfPassword,btnLogin,btnRegisterUser,btnRegisterManager);
    }

    private void init() {
      this.setPadding(new Insets(15,15,15,15));
      this.setSpacing(15);
      this.setAlignment(Pos.CENTER);

    }
}
