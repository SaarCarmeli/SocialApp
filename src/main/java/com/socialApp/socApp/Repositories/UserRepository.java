package com.socialApp.socApp.Repositories;

import com.socialApp.socApp.Beans.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
