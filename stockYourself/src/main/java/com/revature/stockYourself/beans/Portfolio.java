package com.revature.stockYourself.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
public class Portfolio {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int portfolioId;
	private String portfolioName;
	// private double points;
	@ManyToMany
	@JoinTable(name="portfolio_stock",
			joinColumns = @JoinColumn(name="portfolo_id"),
			inverseJoinColumns = @JoinColumn(name="stock_string"))
	private List<StockString> portfolioStingStocks;
	
	public Portfolio() {
		portfolioId = 0;
		portfolioName = " ";
		portfolioStingStocks = new ArrayList<>();
	}	
	
	public int getPortfolioId() {
		return portfolioId;
	}	
	
	public void setPortfolioId(int portfolioId) {
		this.portfolioId = portfolioId;
	}
	
	
	
	public String getPortfolioName() {
		return portfolioName;
	}

	public void setPortfolioName(String portfolioName) {
		this.portfolioName = portfolioName;
	}

	public List<StockString> getPortfolioStingStocks() {
		return portfolioStingStocks;
	}

	public void setPortfolioStingStocks(List<StockString> portfolioStingStocks) {
		this.portfolioStingStocks = portfolioStingStocks;
	}

	@Override
	public String toString() {
		return "Portfolio [portfolioId=" + portfolioId + ", portfolioName=" + portfolioName + ", portfolioStingStocks="
				+ portfolioStingStocks + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(portfolioId, portfolioName, portfolioStingStocks);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Portfolio other = (Portfolio) obj;
		return portfolioId == other.portfolioId && Objects.equals(portfolioName, other.portfolioName)
				&& Objects.equals(portfolioStingStocks, other.portfolioStingStocks);
	}
	
	

	
	
}