package pe.edu.upeu.relojdigital;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class RelojDigital extends Application {

    private final Label hora = new Label();
    private final Label fecha = new Label();

    @Override
    public void start(Stage ventana) {

        hora.setTextFill(Color.WHITE);
        hora.setFont(Font.font("Arial", 70));

        fecha.setTextFill(Color.LIGHTGRAY);
        fecha.setFont(Font.font("Arial", 22));

        VBox pantalla = new VBox(25);
        pantalla.setAlignment(Pos.CENTER);
        pantalla.setStyle("-fx-background-color: #101820;");

        pantalla.getChildren().addAll(hora, fecha);

        actualizarReloj();

        Timeline reloj = new Timeline(
                new KeyFrame(
                        Duration.seconds(1),
                        evento -> actualizarReloj()
                )
        );

        reloj.setCycleCount(Animation.INDEFINITE);
        reloj.play();

        Scene escena = new Scene(pantalla, 500, 300);

        ventana.setTitle("Reloj Digital");
        ventana.setScene(escena);
        ventana.show();
    }

    private void actualizarReloj() {

        LocalDateTime ahora = LocalDateTime.now();

        DateTimeFormatter formatoHora =
                DateTimeFormatter.ofPattern("HH:mm:ss");

        DateTimeFormatter formatoFecha =
                DateTimeFormatter.ofPattern(
                        "EEEE, dd 'de' MMMM 'de' yyyy",
                        new Locale("es", "ES")
                );

        hora.setText(ahora.format(formatoHora));

        fecha.setText(ahora.format(formatoFecha));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
