/**
 * Represents a Train with specific attributes such as conductor, wheels, speed, and wings.
 */
public class train {

    // Instance variables
    private String conductor;
    private int wheels;
    private double speed;
    private boolean wings;

    /**
     * Constructs a Train object with the specified attributes.
     *
     * @param conductor The name of the conductor.
     * @param wheels    The number of wheels.
     * @param speed     The speed of the train.
     * @param wings     Whether the train has wings or not.
     */
    public train(String conductor, int wheels, double speed, boolean wings) {
        this.conductor = conductor;
        this.wheels = wheels;
        this.speed = speed;
        this.wings = wings;
    }

    /**
     * Gets the name of the conductor.
     *
     * @return The name of the conductor.
     */
    public String getConductor() {
        return conductor;
    }

    /**
     * Sets the name of the conductor.
     *
     * @param conductor The name of the conductor.
     */
    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    /**
     * Gets the number of wheels.
     *
     * @return The number of wheels.
     */
    public int getWheels() {
        return wheels;
    }

    /**
     * Sets the number of wheels.
     *
     * @param wheels The number of wheels.
     */
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    /**
     * Gets the speed of the train.
     *
     * @return The speed of the train.
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Sets the speed of the train.
     *
     * @param speed The speed of the train.
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * Checks if the train has wings.
     *
     * @return True if the train has wings, false otherwise.
     */
    public boolean hasWings() {
        return wings;
    }

    /**
     * Sets whether the train has wings or not.
     *
     * @param wings True if the train has wings, false otherwise.
     */
    public void setWings(boolean wings) {
        this.wings = wings;
    }
}
