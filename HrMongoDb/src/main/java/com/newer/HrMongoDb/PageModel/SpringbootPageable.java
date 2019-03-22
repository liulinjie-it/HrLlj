package com.newer.HrMongoDb.PageModel;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class SpringbootPageable implements Pageable {
	
	private PageModel pm;
	
	public SpringbootPageable() {
		// TODO Auto-generated constructor stub
	}
    
	public SpringbootPageable(PageModel pm) {
		super();
		this.pm = pm;
	}

	public PageModel getPm() {
		return pm;
	}

	public void setPm(PageModel pm) {
		this.pm = pm;
	}

	@Override
	public int getPageNumber() {
		// TODO Auto-generated method stub
		return pm.getPagenum();
	}

	@Override
	public int getPageSize() {
		// TODO Auto-generated method stub
		return pm.getPagesize();
	}

	@Override
	public long getOffset() {
		// TODO Auto-generated method stub
		return (pm.getPagenum() - 1) * pm.getPagesize();
	}

	@Override
	public Sort getSort() {
		// TODO Auto-generated method stub
		return pm.getSort();
	}

	@Override
	public Pageable next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pageable previousOrFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pageable first() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}

}
