package com.koreait.exam.chat_25_06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/chat")
public class ChatController {
    
    ChatMessage chatMessage = new ChatMessage("yunzi", "hello");

    @PostMapping("/writeMessage")
    @ResponseBody
    public RsData<ChatMessage> writeMessage() {
        return new RsData("S-1", "메세지 작성됨", chatMessage);
    }
}
