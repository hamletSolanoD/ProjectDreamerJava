package com.chickenbrain.projectDreamer.models;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class DreamProject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Title;
    private String Description;
    private Float ImportanceScore;
    private Float UrgencyScore;
    private Float EnjoymentScore;
    private Float DreamScore;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DreamType> DreamTypes;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DreamTool> DreamTools;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DreamGrowthArea> DreamGrowthAreas;

    private Date EstimatedToBeFunctional;
    private Date EstimatedToBeEconomical;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DreamInversionItem> dreamInversionItems;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DreamIdea> DreamPrerequisites;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getDescription() {
        return this.Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Float getImportanceScore() {
        return this.ImportanceScore;
    }

    public void setImportanceScore(Float ImportanceScore) {
        this.ImportanceScore = ImportanceScore;
    }

    public Float getUrgencyScore() {
        return this.UrgencyScore;
    }

    public void setUrgencyScore(Float UrgencyScore) {
        this.UrgencyScore = UrgencyScore;
    }

    public Float getEnjoymentScore() {
        return this.EnjoymentScore;
    }

    public void setEnjoymentScore(Float EnjoymentScore) {
        this.EnjoymentScore = EnjoymentScore;
    }

    public List<DreamType> getDreamTypes() {
        return this.DreamTypes;
    }

    public void setDreamTypes(List<DreamType> DreamTypes) {
        this.DreamTypes = DreamTypes;
    }

    public List<DreamTool> getDreamTools() {
        return this.DreamTools;
    }

    public void setDreamTools(List<DreamTool> DreamTools) {
        this.DreamTools = DreamTools;
    }

    public List<DreamGrowthArea> getDreamGrowthAreas() {
        return this.DreamGrowthAreas;
    }

    public void setDreamGrowthAreas(List<DreamGrowthArea> DreamGrowthAreas) {
        this.DreamGrowthAreas = DreamGrowthAreas;
    }

    public Date getEstimatedToBeFunctional() {
        return this.EstimatedToBeFunctional;
    }

    public void setEstimatedToBeFunctional(Date EstimatedToBeFunctional) {
        this.EstimatedToBeFunctional = EstimatedToBeFunctional;
    }

    public Date getEstimatedToBeEconomical() {
        return this.EstimatedToBeEconomical;
    }

    public void setEstimatedToBeEconomical(Date EstimatedToBeEconomical) {
        this.EstimatedToBeEconomical = EstimatedToBeEconomical;
    }

    public List<DreamInversionItem> getDreamInversionItems() {
        return this.dreamInversionItems;
    }

    public void setDreamInversionItems(List<DreamInversionItem> dreamInversionItems) {
        this.dreamInversionItems = dreamInversionItems;
    }

    public List<DreamIdea> getDreamPrerequisites() {
        return this.DreamPrerequisites;
    }

    public void setDreamPrerequisites(List<DreamIdea> DreamPrerequisites) {
        this.DreamPrerequisites = DreamPrerequisites;
    }

    public Float getDreamScore() {
        return this.DreamScore;
    }

    public void setDreamScore() {
        this.DreamScore = (ImportanceScore * UrgencyScore * EnjoymentScore) / 3;
    }

}
