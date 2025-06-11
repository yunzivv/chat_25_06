package com.koreait.exam.chat_25_06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/chat")
public class ChatController {
    
    public List<ChatMessage> chatMessages = new ArrayList<ChatMessage>();
    public record writeChatMessageResponse(long id){

    }

    @PostMapping("/writeMessage")
    @ResponseBody
    public RsData writeMessage() {

        ChatMessage chatMessage = new ChatMessage("yunzi", "hello");
        chatMessages.add(chatMessage);
        return new RsData<>(
                "S-1",
                "메세지 작성됨",
                new writeChatMessageResponse(chatMessage.getId()));
    }
}

