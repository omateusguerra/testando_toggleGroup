module com.example.estudosjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.estudosjavafx to javafx.fxml;
    exports com.example.estudosjavafx;
}