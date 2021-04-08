package ru.sber.service;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.sber.entity.Users;
import ru.sber.repository.UsersRepository;

import java.util.List;
@Data

@Service
public class UsersService {

    @Autowired
    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }
    @Transactional
    public void createUsers(Users users) {
        usersRepository.save(users);
    }
    @Transactional
    public List<Users> findAll(){
        return usersRepository.findAll();
    }
    @Transactional
    public Users findById(Long userId){
        return usersRepository.findById(userId).orElse(null);
    }
    @Transactional
    public List<Users> findAllByCardNumber(String cardNumber){
        return usersRepository.findAllByCardNumber (cardNumber);
    }

}
