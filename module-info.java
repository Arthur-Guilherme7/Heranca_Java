module org.laboratorio.br.atividadeg {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens org.laboratorio.br.atividadeg to javafx.fxml;
    exports org.laboratorio.br.atividadeg;
}