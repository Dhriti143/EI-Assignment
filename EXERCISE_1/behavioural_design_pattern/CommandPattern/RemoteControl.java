package CommandPattern;

public class RemoteControl {
    private Command commandOn;
    private Command commandOff;

    public void setCommand(Command commandOn, Command commandOff) {
        this.commandOn = commandOn;
        this.commandOff = commandOff;
    }

    public void pressOnButton() {
        if (commandOn != null) {
            commandOn.execute();
        } else {
            System.out.println("No command set for turning on the light.");
        }
    }

    public void pressOffButton() {
        if (commandOff != null) {
            commandOff.execute();
        } else {
            System.out.println("No command set for turning off the light.");
        }
    }
}
