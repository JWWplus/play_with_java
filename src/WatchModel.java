import java.util.ArrayList;

/**
 * author: jiangweiwei
 */
public class WatchModel {
    public static void main(String[] args) {
        Police police = new Police();
        Thief thief = new Thief();

        Money money = new Money();
        money.addWatcher(police);
        money.addWatcher(thief);

        money.takeAction("100");
    }
}

interface Watcher {
    void update(String status);
}

interface Watched {
    void addWatcher(Watcher watcher);
    void deleteWater(Watcher watcher);
    void notifyAllWatcher(String status);
}

class Police implements Watcher {
    private String status;

    public String getStatus(){
        return status;
    }
    @Override
    public void update(String status) {
        this.status = status;
        System.out.println("police watch update");
    }
}

class Thief implements Watcher {
    private String status;

    public String getStatus() {
        return status;
    }
    @Override
    public void update(String status) {
        this.status = status;
        System.out.println("thief watch update");
    }
}

class Money implements Watched {
    private ArrayList<Watcher> watcherArrayList = new ArrayList<>();

    @Override
    public void addWatcher(Watcher watcher) {
        watcherArrayList.add(watcher);
    }

    @Override
    public void deleteWater(Watcher watcher) {
        watcherArrayList.remove(watcher);
    }

    @Override
    public void notifyAllWatcher(String status) {
        for (Watcher watcher: watcherArrayList) {
            watcher.update(status);
        }
    }

    public void takeAction(String status) {
        System.out.println("begin to take action!");
        notifyAllWatcher(status);
    }
}
