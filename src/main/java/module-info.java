module com.example.cotestex {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cotestex to javafx.fxml;
    exports com.example.cotestex;
}