
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String file = scan.nextLine();
        
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        int games = 0;
        int wins = 0;
        
        
        try (Scanner fileReader = new Scanner(Paths.get(file))){
            
            while (fileReader.hasNextLine()){
                
                String row = fileReader.nextLine();
                String[] parts = row.split(",");
                
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int awayPoints = Integer.valueOf(parts[3]);
                
                if (team.equals(homeTeam) || team.equals(awayTeam)){
                    games ++;
                    
                }
                
                if (team.equals(homeTeam)){
                    if (homePoints > awayPoints){
                        wins ++;
                    }
                }else if (team.equals(awayTeam)){
                    if (awayPoints > homePoints){
                        wins++;
                    }
                }
                
                
                
                
                
                
                
                
               
            }
            
        }catch (Exception e){
            System.out.println("Error");
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (games - wins));

    }

}
