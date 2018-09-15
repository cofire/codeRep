package knowledge;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

/**
 * Created by gzx on 16-12-27.
 */
public class TalkingClock3 {
    public void start(int interval, final boolean beep) {
        Timer timer = null;
        // 匿名内部类，这里不需要出现类名，同时不能有构造函数。对于接口，用默认的无参构造函数。对于抽象类，可以是带实参的构造函数，且在()里面提供
        // 出错
        // beep = true;
        timer = new Timer(interval, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!beep) {
                    return;
                }
                // 出错
                // beep = false;
                System.out.println("time : " + new Date());
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        new TalkingClock3().start(1000, true);
        while (true) {
        }
    }
}
