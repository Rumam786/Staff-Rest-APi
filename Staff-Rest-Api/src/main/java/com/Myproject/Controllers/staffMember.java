package com.Myproject.Controllers;

import com.Myproject.Entities.staffMembers;
import com.Myproject.Services.staffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class staffMember {
    @Autowired
    private staffService staffService;

//    Add Users
    @PostMapping("/staffMembers")
    public staffMembers addusers(@RequestBody staffMembers staffMembers) {
        return staffService.addusers(staffMembers);
    }

//    Get All Users
    @GetMapping("/staffMembers")
    public List<staffMembers> getallusers() {
        return staffService.getallusers();
    }

//    Get a user
    @GetMapping("/staffMembers/{id}")
    public staffMembers getauser(@PathVariable("id") int id) {
        return staffService.getauser(id);
    }

//    Update Users
    @PutMapping("/staffMembers/{id}")
    public staffMembers updateuser(@PathVariable("id") int id, @RequestBody staffMembers staffMembers) {
        return staffService.updateUser(id, staffMembers);
    }

//    Delete Users
    @DeleteMapping("/staffMembers/{id}")
    public void deleteuser(@PathVariable("id") int id) {
        staffService.deleteuser(id);
    }
}
