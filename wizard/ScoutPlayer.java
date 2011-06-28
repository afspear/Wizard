/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wizard;

/**
 *
 * @author afspear
 */
public class ScoutPlayer extends Player {

    public ScoutPlayer(PlayerName name) {
        super(name);
        this.role = PlayerRole.runner;
    }

    @Override
    public String tag(Player playerITag) {
        if (this.role == PlayerRole.runner) {
            if (playerITag.role == PlayerRole.servant) {
                playerITag.role = PlayerRole.runner;
            }

        }
        if (this.role == PlayerRole.servant) {
            if (playerITag.role == PlayerRole.runner) {
                playerITag.role = PlayerRole.servant;
            }

        }
        return "String that explains the situation.";
    }

     public String beingChased (Player playerChasingMe) {
         if(this.possession.getType() == ObjectType.balloon)



    }
}
