package com.vladimirpandurov.pagination4B.repository;

import com.vladimirpandurov.pagination4B.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    Page<User> findByNameContaining(String name, Pageable pageable);
}