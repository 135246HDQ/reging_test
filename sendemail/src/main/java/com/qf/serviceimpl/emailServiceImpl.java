package com.qf.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.entity.Email;
import com.qf.service.IEmailService;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;


import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class emailServiceImpl implements IEmailService {

private JavaMailSender javaMailSender;
    @Override
    public void sendemail(Email email)  {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper messageHelper=new MimeMessageHelper(mimeMessage);
        try {
            messageHelper.setSentDate(email.getSenddate());
            messageHelper.setText(email.getTitle());
            messageHelper.setFrom(email.getSender());
            messageHelper.addTo(email.getAddress());
            messageHelper.setSubject(email.getTop());
            javaMailSender.send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        }


    }
}
