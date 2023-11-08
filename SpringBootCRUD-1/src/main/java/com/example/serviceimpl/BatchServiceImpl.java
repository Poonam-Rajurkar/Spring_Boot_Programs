package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Batches;
import com.example.exception.BatchNotFoundException;
import com.example.repository.BatchRepository;
import com.example.service.BatchService;


@Service
public class BatchServiceImpl implements BatchService {

	@Autowired
	BatchRepository brepo;
	
	@Override
	public Batches addbatch(Batches batches) {
		// TODO Auto-generated method stub
		return brepo.save(batches);
	}

	@Override
	public Batches getbatchDetail(int bid) {
		// TODO Auto-generated method stub
		return brepo.findById(bid).orElseThrow(()-> new BatchNotFoundException("Entered batch is not present"));
	}

	@Override
	public List<Batches> getAllbatches() {
		// TODO Auto-generated method stub
		return brepo.findAll();
	}

}
