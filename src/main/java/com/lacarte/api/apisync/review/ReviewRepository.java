package com.lacarte.api.apisync.review;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ReviewRepository  extends PagingAndSortingRepository<Review, Long> {

}
