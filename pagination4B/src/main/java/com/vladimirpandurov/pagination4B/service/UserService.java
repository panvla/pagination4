package com.vladimirpandurov.pagination4B.service;

import com.vladimirpandurov.pagination4B.domain.User;
import org.springframework.data.domain.Page;

public interface UserService {
    Page<User> getUsers(String name, int page, int size);
}
