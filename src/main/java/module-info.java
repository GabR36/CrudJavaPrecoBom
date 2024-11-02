module com.example.precobom {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.precobom to javafx.fxml;
    exports com.example.precobom;
}