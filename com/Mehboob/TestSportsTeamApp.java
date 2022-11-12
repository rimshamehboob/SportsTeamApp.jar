package com.Mehboob;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import com.Mehboob.Team;

public class TestSportsTeamApp {

    public static void main(String[] args) {

        String contFlag;
        do {
            Scanner input = new Scanner(System.in);
        //Prompt the team name
        System.out.println("Welcome to the Sports Team APP");
        System.out.print("Enter a team name:");
        String teamName = input.nextLine();

        System.out.println("Enter the player names:");
        System.out.println("\thint:use commas for multiple players; no spaces>anne,angel,makena");
        String playerNames =  input.nextLine();

        //convert layerNames data to arrays
        String [] playersArray = playerNames.split(",");

        //add the input data to the class object
        Team teamObj = new Team(teamName,playersArray);

        //print the team summary
        System.out.println("---Team Summary----");
        System.out.println("Numbers of players in team: "+teamObj.getPlayerCount()+"\n");
        System.out.println("Players on team: "+teamObj.getPlayersOnTheTeam());

        System.out.println("\nContinue? (y/n)");
        contFlag =input.nextLine();


        }while(contFlag.equals("y") );

        
    }

}
