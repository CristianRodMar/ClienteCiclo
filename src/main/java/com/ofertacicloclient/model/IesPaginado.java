package com.ofertacicloclient.model;

import java.util.List;

public class IesPaginado {
	
    private int totalItems;
    private int totalPages;
    private List<Ies> iesList;
    private int currentPage;
    
	public int getTotalItems() {
		return totalItems;
	}
	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public List<Ies> getIesList() {
		return iesList;
	}
	public void setIesList(List<Ies> iesList) {
		this.iesList = iesList;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

    
}
