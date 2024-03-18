package com.ai.nexus.backend.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tool_details") // Specify the table name
public class ToolDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "tool_name")
    private String toolName;

    @Column(name = "tool_image")
    private String toolImage;

    @Column(name = "tool_features", columnDefinition = "text")
    private String toolFeatures;

    @Column(name = "tool_website_link")
    private String toolWebsiteLink;

    @Column(name = "tool_demo_video_links", columnDefinition = "text")
    private String toolDemoVideoLinks;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "tool_tag", columnDefinition = "text")
    private String toolTag;

    @Column(name = "tool_description", columnDefinition = "text")
    private String toolDescription;
    @Column(name = "pricing_model",columnDefinition = "text")
    private String pricingModel;
}


