class ticket implements Runnable{
    private int num = 5000;

    @Override
    public void run() {
        while (num > 0){
            sale();
        }
    }

    public synchronized void sale(){
        if (num > 0){
            num--;
            System.out.println("num still" + Thread.currentThread().getName() + " " + num);
        }
    }
}

public class test {

    public static void main(String[] args) {
        ticket tic = new ticket();
        new Thread(tic).start();
        new Thread(tic).start();
        new Thread(tic).start();
        new Thread(tic).start();
        System.gc();
    }

}