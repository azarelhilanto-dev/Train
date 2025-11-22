/**
 * The Conductor class represents the person in charge of the train.
 * // Comments done mainly by Chat GPT, Code done by Github Copilot + Azarel Hilanto + Chat GPT
 */
public class Conductor {

    /** The name of the conductor. */
    private String name;

    /** The number of years of experience the conductor has. */
    private int yearsOfExperience;

    /**
     * Constructs a Conductor with the given name and years of experience.
     *
     * @param name              the conductor's name
     * @param yearsOfExperience the conductor's years of experience
     */
    public Conductor(String name, int yearsOfExperience) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }

    /**
     * Returns the conductor's name.
     *
     * @return the name of the conductor
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the conductor's name.
     *
     * @param name the new name of the conductor
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the conductor's years of experience.
     *
     * @return years of experience
     */
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    /**
     * Sets the conductor's years of experience.
     *
     * @param yearsOfExperience the new number of years of experience
     */
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    /**
     * Returns a String representation of the conductor.
     *
     * @return a description of the conductor
     */
    public String toString() {
        return name + " (" + yearsOfExperience + " yrs exp)";
    }
}
