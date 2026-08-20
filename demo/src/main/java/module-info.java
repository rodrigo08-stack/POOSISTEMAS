module pe.edu.upeu.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens pe.edu.upeu.demo to javafx.fxml;
    exports pe.edu.upeu.demo;
}