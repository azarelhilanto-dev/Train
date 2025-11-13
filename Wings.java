/**
 * Represents a Wing with specific attributes such as width, color, and whether it is sparkly.
 */
public class Wings {

    // Instance variables
    private double width;
    private String color;
    private boolean sparkly;

    /**
     * Constructs a Wings object with the specified attributes.
     *
     * @param width   The width of the wing.
     * @param color   The color of the wing.
     * @param sparkly Whether the wing is sparkly or not.
     */
    public Wings(double width, String color, boolean sparkly) {
        this.width = width;
        this.color = color;
        this.sparkly = sparkly;
    }

    /**
     * Gets the width of the wing.
     *
     * @return The width of the wing.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width of the wing.
     *
     * @param width The width of the wing.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Gets the color of the wing.
     *
     * @return The color of the wing.
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the wing.
     *
     * @param color The color of the wing.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Checks if the wing is sparkly.
     *
     * @return True if the wing is sparkly, false otherwise.
     */
    public boolean isSparkly() {
        return sparkly;
    }

    /**
     * Sets whether the wing is sparkly or not.
     *
     * @param sparkly True if the wing is sparkly, false otherwise.
     */
    public void setSparkly(boolean sparkly) {
        this.sparkly = sparkly;
    }
}
