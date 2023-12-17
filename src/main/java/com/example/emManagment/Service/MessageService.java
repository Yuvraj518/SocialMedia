package com.example.emManagment.Service;
import com.example.emManagment.Model.Message;
import com.example.emManagment.Repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    MessageRepository messageRepository;

    public Message getMessageById(Long id) {
        return messageRepository.findById(id).orElse(null);
    }

    public Message createMessage(Message message) {
        // Add logic for message creation, validation, and business rules
        return messageRepository.save(message);
    }

    public void deleteMessage(Long id) {
        // Add logic for message deletion
        messageRepository.deleteById(id);
    }
}
