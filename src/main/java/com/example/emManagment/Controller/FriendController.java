package com.example.emManagment.Controller;
import com.example.emManagment.Model.Friend;
import com.example.emManagment.Service.FriendService;
import com.example.emManagment.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("friends")
public class FriendController {
    @Autowired
    FriendService friendshipService;

    @PostMapping
    public ResponseEntity<Friend> createFriendship(@RequestBody Friend friendship) {
        Friend newFriendship = friendshipService.createFriend(friendship);
        return new ResponseEntity<>(newFriendship, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFriendship(@PathVariable Long id) {
        friendshipService.deleteFriend(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
