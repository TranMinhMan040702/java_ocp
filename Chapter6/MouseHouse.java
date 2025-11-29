/**
* Example: initializing final Fields
*/

public class MouseHouse {
    private final int volume;
    private final String type;

    /**
    * ========================================
    * All final instance variable are not assigned a value in the constructor => compile error
    * ========================================
    */
    public MouseHouse(int volume) {
        this.volume = volume;
    }

    public MouseHouse(String type) {
        this.type = type;
    }

    /**
    * ========================================
    * Reassign a intance varialbe is initialized in instance initializer => compile error
    * ========================================
    */
    {
        volume = 3;
    }
    public MouseHouse(String type, int volume) {
        this.type = type;
        this.volume = volume;
    }
}