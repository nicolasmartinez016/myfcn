package fr.personal.nmartinez.services;

import fr.personal.nmartinez.entities.Game;
import fr.personal.nmartinez.entities.Goal;
import fr.personal.nmartinez.entities.YellowCard;

import java.util.ArrayList;

/**
 * Created by marti on 14/07/2017.
 */
public class GameService {

    /**
     * Adds a goal to a game
     * @param game
     * @param goal
     */
    public static void addGoal(Game game, Goal goal){
        if (game.getGoals() == null){
            game.setGoals(new ArrayList<Goal>());
        }

        game.getGoals().add(goal);
        // make sure the goal is connected with this game
        goal.setGame(game);
    }

    /**
     * Adds a yellowcard to a game
     * @param game
     * @param yellowCard
     */
    public static void addYellowCard(Game game, YellowCard yellowCard){
        if (game.getYellowCards() == null){
            game.setYellowCards(new ArrayList<YellowCard>());
        }

        game.getYellowCards().add(yellowCard);
        // make sure the yellowcard is connected with this game
        yellowCard.setGame(game);
    }
}
