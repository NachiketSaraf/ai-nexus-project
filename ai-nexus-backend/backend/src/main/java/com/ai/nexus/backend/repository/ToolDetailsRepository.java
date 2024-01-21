package com.ai.nexus.backend.repository;

import com.ai.nexus.backend.model.ToolDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ToolDetailsRepository extends JpaRepository<ToolDetails, Long> {
    ToolDetails findByToolName(String toolName);
    // Define custom query methods if needed
    List<ToolDetails> findByCategory_CategoryName(String categoryName);

    List<ToolDetails> findByToolTag(String toolTag);
}
