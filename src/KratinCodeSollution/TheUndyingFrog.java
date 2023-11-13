package KratinCodeSollution;

// The Undying Frog
//
//         Three frogs Jim, Jack and John decide to race. They come together hopping and get ready on the start line and wait for buzzer to start the race. Each frog takes 2 seconds to complete a jump. Bot each frog has a variable jump length. Jim jumps 22 centimeters in 2 seconds. Jack jumps 17 centimeters in 2 seconds and John jumps 14 centimeters in 2 seconds.
//
//         As these frogs jump with a lot of energy, they need some time to rest between jumps. Jim takes 2 seconds of rest after 1 jump, Jack takes 2 seconds of rest after 2 jumps and John takes 2 seconds of rest after 4 jumps
//
//         You are the judge in this race, and you will have to write a program which will decide who is the winner if given time t in seconds. For example, the program will take an input of the number of seconds and you will have to give output of who is the winner and the distance of that winner from the start line.

public class TheUndyingFrog {

    public static void main(String[] args) {
        int t1 = 10;
        int t2 = 30;
        int t3 = 36;

        runRace(t1);
        runRace(t2);
        runRace(t3);
    }
        public static void runRace(int t){
            String winnerName;
            double winnerDistance;

            Frog[] frogs = {
                    new Frog("Jim", 22, 1),
                    new Frog("jack", 17, 2),
                    new Frog("jhon", 14, 4)
            };
            for (int second = 0; second < t; second++) {
                for (Frog frog : frogs) {
                    if (frog.getJumps() % frog.getRestInterval() == 0) {
                        frog.setResting(true);
                    }

                    if (!frog.isResting()) {
                        frog.setProgress(frog.getProgress() + frog.getJumpLength());
                    }

                    if (frog.isResting()) {
                        frog.setRestCounter(frog.getRestCounter() + 1);
                    }

                    if (frog.getRestCounter() == 2) {
                        frog.setResting(false);
                        frog.setRestCounter(0);
                    }

                    frog.setJumps(frog.getJumps() + 1);
                }
            }

            Frog winner = frogs[0];
            for (Frog frog : frogs) {
                if (frog.getProgress() > winner.getProgress()) {
                    winner = frog;
                }
            }

            winnerName = winner.getName();
            winnerDistance = winner.getProgress();

            System.out.println("For " + t + " seconds, Winner is " + winnerName + " at a distance of " + winnerDistance + " centimeters from the start line.");
        }
        }
        
    
class Frog{
    private String name;
    private double jumpLength;
    private int restIntervel;
    private int jumps;
    private double progress;
    private boolean isResting;
    private int restCounter;

    public Frog(String name, double jumpLength, int restIntervel){
        this.name=name;
        this.jumpLength=jumpLength;
        this.restIntervel=restIntervel;
        this.jumps=0;
        this.progress=0;
        this.isResting=false;
        this.restCounter=0;
    }

    public String getName() {
        return name;
    }

    public double getJumpLength() {
        return jumpLength;
    }

    public int getRestIntervel() {
        return restIntervel;
    }

    public int getJumps() {
        return jumps;
    }

    public double getProgress() {
        return progress;
    }

    public boolean isResting() {
        return isResting;
    }

    public int getRestCounter() {
        return restCounter;
    }

    public void setJumps(int jumps) {
        this.jumps = jumps;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }

    public void setResting(boolean resting) {
        isResting = resting;
    }

    public void setRestCounter(int restCounter) {
        this.restCounter = restCounter;
    }

    public int getRestInterval() {
        return restIntervel;
    }
}
