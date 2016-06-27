package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.type_square.Entity;
import sample.type_square.EntityType;
import sample.type_square.Property;
import sample.type_square.PropertyType;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller
        implements Initializable {

    // Property Tab
    @FXML
    private Button addProperty;
    @FXML
    private TextField propertyName;
    @FXML
    private TableView<PropertyType> propertyList;
    @FXML
    private ComboBox<EntityType> entityCombo;
    @FXML
    private TableColumn<PropertyType, EntityType> entityColumn;
    @FXML
    private TableColumn<PropertyType, String> propertyColumn;


    ObservableList properties = FXCollections.observableArrayList();


    // Entity Tab
    @FXML
    private Button addEntity;
    @FXML
    private TextField entityName;
    @FXML
    private ListView entityList;

    ObservableList entities = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        entityList.setItems(entities);
        entityCombo.setItems(entities);

        // Property Table Setup
        entityColumn.setCellValueFactory( new PropertyValueFactory<>("entityType"));
        propertyColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        propertyList.setItems(properties);


        addEntity.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                entities.add(new EntityType(entityName.getText()));
            }
        });

        addProperty.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                properties.add(new PropertyType(entityCombo.getValue(), propertyName.getText()));

            }
        });
    }


}
