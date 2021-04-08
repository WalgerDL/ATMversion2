package ru.sber.service;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.sber.entity.Accounts;
import ru.sber.repository.AccountsRepository;

@Data
@Service
public class AccountsService {

    @Autowired
    private final AccountsRepository accountsRepository;

    public AccountsService(AccountsRepository accountsRepository) {
        this.accountsRepository = accountsRepository;
    }
    @Transactional
    public void createAccounts(Accounts accounts) {
        accountsRepository.save(accounts);
    }

}
