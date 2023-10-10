package com.ai.nexus.backend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.*;

@Entity
@Table(name = "tool_card")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ToolCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tool_id")
    private int toolId;

    @Column(name = "tool_name")
    private String toolName;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category;

//
//    @OneToOne(mappedBy = "toolCard", cascade = CascadeType.ALL, orphanRemoval = true)
//    @JsonBackReference
//    private ToolDetails toolDetails;
}
