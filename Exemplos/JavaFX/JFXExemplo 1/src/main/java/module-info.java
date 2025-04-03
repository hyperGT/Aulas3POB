module gabriel.learnspring.jfxcampus {
    requires javafx.controls;
    requires javafx.fxml;


    opens gabriel.learnspring.jfxcampus to javafx.fxml;
    exports gabriel.learnspring.jfxcampus;
}