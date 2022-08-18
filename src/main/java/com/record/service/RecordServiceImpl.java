package com.record.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.record.entity.Records;

@Service
public class RecordServiceImpl implements IRecordService {
    
	List<Records> list = List.of(
			new Records(1L, "tata@tata.com", "Tata Motaors", 113411l),
			new Records(2L, "Mahindra.123@mh.com", "Mahindra", 113412l),
			new Records(3L, "tata@Tcs.com", "TCS", 113413l),
			new Records(4L, "Satya@accunter.com", "Accenture", 113414l),
			new Records(5L, "peter.oark@infoys.com", "Infosys", 113415l),
			new Records(6L, "tata@telxi.com", "Tata ELXI", 113416l),
			new Records(7L, "Satya.prasad@mindtree.com", "Mindtree", 113417l),
			new Records(8L, "tata@l&t.com", "L & T", 113418l),
			new Records(9L, "Ravi.m@infotech", "InfoTech", 113419l)
				
			);

	@Override
	public List<Records> getRecordOfEmployee(Long eId) {
		
		return list.stream().filter(emp -> emp.geteId().equals(eId)).collect(Collectors.toList());
	}

	

}
