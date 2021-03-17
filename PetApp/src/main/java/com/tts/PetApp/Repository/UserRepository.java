package com.tts.PetApp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.tts.PetApp.Model.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}