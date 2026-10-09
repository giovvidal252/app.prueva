module com.example.giovanniprueba1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.giovanniprueba1 to javafx.fxml;
    exports com.example.giovanniprueba1;
}