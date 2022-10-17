package com.example.chatroom.edu_chat_room;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AdminPortalController {
	@RequestMapping("admin_login")
	public String login(){
		return "adminLogin.html";
	}
	@RequestMapping("admin_sign_up")
	public String signUp(){
		return "adminSignUp.html";
	}
}
