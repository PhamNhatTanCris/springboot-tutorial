package com.tutorial.apidemo.springboot.tutorial.services.impl;

import com.tutorial.apidemo.springboot.tutorial.models.entities.Role;
import com.tutorial.apidemo.springboot.tutorial.models.entities.User;
import com.tutorial.apidemo.springboot.tutorial.repositories.RoleRepository;
import com.tutorial.apidemo.springboot.tutorial.repositories.UserRepository;
import com.tutorial.apidemo.springboot.tutorial.services.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User saveUser(User user){
        log.info("lưu người dùng {} vào cơ sở dữ liệu",user.getName());
        return userRepository.save(user);
    };

    @Override
    public Role saveRole(Role role){
        log.info("lưu quyền {} mới vào cơ sở dữ liệu", role.getName());
        return roleRepository.save(role);
    };

    @Override
    public void addRoleToUser(String username, String roleName){
        log.info("Thêm quyền {} cho người dùng {}", roleName, username);
        User user = userRepository.findByUsername(username);
        Role role = roleRepository.findByName(roleName);
        user.getRoles().add(role);
    };

    @Override
    public User getUser(String username){
        log.info("Lấy người dùng {}", username);
        return userRepository.findByUsername(username);
    };

    @Override
    public List<User> getUsers(){
        log.info("Lấy tất cả người dùng");
        return userRepository.findAll();
    };

}
