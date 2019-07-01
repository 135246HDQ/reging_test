package com.qf.controller;
import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Email;
import com.qf.service.IEmailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/user")
public class UserController {
//    @Reference
//    private IEmailService iEmailService;

    @ResponseBody
    @RequestMapping("/toemail")
    public Object regin( Model model){

        return "111";

    }
//    @RequestMapping("sendemail")
//    public void send(Email email) throws Exception {
//        System.out.println(email.getAddress());
//       iEmailService.sendemail(email);
//
//
//    }
}
