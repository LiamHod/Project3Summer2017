package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class GroceryItem {

    private final StringProperty itemName;
    private final StringProperty storeName;

    public GroceryItem(String itemName,String storeName){
        this.itemName = new SimpleStringProperty(itemName);
        this.storeName = new SimpleStringProperty(storeName);
    }

    public String getItemName() {
        return itemName.get();
    }

    public StringProperty itemNameProperty() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName.set(itemName);
    }

    public String getStoreName() {
        return storeName.get();
    }

    public StringProperty storeNameProperty() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName.set(storeName);
    }

    public String getListItem(){
        return (itemName.get() + " from " + storeName.get());
    }
}
