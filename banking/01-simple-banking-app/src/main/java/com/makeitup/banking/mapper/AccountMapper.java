package com.makeitup.banking.mapper;

import com.makeitup.banking.dto.AccountDTO;
import com.makeitup.banking.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDTO accountDTO) {
        Account account = new Account(
                accountDTO.getId(),
                accountDTO.getAccountHolderName(),
                accountDTO.getBalance()
        );

        return account;
    }

    public static AccountDTO mapToAccountDTO(Account account) {
        AccountDTO accountDTO = new AccountDTO(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );

        return accountDTO;
    }
}
