package ru.sber.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "accounts")
public class Accounts {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column
        private String currency;

        @Column
        private BigDecimal balance;

        @Column(name = "account")
        private String account;

    @Override
    public String toString() {
        return "Accounts{" +
                "id=" + id +
                ", currency='" + currency + '\'' +
                ", balance='" + balance + '\'' +
                ", account='" + account + '\'' +
                '}';
    }

}


