package com.chickenbrain.projectDreamer.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chickenbrain.projectDreamer.models.DreamUser;

@Repository
public interface userRepository extends JpaRepository<DreamUser, Long> {

    List<DreamUser> findByPassword(String clave);

    DreamUser findByEmail(String email);
}
