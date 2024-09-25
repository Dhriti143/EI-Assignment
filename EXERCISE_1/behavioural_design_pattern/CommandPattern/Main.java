package CommandPattern;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightOn, lightOff);

        // Turning the light on
        remoteControl.pressOnButton();

        // Turning the light off
        remoteControl.pressOffButton();
    }
}
