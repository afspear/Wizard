/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package wizard;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author afspear
 */
public abstract  class Player {
    protected int tired;
    //a hapiness value of 0 means that the player is neither happy(> 0) or sad (< 0)
    protected int happiness = 0;
    protected PlayerName name;
    protected  PlayerRole role;
    protected PlayerTransitiveVerb action;
    protected List<Objects> possessions = new ArrayList<Objects>();

    public Player(PlayerName name) {
        this.name = name;
    }

    public PlayerTransitiveVerb getAction() {
        return action;
    }

    public void setAction(PlayerTransitiveVerb action) {
        this.action = action;
    }

    public PlayerName getName() {
        return name;
    }

    public void setName(PlayerName name) {
        this.name = name;
    }

    public List<Objects> getPossessions() {
        return possessions;
    }

    public void addPossessions(Objects possession) {
        this.possessions.add(possession);
    }

    public PlayerRole getRole() {
        return this.role;
    }

    public void setRole(PlayerRole role) {
        this.role = role;
    }

    public Player() {
    }

    public abstract String tag(Player player);


}
