module com.cal.scientificcalculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires annotations;
    requires com.google.common;


    opens com.cal.scientificcalculator to javafx.fxml;
    exports com.cal.scientificcalculator;
}