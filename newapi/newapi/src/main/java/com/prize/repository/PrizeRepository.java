package com.prize.repository;

import org.springframework.data.repository.CrudRepository;

public interface PrizeRepository<Prize> extends CrudRepository<Prize, Integer>{

}
