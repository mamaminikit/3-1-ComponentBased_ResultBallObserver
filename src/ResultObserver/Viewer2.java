/* Kitthanya Teachanontkullawat (Mine) 64050027
    Observer Pattern */
package ResultObserver;

/**
 * @author mmmaimankarae
 */

// register 2
public class Viewer2 implements BallObserver{
    @Override
    public void update(Source o) {
        System.out.println("live result: " + ((RecordSource)o).getMatch());
    }
}
