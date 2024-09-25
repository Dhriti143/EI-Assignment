package SmartHomeSystem;

public class DoorLock extends Device {
    private boolean isLocked;

    public DoorLock(int id) {
        super(id);
        this.isLocked = true; // Default to locked
    }

    public void lock() {
        isLocked = true;
    }

    public void unlock() {
        isLocked = false;
    }

    @Override
    public String getStatus() {
        return "Door " + id + " is " + (isLocked ? "Locked" : "Unlocked");
    }
}