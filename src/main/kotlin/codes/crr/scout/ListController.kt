package codes.crr.scout

import javafx.fxml.FXML
import javafx.scene.control.ListView

class ListController {
    @FXML
    private lateinit var myList:ListView<String>

    @FXML
    fun initialize() {
        myList.items.addAll("Hello", "World")
    }
}