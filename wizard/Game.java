/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package wizard;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author afspear
 */
public class Game {

    ArrayList<Player> thePlayers;
    ArrayList<Objects> theObjects;
    Random random = new Random();

    public Game() {
        thePlayers = new ArrayList<Player>();
        theObjects = new ArrayList<Objects>();

        for(PlayerName playerName : PlayerName.values()){
            thePlayers.add(new Player(playerName));
        }

        for (ObjectType objectType : ObjectType.values()){
            theObjects.add(new Objects(objectType, ObjectPredicate.values()[random.nextInt(ObjectPredicate.values().length)]));
        }
    }

    private void roundZero() {
        //get random number
        double chance = random.nextDouble();

        //find out what quater of 100% chance is (0th, 1st, 2nd, or 3rd)
        int personIndex = (int) (chance * 4);

        //make that person the wizard
        WizardPlayer wizard = this.thePlayers.get(personIndex);
        wizard.addRoles(PlayerRole.wizard);
        wizard.addPossessions(new Objects(ObjectType.ring,ObjectPredicate.golden));

        //now make everybody else either lovers, i mean scouts, or fighters
        for (Player player : this.thePlayers) {
            if (player.getRoles().contains(PlayerRole.wizard)) {
            }
            else {
                if (this.thePlayers.indexOf(player) % 2 == ((int) chance * 2)) {
                    player.addRoles(PlayerRole.fighter);
                } else {
                    player.addRoles(PlayerRole.scout);
                }
                // make sure the kid gets to be a runner too
                player.addRoles(PlayerRole.runner);
            }
        }

    }

 


}
