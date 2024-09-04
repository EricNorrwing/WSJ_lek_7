package com.ericnorrwing.wsj_lek_7.repository;

import com.ericnorrwing.wsj_lek_7.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {



}
