package me.dulanjana.demo.service;

import me.dulanjana.demo.dto.UserDTO;
import me.dulanjana.demo.entity.User;
import me.dulanjana.demo.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;


    public UserDTO saveUser(UserDTO dto) {
        userRepo.save(modelMapper.map(dto, User.class));
        return dto;
    }

    public List<UserDTO> getAllUsers() {
        List<User> users = userRepo.findAll();
        return modelMapper.map(users, new TypeToken<List<UserDTO>>() {
        }.getType());
    }

    public UserDTO updateUser(UserDTO dto) {
        userRepo.save(modelMapper.map(dto, User.class));
        return dto;
    }

    public boolean deleteUser(UserDTO dto){
        userRepo.delete(modelMapper.map(dto,User.class));
        return true;
    }
}
