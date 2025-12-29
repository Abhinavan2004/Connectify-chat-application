package Controller;

import Model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
   public ChatMessage send_Message(ChatMessage message){
       return message ;
   }

   @GetMapping("Chat")
    public String Chat(){
       return "Chat";
    }
}
