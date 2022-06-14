module com.max.simplemanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.max.simplemanager to javafx.fxml;
    exports com.max.simplemanager;
}