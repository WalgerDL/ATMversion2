package ru.sber.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sber.entity.Accounts;

public interface AccountsRepository extends JpaRepository<Accounts, Long> {
}
