
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        ArrayList<Game> games = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);

                games.add(new Game(homeTeam, visitingTeam, homePoints, visitingPoints));
            }
            
            System.out.println("Team:");
            String teamName = scan.nextLine();
            int countGames = 0;
            int wins = 0;
            int losses = 0;
            for(Game g : games) {
                if(g.getHomeTeam().equals(teamName) || g.getVisitingTeam().equals(teamName)) {
                    countGames++;
                    if(g.getHomeTeam().equals(teamName) && g.getHomePoints() > g.getVisitingPoints()){
                        wins++;
                    }
                    else if (g.getVisitingTeam().equals(teamName) && g.getVisitingPoints() > g.getHomePoints()) {
                        wins++;
                    }
                    else if(g.getHomeTeam().equals(teamName) && g.getHomePoints() < g.getVisitingPoints()){
                        losses++;
                    }
                    else if (g.getVisitingTeam().equals(teamName) && g.getVisitingPoints() < g.getHomePoints()) {
                        losses++;
                    }
                }
            }
            System.out.println("Games: " + countGames);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
