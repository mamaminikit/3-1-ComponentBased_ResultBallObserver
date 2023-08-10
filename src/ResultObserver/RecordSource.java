/* Kitthanya Teachanontkullawat (Mine) 64050027
    Observer Pattern */
package ResultObserver;
import java.util.ArrayList;
/**
 * @author mmmaimankarae
 */

/* Relation with Notified to client
        "Body" */
public class RecordSource implements Source{
    private final ArrayList<BallObserver> name;
    private String match;
    
    public RecordSource() {
        this.name = new ArrayList<>();
    }
    public void setNewMatch(String match) {
        this.match = match;
        notiScored();
    }
    
    public String getMatch() {
        return this.match;
    }
        
    @Override
    public void notiScored() {
        for (int i = 0; i < name.size(); i++) {
            name.get(i).update(this);
        }
    }
    
    @Override
    public void register(BallObserver obsev) {
        name.add(obsev);
    }
    
    @Override
    public void signOut(BallObserver obsev) {
        name.remove(obsev);
    }
}
