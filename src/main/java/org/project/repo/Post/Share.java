package org.project.repo.Post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface Share extends JpaRepository<Share, UUID> {

}