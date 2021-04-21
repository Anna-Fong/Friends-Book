package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
    public TextField textName;
    public TextField textAge;
    public TextField textPhoneNumber;
    public ListView<Friend> listFriends = new ListView<>();
    public Label labelName;
    public Label labelAge;
    public Label labelPhoneNumber;

    public void createFriend() {
        String name = textName.getText();
        int age = Integer.parseInt(textAge.getText());
        String phoneNumber = (textPhoneNumber.getText());
        Friend friend = new Friend(name, age, phoneNumber);
        listFriends.getItems().add(friend);
        textAge.clear();
        textName.clear();
        textPhoneNumber.clear();
    }

    public void displayFriend() {
        Friend friend = listFriends.getSelectionModel().getSelectedItem();
        if (friend == null) {
            return;
        }
        labelName.setText("Name: " + friend.getName());
        int age = (friend.getAge());
        labelAge.setText("Age: " + age);
        String phoneNumber = (friend.getPhoneNumber());
        labelPhoneNumber.setText("Number: " + phoneNumber);
    }

    public void removeFriend(ActionEvent actionEvent) {
        Friend friend = listFriends.getSelectionModel().getSelectedItem();
        if (friend == null) {
            return;
        }
        listFriends.getItems().remove(friend);
        labelName.setText("Name: ");
        labelAge.setText("Age: ");
        labelPhoneNumber.setText("Number: ");
    }

}

