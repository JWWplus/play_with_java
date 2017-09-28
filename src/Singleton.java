import sun.applet.Main;

import java.util.Arrays;

/**
 * author: jiangweiwei
 */
public class Singleton {
    private static Singleton instance;
    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Elvis jww = Elvis.INSTANCE;
        jww.printFavorites();
    }
}

class Singleton_v2 {
    private static Singleton_v2 instance;
    private Singleton_v2() {}

    public static synchronized Singleton_v2 getInstance() {
        if (instance == null) {
            instance = new Singleton_v2();
        }
        return instance;
    }
}

class Singleton_v3 {
    private static Singleton_v3 instance;
    private Singleton_v3() {}

    public static Singleton_v3 getInstance() {
        if (instance == null) {
            synchronized (Singleton_v3.class) {
                if (instance == null)
                    instance = new Singleton_v3();
            }
        }
        return instance;
    }
}

class Singleton_v4 {
    private final static Singleton_v4 instance = new Singleton_v4();
    private Singleton_v4(){}

    public Singleton_v4 getinstance() {
        return instance;
    }
}

class Singleton_v5 {
    private Singleton_v5() {}

    private static class Singletonholder{
        private static final Singleton_v5 instance = new Singleton_v5();
    }

    public static Singleton_v5 getinstance(){
        return Singletonholder.instance; // 可以访问内部类的私有成员
    }
}

enum Elvis {
    INSTANCE;
    private final String[] favoriteSongs =
            { "Hound Dog", "Heartbreak Hotel" };
    public void printFavorites() {
        System.out.println(Arrays.toString(favoriteSongs));
    }
}