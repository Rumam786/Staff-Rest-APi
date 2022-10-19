package com.Myproject.Services;


import com.Myproject.Entities.staffMembers;
import com.Myproject.Exceptions.userNotFound;
import com.Myproject.Repositories.staffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class staffService {
    @Autowired
    private staffRepo staffRepo;

//    Add Users
    public staffMembers addusers(staffMembers staffMembers) {
        return staffRepo.save(staffMembers);
    }

//    Get All Users
    public List<staffMembers> getallusers() {
        return staffRepo.findAll();
    }

//    Get Single Users
public staffMembers getauser(int id) {
    Optional<staffMembers> optionalStudents = staffRepo.findById(id);
    if (!optionalStudents.isPresent())
        throw new userNotFound("User Record is Not Available......");
    return optionalStudents.get();
    }

//   Update Users
    public staffMembers updateUser(int id, staffMembers staffMembers) {
        Optional<staffMembers> optionalStaffMembers = staffRepo.findById(id);
        if (optionalStaffMembers.isPresent()) {
            staffMembers.setId(id);
        } else {
            throw new userNotFound("User Record is Not Available.....");
        }
        return staffRepo.save(staffMembers);
    }

//    Delete User
    public void deleteuser(int id) {
        staffRepo.deleteById(id);
    }
}






