package com.example.service;

import java.util.List;

import com.example.entity.Batches;

public interface BatchService {

	Batches addbatch(Batches batches);
	
	Batches getbatchDetail(int bid);
	
	List<Batches> getAllbatches();
}
