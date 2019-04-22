package com.ct.mapper;

import com.ct.pojo.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper {
    boolean existsRole(Role role);
}
