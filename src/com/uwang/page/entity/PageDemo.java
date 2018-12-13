package com.uwang.page.entity;

import java.util.List;

/**
 *  ��ҳģ��
 *  ����ר�Ŵ����ҳ��Ϣ
 *
 */
public class PageDemo<T> {

	
	// ��ҳ��
	private int totalPage;
	
	// һҳ��ʾ���ݿ�����
	private int pageSize=10;
	
	// ������
	private int totalNum;
	
	// ��ǰҳ
	private int thisPage=1;
	
	// װ������
	private List<T> pageList; 

	public List<T> getPageList() {
		return pageList;
	}

	public void setPageList(List<T> pageList) {
		this.pageList = pageList;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}

	public int getThisPage() {
		return thisPage;
	}

	public void setThisPage(int thisPage) {
		this.thisPage = thisPage;
	}

	@Override
	public String toString() {
		return "PageDemo [totalPage=" + totalPage + ", pageSize=" + pageSize + ", totalNum=" + totalNum + ", thisPage="
				+ thisPage + ", pageList=" + pageList + "]";
	}
	
	
	
}
