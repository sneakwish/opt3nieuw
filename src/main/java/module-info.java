module app.opt3nieuw {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens app.opt3nieuw to javafx.fxml;
    exports app.opt3nieuw;
    exports Controller;
    opens Controller to javafx.fxml;
    opens Model to javafx.base;
}