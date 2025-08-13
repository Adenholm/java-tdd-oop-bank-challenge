| Class            | Member                          | Method                                        | Scenario                       | Output             |
|------------------|---------------------------------|-----------------------------------------------|--------------------------------|--------------------|
| User             | List<Account> accounts          | addAccount(Account account)                   |                                |                    | 
| Abstract Account | List<Transactions> transactions | getBalance()                                  |                                | float balance      | 
|                  | Branch branch                   | getTransactions()                             |                                | List<Transactions> | 
|                  | float ApprovedOverdraw          | deposit(float amount)                         | deposit was successfully done  | true               |
|                  |                                 | withdraw(float float amount)                  | withdrawal was successful      | true               |
|                  |                                 | requestOverDraft(float amount, String reason) |                                |                    | 
|                  |                                 | generateStatements()                          |                                | String             | 
| CurrentAccount   |                                 |                                               |                                |                    | 
| SavingAccount    |                                 |                                               |                                |                    | 
| Transaction      | float delta                     |                                               |                                |                    | 
|                  | String timeStamp                |                                               |                                |                    | 
| Branch           | List<OverdraftRequest> requests | approveRequest(request)                       |                                |                    | 
|                  |                                 | denyRequest(request)                          |                                |                    | 
| OverdraftRequest | float Amount                    |                                               |                                |                    | 
|                  | String Reason                   |                                               |                                |                    | 
|                  | Account account                 |                                               |                                |                    | 
