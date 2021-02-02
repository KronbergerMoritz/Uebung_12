package viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.ColorCode;
import model.Model;

public class Controller extends Model {

    private Model model = new Model();

    @FXML
    private Label l_red;

    @FXML
    private TextField tf_red;

    @FXML
    private Label l_green;

    @FXML
    private TextField tf_green;

    @FXML
    private Label l_blue;

    @FXML
    private TextField tf_blue;

    @FXML
    private Button btn_red_add;

    @FXML
    private Button btn_red_sub;

    @FXML
    private Button btn_green_add;

    @FXML
    private Button btn_green_sub;

    @FXML
    private Button btn_blue_add;

    @FXML
    private Button btn_blue_sub;

    @FXML
    private TextField tf_hex;

    @FXML
    private Button btn_color;

    @FXML
    private void setBtn_color()
    {

        int blue = model.getBlue();

        int green = model.getGreen();

        int red = model.getRed();


        tf_hex.setText(model.getHex());
        btn_color.setStyle("-fx-background-color: rgb(" + red + ", " + green + ", " + blue + ");");
    }

    @FXML
    private void setTf_blue()
    {
        if(!tf_blue.getText().equals("")) {
            model.changColorViaAbsoluteValue(ColorCode.BLUE, Integer.parseInt(tf_blue.getText()));
            setBtn_color();
        }
    }

    @FXML
    private void setTf_green()
    {
        if(!tf_green.getText().equals("")) {
            model.changColorViaAbsoluteValue(ColorCode.GREEN, Integer.parseInt(tf_green.getText()));
            setBtn_color();
        }
    }


    @FXML
    private void setTf_red()
    {
        if(!tf_red.getText().equals("")) {
            model.changColorViaAbsoluteValue(ColorCode.RED, Integer.parseInt(tf_red.getText()));
            setBtn_color();
        }

    }

    @FXML
    void blue_add(MouseEvent event)
    {

        model.changColorViaRelativeValue(ColorCode.BLUE, 10);
        tf_blue.setText(Integer.toString(model.getBlue()));
        setBtn_color();
    }

    @FXML
    void blue_sub(MouseEvent event) {
        model.changColorViaRelativeValue(ColorCode.BLUE, -10);
        tf_blue.setText(Integer.toString(model.getBlue()));
        setBtn_color();
    }

    @FXML
    void green_add(MouseEvent event) {
        model.changColorViaRelativeValue(ColorCode.GREEN, 10);
        tf_green.setText(Integer.toString(model.getGreen()));
        setBtn_color();
    }

    @FXML
    void green_sub(MouseEvent event) {
        model.changColorViaRelativeValue(ColorCode.GREEN, -10);
        tf_green.setText(Integer.toString(model.getGreen()));
        setBtn_color();
    }

    @FXML
    void red_add(MouseEvent event) {
        model.changColorViaRelativeValue(ColorCode.RED, 10);
        tf_red.setText(Integer.toString(model.getRed()));
        setBtn_color();
    }

    @FXML
    void red_sub(MouseEvent event) {
        model.changColorViaRelativeValue(ColorCode.RED, -10);
        tf_red.setText(Integer.toString(model.getRed()));
        setBtn_color();
    }
    @FXML
    void load(MouseEvent event)
    {
        model.loadColors();
        tf_red.setText(""+model.getRed());
        tf_blue.setText(""+model.getBlue());
        tf_green.setText(""+model.getGreen());
        setBtn_color();
    }

    @FXML
    void save(MouseEvent event)
    {
        model.saveColors();
    }

}