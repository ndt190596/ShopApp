package com.luv2code.shop_app.services.impl;

import com.luv2code.shop_app.models.Role;
import com.luv2code.shop_app.repositories.RoleRepository;
import com.luv2code.shop_app.services.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;
    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}
