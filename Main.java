import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

    public class Main {
        public static void main(String[] args) {
            // Pluralize
            int dogCount = 1 ;
            int catCount = 2;
            int turtleCount = 0;
            System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
            System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
            System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

//        // FlipNHeads
            flipNHeads(1);
            flipNHeads(4);
            flipNHeads(-6);
//
//        //clock
            clock();

        }

        public static String pluralize(String toPlural, int count) {
            if (count == 1) {
                return toPlural;
            } else {
                return toPlural + "s";
            }
        }
        public static void flipNHeads(int n) {
            int count = 0;
            int inRow = 0;
            while (inRow < n) {
                double randFlip = Math.random();
                if (randFlip < 0.5) {
                    inRow = 0;
                    System.out.println("tails");
                } else {
                    inRow++;
                    System.out.println("heads");
                }
                count++;
            }
            System.out.printf("It took %d %s to flip %d %s in a row.\n", count, pluralize("flip", count), n, pluralize("head", n));
        }

        public static void clock() {
            int delay = 0;
            int interval = 1000;
            Timer timer = new Timer();
            String pattern = "HH:mm:ss";

            TimerTask task = new TimerTask() {
                public void run() {
                    System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern(pattern)));
                }
            };
            timer.scheduleAtFixedRate(task, delay, interval);
        }

    }
