package knowledge;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

/**
 * Created by gzx on 16-12-27.
 */
public class TalkingClock {
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start() {
        ActionListener printer = new TimePrinter();
        Timer timer = new Timer(interval, printer);
        timer.start();
    }

    public class TimePrinter implements ActionListener {
        // �ڲ������ֱ��ʹ���ⲿ�������beep
        @Override
        public void actionPerformed(ActionEvent e) {
            // ������ʵ��TalkingClock.this.beep
            if (!beep) {
                return;
            }
            // this �������������TimePrinter��ʵ��
            Date now = new Date();
            System.out.println("time : " + now);
        }
    }

    /*
     * ÿ��һ�룬��ӡ�����ڣ�����ѭ�� time : Thu Dec 29 14:36:35 CST 2016 time : Thu Dec 29 14:36:36 CST 2016 time : Thu Dec 29
     * 14:36:37 CST 2016
     */
    public static void main(String[] args) {
        new TalkingClock(1000, true).start();
        while (true) {
        }
    }
}
