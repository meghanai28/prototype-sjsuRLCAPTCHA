import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.ChoiceBox;

public class CheckoutController implements Initializable {

    @FXML
    private ChoiceBox<String> stateChoiceBox;
    @FXML
    private ChoiceBox<String> countryChoiceBox;

    //Four sample states to populate the dropdown
    private final String[] states = { "California", "Ohio", "New York", "Florida" };

    //Sample countries
    private final String[] countries = { "United States", "Canada", "Mexico" };

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Populate states ChoiceBox
        stateChoiceBox.getItems().addAll(states);
        stateChoiceBox.setValue("Select State");

        // Populate countries ChoiceBox
        countryChoiceBox.getItems().addAll(countries);
        countryChoiceBox.setValue("Select Country");
    }
}
