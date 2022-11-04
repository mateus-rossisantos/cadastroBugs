module com.example.cadastrobugsmateus {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.cadastrobugsmateus to javafx.fxml;
    exports com.example.cadastrobugsmateus;
    exports com.example.cadastrobugsmateus.controller;
    opens com.example.cadastrobugsmateus.controller to javafx.fxml;
}