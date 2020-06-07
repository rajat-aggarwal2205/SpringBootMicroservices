package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ACCOUNT_TABLE")
@Data
@NoArgsConstructor
public class Account implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "account_number")
    private int accountNumber;
    @Column(name= "account_holder_name")
    private String accountHolderName;
    @Column(name= "account_balance")
    private int balance;
    @Column(name= "isActive")
    private boolean isActive;
    public Account(String accountHolderName, int accountBalance, boolean isActive) {
        super();
        this.accountHolderName = accountHolderName;
        this.balance = accountBalance;
        this.isActive = isActive;
    }

}
