package com.springbootbasics.spring_boot_basics.repository;

import com.springbootbasics.spring_boot_basics.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, String> {
}
