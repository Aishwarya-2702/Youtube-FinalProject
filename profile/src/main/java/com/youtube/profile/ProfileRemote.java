package com.youtube.profile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRemote extends JpaRepository<Profile,Integer> {

}
