/**
 * The TrainTester class tests the Train and Conductor classes.
 * // Comments done mainly by Chat GPT, Code done by Github Copilot + Azarel Hilanto + Chat GPT
 */
public class TrainTester {

    /**
     * The main method where the program starts running.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Create conductor objects
        Conductor defaultConductor = new Conductor("Azarel", 5000);
        Conductor crashingConductor = new Conductor("Jerry", 0);

        // Create a Train using the default constructor
        Train defaultTrain = new Train();

        // Create a Train using the full-argument constructor
        Train flyingTrain = new Train(
                24,              
                80.0,            
                crashingConductor,    
                120,             
                true,           
                true,          
                false           
        );

        // Print each train (calls toString())
        System.out.println("Cool Train:");
        System.out.println(defaultTrain);
        System.out.println();

        System.out.println("Boring flying train:");
        System.out.println(flyingTrain);
        System.out.println();

        // Behavior with parameters on each object
        defaultTrain.boardPassengers(50);
        flyingTrain.changeSpeed(150.0);

        System.out.println();

        // Behavior without parameters on each object
        defaultTrain.honk();
        flyingTrain.fly();

        System.out.println();

        // Extra behavior calls
        flyingTrain.playMusic("Fantasy");
        flyingTrain.flip();
        defaultTrain.crash();
        

        System.out.println();

        // Print again to see updated state
        System.out.println("After actions:");
        System.out.println("Default Train: " + defaultTrain);
        System.out.println("Flying Train: " + flyingTrain);
    }
}
