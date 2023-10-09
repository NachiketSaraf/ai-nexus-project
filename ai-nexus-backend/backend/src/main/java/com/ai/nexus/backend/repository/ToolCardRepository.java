package com.ai.nexus.backend.repository;
import com.ai.nexus.backend.model.Category;
import com.ai.nexus.backend.model.ToolCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ToolCardRepository extends JpaRepository<ToolCard, Integer> {
    List<ToolCard> findByCategory(Category category);

//    @Query("SELECT t.toolName FROM ToolCard t WHERE t.toolName = :toolName")
    ToolCard findByToolName(String toolName);

    @Query("SELECT t.toolName FROM ToolCard t WHERE t.category.categoryName = :categoryName")
    List<String> findToolNamesByCategoryName(@Param("categoryName") String categoryName);

    @Query("SELECT t.toolName, t.description FROM ToolCard t INNER JOIN t.category c WHERE c.categoryName = :categoryName")
    List<Object[]> findToolNamesAndDescriptionsByCategoryName(@Param("categoryName") String categoryName);
}