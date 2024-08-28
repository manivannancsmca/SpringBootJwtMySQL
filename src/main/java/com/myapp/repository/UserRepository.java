package com.myapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myapp.entity.TblUser;

@Repository
public interface UserRepository extends JpaRepository<TblUser, Integer> {

	Optional<TblUser> findByName(String username);

}
