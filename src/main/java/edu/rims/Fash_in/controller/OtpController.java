package edu.rims.Fash_in.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OtpController {
    @GetMapping("/customer/otp-login")
    String otplogin() {
        return "customer/otp-login";
    }
}
