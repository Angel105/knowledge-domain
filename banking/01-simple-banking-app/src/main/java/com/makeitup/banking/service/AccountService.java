package com.makeitup.banking.service;

import com.makeitup.banking.dto.AccountDTO;

import java.util.List;

public interface AccountService {

    AccountDTO createAccount(AccountDTO account);

    AccountDTO getAccountById(Long id);

    AccountDTO deposit(Long id, double amount);

    AccountDTO withdraw(Long id, double amount);

    List<AccountDTO> getAllAccounts();

    void deleteAccount(Long id);
}
