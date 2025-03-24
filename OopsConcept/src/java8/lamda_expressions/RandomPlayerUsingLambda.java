package java8.lamda_expressions;


import java.util.Random;

class RandomPlayers {
    public void playGame(String name) throws InterruptedException {
        System.out.println(name + " game started");
        // assuming game is being played for 1 sec
        Thread.sleep(1000);
        System.out.println(name + " game ended");
    }

    public void playMusic(String name) throws InterruptedException {
        System.out.println(name + " track started");
        // assuming game is being played for 1 sec
        Thread.sleep(1000);
        System.out.println(name + " track ended");
    }
}


public class RandomPlayerUsingLambda {
    static String[] games = {"COD", "Prince Of Persia", "GTA-V5",
            "Valorant", "FIFA 22", "Fortnite"};
    static String[] tracks = {"Believer", "Cradles", "Taki Taki", "Sorry",
            "Let Me Love You"};

    public static void main(String[] args) {
        RandomPlayers player = new RandomPlayers();

        Random random = new Random();

        // lambda expressions for gaming players
        Runnable getRunner = () -> {
            try {
                player.playGame(games[random.nextInt(games.length)]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        // lambda expressions for tracks players
        Runnable musicPlayer = () -> {
            try {
                player.playMusic(tracks[random.nextInt(tracks.length)]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread game = new Thread(getRunner);
        Thread track = new Thread(musicPlayer);

        game.start();
        track.start();

        try {
            game.join();
            track.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The play is done :)");
    }
}
