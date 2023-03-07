module com.example.webnew {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.example.webnew to javafx.fxml;
    exports com.example.webnew;
}