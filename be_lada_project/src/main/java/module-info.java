module com.be_lada_project {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.be_lada_project to javafx.fxml;
    exports com.be_lada_project;
}
