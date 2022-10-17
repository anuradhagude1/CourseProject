package com.example.chatroom.edu_chat_room;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SessionController {

	@RequestMapping("session_data")
	public String SessionData(){
		return "sessiondata.html";
	}
}
