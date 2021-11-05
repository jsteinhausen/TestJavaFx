module test.javafx.testjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens test.javafx.testjavafx to javafx.fxml;
    exports test.javafx.testjavafx;
}