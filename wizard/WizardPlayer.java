/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package wizard;

/**
 *
 * @author afspear
 */
public class WizardPlayer extends Player{

    public WizardPlayer(PlayerName name) {
        super(name);
    }

    public String hideObjects(Objects object1, Objects object2)
    {
        object1.find(false);
        object2.find(false);
        return ("hide(" + this.name.toString() + ", "  + object1.getType().toString()
                + ", " + object2.getType().toString() + ")");
    }

    public String tag(Player player)
    {
        player.role = PlayerRole.servant;
        return ("tag(" +this.name.toString() + ", " + player.name.toString()
                +")");
    }




}
