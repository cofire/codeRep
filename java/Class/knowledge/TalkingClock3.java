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
        // �����ڲ��࣬���ﲻ��Ҫ����������ͬʱ�����й��캯�������ڽӿڣ���Ĭ�ϵ��޲ι��캯�������ڳ����࣬�����Ǵ�ʵ�εĹ��캯��������()�����ṩ
        // ����
        // beep = true;
        timer = new Timer(interval, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!beep) {
                    return;
                }
                // ����
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
