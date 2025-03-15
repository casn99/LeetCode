class Bank {

    private long[] balances;

    private boolean isValid(int accountNo){
        if(balances == null){
            return false;
        }
        if(accountNo >= 0 && accountNo < balances.length){
            return true;
        }else{
            return false;
        }

    }

    private boolean sufficientFunds(int account, long withdrawAmount){
        if(balances == null){
            return false;
        }
        if(withdrawAmount <= balances[account]){
            return true;
        }else{
            return false;
        }

    }
    
    public Bank(long[] balance) {
        this.balances = balance;
    }
    
    public boolean transfer(int account1, int account2, long money) {
        account1--;
        account2--;
        if(isValid(account1) && isValid(account2) && sufficientFunds(account1, money)){
            balances[account1] -= money;
            balances[account2] += money;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean deposit(int account, long money) {
        account--;
        if(isValid(account)){
            balances[account] += money;
            return true;
        }else{
            return false;
        }
        
    }
    
    public boolean withdraw(int account, long money) {
        account--;
        if(isValid(account) && sufficientFunds(account, money)){
            balances[account] -= money;
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */