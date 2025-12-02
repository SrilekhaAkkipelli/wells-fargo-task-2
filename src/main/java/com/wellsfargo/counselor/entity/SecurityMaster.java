package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "security_master")
public class SecurityMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    private String ticker;

    @Column(nullable = false)
    private String name;

    private String category;
    private String issuer;

    @OneToMany(mappedBy = "security")
    private List<PortfolioSecurity> holdings;

    public SecurityMaster() {}

    public SecurityMaster(String ticker, String name, String category, String issuer) {
        this.ticker = ticker;
        this.name = name;
        this.category = category;
        this.issuer = issuer;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public List<PortfolioSecurity> getHoldings() {
        return holdings;
    }

    public void setHoldings(List<PortfolioSecurity> holdings) {
        this.holdings = holdings;
    }
}
