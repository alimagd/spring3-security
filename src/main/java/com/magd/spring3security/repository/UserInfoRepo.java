package com.magd.spring3security.repository;


import com.magd.spring3security.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserInfoRepo extends JpaRepository<UserInfo, Integer> {

    Optional<UserInfo> findByName(String username);
}
