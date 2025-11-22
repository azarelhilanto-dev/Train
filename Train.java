/**
 * The Train class models a real-world train with various attributes and behaviors.
 * It uses a Conductor object as one of its instance variables.
 * // Comments done mainly by Chat GPT, Code done by Github Copilot + Azarel Hilanto + Chat GPT
 */
public class Train {

    /** The number of wheels the train has. */
    private int wheels;

    /** The current speed of the train in km/h. */
    private double speed;

    /** The conductor in charge of the train (person object). */
    private Conductor conductor;

    /** The number of passengers currently on the train. */
    private int passengers;

    /** Whether the train's wings are attached and working (for flying). */
    private boolean wingsAttached;

    /** Whether music is currently playing on the train. */
    private boolean musicOn;

    /** Whether the train is flipped upside down. */
    private boolean flipped;

    /**
     * Default constructor that creates a generic train.
     */
    public Train() {
        this.wheels = 41;
        this.speed = 6700000;
        this.conductor = new Conductor("Azarel", 5000);
        this.passengers = 100000;
        this.wingsAttached = false;
        this.musicOn = false;
        this.flipped = false;
    }

    /**
     * Constructs a Train with all details specified.
     *
     * @param wheels        the number of wheels
     * @param speed         the current speed in km/h
     * @param conductor     the conductor object in charge
     * @param passengers    the number of passengers
     * @param wingsAttached whether the wings are attached
     * @param musicOn       whether music is currently playing
     * @param flipped       whether the train is flipped upside down
     */
    public Train(int wheels, double speed, Conductor conductor,
                 int passengers, boolean wingsAttached, boolean musicOn,
                 boolean flipped) {
        this.wheels = wheels;
        this.speed = speed;
        this.conductor = conductor;
        this.passengers = passengers;
        this.wingsAttached = wingsAttached;
        this.musicOn = musicOn;
        this.flipped = flipped;
    }

    // ------- Getters -------

    public int getWheels() {
        return wheels;
    }

    public double getSpeed() {
        return speed;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public int getPassengers() {
        return passengers;
    }

    public boolean isWingsAttached() {
        return wingsAttached;
    }

    public boolean isMusicOn() {
        return musicOn;
    }

    public boolean isFlipped() {
        return flipped;
    }

    // ------- Setters -------

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public void setWingsAttached(boolean wingsAttached) {
        this.wingsAttached = wingsAttached;
    }

    public void setMusicOn(boolean musicOn) {
        this.musicOn = musicOn;
    }

    public void setFlipped(boolean flipped) {
        this.flipped = flipped;
    }

    // ------- Behavior methods -------

    /** Makes the train honk its horn. */
    public void honk() {
        System.out.println("The train honks loudly: CHOO CHOO!");
    }

    /**
     * Simulates a crash. Speed goes to 0, train flips,
     * and passengers are set to 0 to represent everyone getting off.
     */
    public void crash() {
        System.out.println("The train has crashed! Passengers evacuate.");
        speed = 0;
        flipped = true;
        passengers = 0;
        musicOn = false;
        wingsAttached = false;
    }

    /** Flips the train upside down or back upright. */
    public void flip() {
        flipped = !flipped;
        if (flipped) {
            System.out.println("The irresponsable conductor flips the train cause he thinks it's cool");
        } else {
            System.out.println("The train is back upright.");
        }
    }

    /**
     * Tries to make the train fly. This only works if wings are attached
     * and the train is not flipped.
     */
    public void fly() {
        if (wingsAttached && !flipped) {
            System.out.println("The train spreads its wings and takes off into the sky!");
            speed = 300; // flying speed
        } else if (!wingsAttached) {
            System.out.println("The train cannot fly without wings.");
        } else if (flipped) {
            System.out.println("The train cannot fly while flipped upside down.");
        }
    }

    /**
     * Boards additional passengers onto the train.
     *
     * @param count the number of passengers to add
     */
    public void boardPassengers(int count) {
        if (count <= 0) {
            System.out.println("You must board a positive number of passengers.");
        } else {
            passengers += count;
            System.out.println(count + " passengers boarded. Total now: " + passengers);
        }
    }

    /**
     * Changes the train's speed to a new value.
     *
     * @param newSpeed the new speed in km/h
     */
    public void changeSpeed(double newSpeed) {
        if (newSpeed < 0) {
            System.out.println("Speed cannot be negative.");
        } else {
            speed = newSpeed;
            System.out.println("The train's speed is now " + speed + " mp/h.");
        }
    }

    /**
     * Starts playing music on the train.
     *
     * @param songName the name of the song to play
     */
    public void playMusic(String songName) {
        musicOn = true;
        System.out.println("Now playing: " + songName);
    }

    /** Stops the music on the train. */
    public void stopMusic() {
        musicOn = false;
        System.out.println("The music has been stopped.");
    }

    /**
     * Returns a String representation of the train.
     *
     * @return a description of the train and its state
     */
    public String toString() {
        return "Train{" +
                "wheels=" + wheels +
                ", speed=" + speed + " mp/h" +
                ", conductor=" + conductor +
                ", passengers=" + passengers +
                ", wingsAttached=" + wingsAttached +
                ", musicOn=" + musicOn +
                ", flipped=" + flipped +
                '}';
    }
}
