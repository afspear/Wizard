/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package wizard;

/**
 *
 * @author afspear
 */
public class Objects {

    
    private boolean found;
    private ObjectPredicate predicate;
    private ObjectType type;
    private Player owner;

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public Objects(ObjectType type, ObjectPredicate op){
        this.predicate = op;
        this.type = type;
    }

    public boolean isFound() {
        return found;
    }

    public void find(boolean isFound) {
        this.found = isFound;
    }

    public ObjectPredicate getPredicate() {
        return predicate;
    }
    
    public ObjectType getType() {
        return type;
    }


}
