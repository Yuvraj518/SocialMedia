package com.example.emManagment.Service;

import com.example.emManagment.Model.Friend;
import com.example.emManagment.Repository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendService {
    @Autowired
    FriendRepository friendRepository;

    public Friend createFriend(Friend friendship) {
        // Add logic for friendship creation, validation, and business rules
        return friendRepository.save(friendship);
    }

    public void deleteFriend(Long id) {
        // Add logic for friendship deletion
        friendRepository.deleteById(id);
    }
}
