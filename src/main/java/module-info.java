module dk.asbjoern {
    requires javafx.controls;
    requires javafx.fxml;

    opens dk.asbjoern to javafx.fxml;
    exports dk.asbjoern;
}