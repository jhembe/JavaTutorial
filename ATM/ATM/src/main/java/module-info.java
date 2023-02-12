module com.hembe.atm {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;

    opens com.hembe.atm to javafx.fxml;
    exports com.hembe.atm;
}