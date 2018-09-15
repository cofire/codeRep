package knowledge;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

/**
 * Created by gzx on 16-12-27.
 */
public class TalkingClock2 {
    // 局部类不能改变beep
    public void start(int interval, final boolean beep) {
        Timer timer = null;
        // 类必须放在前面，否则下面语句会提示找不到类
        class TimerPrinter implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!beep) {
                    return;
                }
                // 出错
                // beep = false;
                System.out.println("time : " + new Date());
            }
        }
        // 出错
        // beep = true;
        timer = new Timer(interval, new TimerPrinter());
        timer.start();
    }

    public static void main(String[] args) {
        new TalkingClock2().start(1000, true);
        while (true) {
        }
    }
}
