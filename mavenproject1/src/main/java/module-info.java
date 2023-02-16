module com.tvc.mavenproject1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.tvc.mavenproject1 to javafx.fxml;
    exports com.tvc.mavenproject1;
}
