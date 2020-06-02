package com.izdebski.simpletextemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

public class SimpleTextEmail {

    public static void main(String[] args) {

        try {
            Email email = new SimpleEmail();

            // Configuration
            email.setHostName("smtp.googlemail.com");
            email.setSmtpPort(465);
            email.setAuthenticator(new DefaultAuthenticator(Data.SENDER,
                    Data.PASSWORD));

            // Required for gmail
            email.setSSLOnConnect(true);

            // Sender
            email.setFrom("user@gmail.com");

            // Email title
            email.setSubject("TestMail");

            // Email message
            email.setMsg("This is the second study e-mail ... :-)");

            // Receiver
            email.addTo(Data.RECEIVER);
            email.send();
            System.out.println("Sent!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}