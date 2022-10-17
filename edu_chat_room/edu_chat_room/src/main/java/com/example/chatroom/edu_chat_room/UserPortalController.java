package com.example.chatroom.edu_chat_room;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserPortalController {

	@RequestMapping("user_login")
	public String login(){
		return "userLogin.html";
	}
	@RequestMapping("user_sign_up")
	public String signUp(){
		return "userSignUp.html";
	}

}
