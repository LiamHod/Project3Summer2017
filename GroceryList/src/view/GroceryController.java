package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;
import model.GroceryItem;

public class GroceryController {

    private ObservableList<String> groceries = FXCollections.observableArrayList();

    @FXML
    private TextField itemTextBox;

    @FXML
    private TextField storeTextBox;

    @FXML
    private Button removeButton;

    @FXML
    private ListView<String> groceryListView;

    @FXML
    private void initialize(){
        //Initialized listview with observablelist
        groceryListView.setItems(groceries);
    }


    @FXML
    void handleAdd(ActionEvent event) {
        //Sets button text color back to black
        //Not necessary and could use Alert Box instead
        removeButton.textFillProperty().setValue(Paint.valueOf("black"));
        GroceryItem newItem = new GroceryItem(itemTextBox.getText(),storeTextBox.getText());
        groceries.add(newItem.getListItem());
        itemTextBox.clear();
        storeTextBox.clear();
    }

    @FXML
    void handleRemove(ActionEvent event) {
        if (groceries.size() != 0) {
            groceries.remove(groceries.size() - 1);
        }else{
            System.out.println("Nothing to remove");
            //Alters the color of text in button to red to indicate nothing to remove
            //Alert Box might be more effective
            removeButton.textFillProperty().setValue(Paint.valueOf("red"));
        }
    }

}
