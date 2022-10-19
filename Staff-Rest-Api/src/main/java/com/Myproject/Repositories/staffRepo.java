package com.Myproject.Repositories;

import com.Myproject.Entities.staffMembers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface staffRepo extends CrudRepository<staffMembers, Integer> {
    @Override
    List<staffMembers> findAll();
}
