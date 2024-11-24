package baitap.Lab11Hoc;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class HelloWorld extends Thread {
    @Override
    public void run() {
        System.out.println(" start thread");
        long sum = 0L;
        for (long i = 0L; i < 10000000000L; i++) {
            sum += i;
        }
        System.out.println(" end thread");
// TODO Auto-generated method stub
    }
    public static void main(String[] args) throws IOException {
        Date date = new Date();
        System.out.println("start [" + date.toString() + "] " );

        int MAX = 2;
        for (int i = 0; i < MAX; i++) {
            (new HelloWorld()).start();
        }

//        long sum1 = 0L;
//        long sum2 = 0L;
//
//        for (long i = 0L; i < 10000000000L; i++) {
//            sum1 += i;
//        }
//
//        for (long i = 0L; i < 10000000000L; i++) {
//            sum2 += i;
//        }
        Date date_end = new Date();
        System.out.println("finish [" + date_end.toString() + "] " );
        long diffInMillies = Math.abs(date.getTime() - date_end.getTime());
        long diff = TimeUnit.SECONDS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        System.out.println("excution time :" + diff + " SECONDS" );


    }
}
