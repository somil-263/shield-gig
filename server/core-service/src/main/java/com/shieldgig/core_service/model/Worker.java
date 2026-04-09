package com.shieldgig.core_service.model;

import jakarta.persistence.*;

@Entity
@Table(name = "workers")
public class Worker {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String phone;

    private String platformId; // Zomato/Swiggy ID
    private String primaryZone; // e.g., Dharavi, Bandra
    private Double avgMonthlyEarnings;
    private Integer zarsScore = 0; 
    private String currentTier; // Shield Basic / Shield Plus

    // Default Constructor
    public Worker() {}

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getPlatformId() { return platformId; }
    public void setPlatformId(String platformId) { this.platformId = platformId; }
    public String getPrimaryZone() { return primaryZone; }
    public void setPrimaryZone(String primaryZone) { this.primaryZone = primaryZone; }
    public Double getAvgMonthlyEarnings() { return avgMonthlyEarnings; }
    public void setAvgMonthlyEarnings(Double avgMonthlyEarnings) { this.avgMonthlyEarnings = avgMonthlyEarnings; }
    public Integer getZarsScore() { return zarsScore; }
    public void setZarsScore(Integer zarsScore) { this.zarsScore = zarsScore; }
    public String getCurrentTier() { return currentTier; }
    public void setCurrentTier(String currentTier) { this.currentTier = currentTier; }
}