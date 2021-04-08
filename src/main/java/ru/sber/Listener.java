package ru.sber;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import ru.sber.entity.Accounts;
import ru.sber.entity.Users;
import ru.sber.service.UsersService;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Listener {

    @Autowired
    private UsersService usersService;

    @EventListener(ApplicationReadyEvent.class)
    public void testJpaMethods(){
        Accounts accounts = new Accounts();
        //UsersService usersService = new UsersService();
        accounts.setCurrency("RUB");
        accounts.setBalance(BigDecimal.valueOf(45.56));
        accounts.setAccount("12345678901234567890");

        Users users = new Users();
        users.setAccounts(accounts);
        users.setCardNumber("1234567890123456");
        users.setPin("1234");
        users.setExpDte("12/34");
        usersService.createUsers(users);


        usersService.findAll().forEach(it-> System.out.println(it));

        usersService.findAllByCardNumber("1234567890123456").forEach(it-> System.out.println(it));

    }

}
