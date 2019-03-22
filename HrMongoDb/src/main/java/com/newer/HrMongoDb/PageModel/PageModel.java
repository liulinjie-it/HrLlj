package com.newer.HrMongoDb.PageModel;

import org.springframework.data.domain.Sort;

/**
 * 分页模型
 * @author Administrator
 *
 */
public class PageModel {
	// 当前页
	private int pagenum;
	// 当前页面条数
	private int pagesize;
	// 排序条件
	private Sort sort;

	public PageModel() {
		// TODO Auto-generated constructor stub
	}

	public PageModel(int pagenum, int pagesize,Sort sort) {
		super();
		this.pagenum = pagenum;
		this.pagesize = pagesize;
		this.sort = sort;
	}

	public int getPagenum() {
		return pagenum;
	}

	public void setPagenum(int pagenum) {
		this.pagenum = pagenum;
	}

	public int getPagesize() {
		return pagesize;
	}

	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}

	public Sort getSort() {
		return sort;
	}

	public void setSort(Sort sort) {
		this.sort = sort;
	}

}
