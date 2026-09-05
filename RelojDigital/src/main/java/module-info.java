module pe.edu.upeu.relojdigital {
    requires javafx.controls;
    requires javafx.fxml;


    opens pe.edu.upeu.relojdigital to javafx.fxml;
    exports pe.edu.upeu.relojdigital;
}