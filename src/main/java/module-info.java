module com.example.c111118233_final_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;


    opens com.example.c111118233_final_project to javafx.fxml;
    exports com.example.c111118233_final_project;
}