package com.xworkz.tree.repository;

import com.xworkz.tree.dto.TreeDto;

public interface TreeRepo {

	public boolean save(TreeDto dto);
	
	public boolean read();
	
}
