/* Kitthanya Teachanontkullawat (Mine) 64050027
    Observer Pattern */
package ResultObserver;

/**
 * @author mmmaimankarae
 */

/* Relation with Client (Notified to client) 
        "Stureture >> No body" */
public interface Source {
    public void notiScored();
    public void register(BallObserver obsev);
    public void signOut(BallObserver obsev);
}
