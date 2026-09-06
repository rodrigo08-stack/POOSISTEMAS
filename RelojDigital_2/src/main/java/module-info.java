module pe.edu.upeu.relojdigital_2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens pe.edu.upeu.relojdigital_2 to javafx.fxml;
    exports pe.edu.upeu.relojdigital_2;
}