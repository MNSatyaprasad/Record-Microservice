package com.record.service;

import java.util.List;

import com.record.entity.Records;

public interface IRecordService {

	
	public List<Records> getRecordOfEmployee(Long eId);
}
