package ma.enset.bankaccountservice.entities;

import ma.enset.bankaccountservice.enums.AccountType;

public interface AccountProjection {
    public String getId();
    public AccountType getType();
}
