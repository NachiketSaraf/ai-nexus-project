package com.ai.nexus.backend.repository;

import com.ai.nexus.backend.model.ToolDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ToolDetailsRepository extends JpaRepository<ToolDetails, Long> {
    ToolDetails findByToolName(String toolName);
    // Define custom query methods if needed
<<<<<<< HEAD
    List<ToolDetails> findByCategory_CategoryName(String categoryName);

<<<<<<< HEAD

=======
    List<ToolDetails> findByToolTag(String toolTag);
>>>>>>> 736a714 (New api to get tools with trending and recommended)
=======
>>>>>>> c11dc22 (discarded tool card)
}