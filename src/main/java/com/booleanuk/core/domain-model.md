| Class            | Member                          | Method                       | Scenario                       | Output             |
|------------------|---------------------------------|------------------------------|--------------------------------|--------------------|
| User             | List<Account> accounts          | addAccount(Account account)  |                                |                    | 
| Abstract Account | List<Transactions> transactions | getBalance()                 |                                | float balance      | 
|                  | float balance                   | getTransactions()            |                                | List<Transactions> | 
|                  | int accountNumber               | deposit(float amount)        | deposit was successfully done  | true               |
|                  |                                 | withdraw(float float amount) | withdrawal was successful      | true               |
|                  |                                 | generateStatements()         |                                |                    |
| CurrentAccount   |                                 |                              |                                |                    | 
| SavingAccount    |                                 |                              |                                |                    | 
| Transaction      | float delta                     |                              |                                |                    | 
|                  | String timeStamp                |                              |                                |                    | 
|                  |                                 |                              |                                |                    | 
|                  |                                 |                              |                                |                    | 
|                  |                                 |                              |                                |                    | 
