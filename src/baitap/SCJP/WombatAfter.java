package baitap.SCJP;

class WombatAfter implements Runnable {
    private int i;

    public synchronized void run() {
        if (i % 5 != 0) {
            i++; // Tăng i nếu i không chia hết cho 5
        }
        for (int x = 0; x < 5; x++, i++) { // Tăng x và i qua mỗi lần lặp
            if (x > 1) {
                Thread.yield();
            }
        }
        System.out.print(i + " "); // In giá trị i
    }

    public static void main(String[] args) {
        Wombat wombatInstance = new Wombat(); // Tạo một đối tượng Wombat
        for (int x = 100; x > 0; --x) { // Tạo 100 lần
            new Thread(wombatInstance).start(); // Bắt đầu từng lần
        }
    }
}