module com.example.week14_practice1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week14_practice1 to javafx.fxml;
    exports com.example.week14_practice1;
}