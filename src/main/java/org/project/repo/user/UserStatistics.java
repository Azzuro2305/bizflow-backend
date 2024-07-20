package org.project.repo.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserStatistics extends JpaRepository<UserStatistics, UUID> {

}