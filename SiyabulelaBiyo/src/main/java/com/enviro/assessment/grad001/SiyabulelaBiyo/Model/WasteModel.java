package com.enviro.assessment.grad001.SiyabulelaBiyo.Model;

import jakarta.persistence.*;

@Entity
@Table
public class WasteModel {
    @Id
    @GeneratedValue
    private int id;

//    @Column(name="Waste_Category")
    private String wasteCategory;
//    @Column(name="Disposal_Guidlines")
    private String disposalGuideline;
//    @Column(name="Recycling_Tips")
    private String recyclingTips;

    public WasteModel() {
    }

//    public WasteModel(int id, String wasteCategory, String disposalGuideline, String recyclingTips) {
//        this.id = id;
//        this.wasteCategory = wasteCategory;
//        this.disposalGuideline = disposalGuideline;
//        this.recyclingTips = recyclingTips;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWasteCategory() {
        return wasteCategory;
    }

    public void setWasteCategory(String wasteCategory) {
        this.wasteCategory = wasteCategory;
    }

    public String getDisposalGuideline() {
        return disposalGuideline;
    }

    public void setDisposalGuideline(String disposalGuideline) {
        this.disposalGuideline = disposalGuideline;
    }

    public String getRecyclingTips() {
        return recyclingTips;
    }

    public void setRecyclingTips(String recyclingTips) {
        this.recyclingTips = recyclingTips;
    }

    @Override
    public String toString() {
        return "WasteModel{" +
                "id=" + id +
                ", wasteCategory='" + wasteCategory + '\'' +
                ", disposalGuideline='" + disposalGuideline + '\'' +
                ", recyclingTips='" + recyclingTips + '\'' +
                '}';
    }
}
