package mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {
    public static void main(String[] args) {
        // �ռ��˵�������
        String to = "yli_666@163.com";

        // �����˵�������
        String from = "yli_666@163.com";

        // ָ�������ʼ�������Ϊ localhost
        String host = "localhost";

        // ��ȡϵͳ����
        Properties properties = System.getProperties();

        // �����ʼ�������
        properties.setProperty("mail.smtp.host", host);

        // ��ȡĬ��session����
        Session session = Session.getDefaultInstance(properties);

        try {
            // ����Ĭ�ϵ� MimeMessage ����
            MimeMessage message = new MimeMessage(session);

            // Set From: ͷ��ͷ�ֶ�
            message.setFrom(new InternetAddress(from));

            // Set To: ͷ��ͷ�ֶ�
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: ͷ��ͷ�ֶ�
            message.setSubject("This is the Subject Line!");

            // ������Ϣ��
            message.setText("This is actual message");

            // ������Ϣ
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}