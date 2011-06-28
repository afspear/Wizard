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
    protected boolean happiness;
    protected PlayerName name;
    protected  PlayerRole role;
    protected PlayerTransitiveVerb action;
    protected Objects possession;

    public Player(PlayerName name) {
        this.name = name;
    }

    public boolean isHappiness() {
        return happiness;
    }

    public void setHappiness(boolean happiness) {
        this.happiness = happiness;
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

    public Objects getPossessions() {
        return this.possession;
    }

    public void setPossessions(Objects possession) {
        this.possession = possession;
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
