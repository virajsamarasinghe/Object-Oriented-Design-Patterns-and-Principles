package viraj.com.commandPattern;

// Client
public class Client {
    public static void main(String[] args) {
        // Receiver
        Light livingRoomLight = new Light();

        // Commands
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Turn the light ON
        remote.setCommand(lightOn);
        remote.pressButton(); // Output: Light is ON

        // Turn the light OFF
        remote.setCommand(lightOff);
        remote.pressButton(); // Output: Light is OFF

        // Undo last action
        remote.pressUndo(); // Output: Light is ON
    }
}