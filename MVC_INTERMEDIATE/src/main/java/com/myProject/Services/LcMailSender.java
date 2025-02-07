package com.myProject.Services;

public interface LcMailSender {
    void sendMail(String userMail,String result,String userName,String crushName)throws Exception;
    void feedBackMailResoponce(String userName,String userMail) ;
}
