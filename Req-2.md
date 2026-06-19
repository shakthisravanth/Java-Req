# Basic Bank Project – Advanced Requirement

## Topic

Encapsulation, Arrays, Multiple Objects, and Account-to-Account Transactions

## Project Title

Bank Account System with Multiple Accounts and Fund Transfer

## Requirement for Today

In the previous requirement, students created a basic bank project for a single bank account using encapsulation.

Now, students need to upgrade the same project.

In this advanced requirement, students must store multiple bank accounts using an array and allow transactions between the accounts.

The project should allow a user to login into one account and perform operations like checking balance, depositing amount, withdrawing amount, viewing account details, and transferring money to another account.

The project should be built using Class, Object, Private Instance Variables, Constructor, Methods, Array of Objects, Scanner, if-else, switch-case, loop, and encapsulation.

---

## Objective

The main objective of this project is to understand how multiple objects can be stored and managed using arrays in Java.

Students should understand that one object represents one bank account.

When multiple accounts are needed, we can create multiple objects and store them inside an array.

Students should also understand how one account can send money to another account safely using methods.

In a real bank application, one customer should not directly access or change another customer’s balance.

So, all account details must be private, and all operations must happen only through methods.

---

## Project Description

Create a Java console-based bank application that can store multiple bank accounts.

Each bank account should have account number, account holder name, PIN, and balance.

The user should login using account number and PIN.

If the login is successful, the user should see a menu.

The menu should allow the user to check balance, deposit amount, withdraw amount, display account details, transfer money to another account, and exit.

For transfer, the logged-in user should enter the receiver account number and transfer amount.

If the receiver account number exists and the sender has sufficient balance, the amount should be deducted from the sender account and added to the receiver account.

If the receiver account number does not exist, display an invalid receiver account message.

If the sender does not have enough balance, display insufficient balance.

---

## Class Structure

### Class Name

`BankAccount`

---

## Instance Variables

The `BankAccount` class must contain the following private instance variables.

```java
private int accountNumber;
```

This variable is used to store the bank account number.

```java
private String accountHolderName;
```

This variable is used to store the account holder name.

```java
private int pin;
```

This variable is used to store the secret PIN of the account.

```java
private double balance;
```

This variable is used to store the current balance of the account.

---

## Important Rule

All instance variables must be declared as private.

Students should not access these variables directly from the main method.

The PIN should never be displayed in the output.

The balance should not be changed directly from the main method.

All balance changes should happen only through deposit, withdraw, or transfer methods.

---

## Constructor Requirement

### Constructor Name

`BankAccount`

### Constructor Type

Parameterized Constructor

### Constructor Purpose

The constructor should be used to initialize account details when each bank account object is created.

### Constructor Parameters

The constructor should accept:

* accountNumber
* accountHolderName
* pin
* balance

### Constructor Structure

```java
BankAccount(int accountNumber, String accountHolderName, int pin, double balance)
```

### Example Object Creation

```java
BankAccount account1 = new BankAccount(1001, "Rahul", 1234, 5000.0);
BankAccount account2 = new BankAccount(1002, "Priya", 2345, 8000.0);
BankAccount account3 = new BankAccount(1003, "Amit", 3456, 3000.0);
```

---

## Array Requirement

Create an array to store multiple `BankAccount` objects.

### Example

```java
BankAccount[] accounts = new BankAccount[3];

accounts[0] = new BankAccount(1001, "Rahul", 1234, 5000.0);
accounts[1] = new BankAccount(1002, "Priya", 2345, 8000.0);
accounts[2] = new BankAccount(1003, "Amit", 3456, 3000.0);
```

Each object inside the array represents one bank account.

Students must use a loop to search accounts from the array.

---

## Methods Required

## Method 1: Login Method

### Method Name

`login`

### Return Type

`boolean`

### Parameters

```java
int enteredAccountNumber
int enteredPin
```

### Method Structure

```java
boolean login(int enteredAccountNumber, int enteredPin)
```

### Purpose

This method should check whether the entered account number and PIN are correct or not.

### Logic

If the entered account number matches the actual account number and the entered PIN matches the actual PIN, return `true`.

Otherwise, return `false`.

### Expected Output

When login details are correct:

```text
Login Successful
```

When login details are wrong:

```text
Invalid Account Number or PIN
```

---

## Method 2: Check Balance Method

### Method Name

`checkBalance`

### Return Type

`void`

### Parameter

No parameter

### Method Structure

```java
void checkBalance()
```

### Purpose

This method should display the current balance of the logged-in account.

### Expected Output

```text
Current Balance: 5000.0
```

---

## Method 3: Deposit Method

### Method Name

`deposit`

### Return Type

`void`

### Parameter

```java
double amount
```

### Method Structure

```java
void deposit(double amount)
```

### Purpose

This method should add money to the logged-in account balance.

### Logic

If the deposit amount is greater than zero, add the amount to the balance.

If the deposit amount is zero or negative, display `Invalid Deposit Amount`.

### Expected Output for Valid Deposit

```text
Amount Deposited Successfully
Updated Balance: 7000.0
```

### Expected Output for Invalid Deposit

```text
Invalid Deposit Amount
```

---

## Method 4: Withdraw Method

### Method Name

`withdraw`

### Return Type

`boolean`

### Parameter

```java
double amount
```

### Method Structure

```java
boolean withdraw(double amount)
```

### Purpose

This method should withdraw money from the logged-in account.

### Logic

If the withdrawal amount is greater than zero and the account has sufficient balance, subtract the amount from the balance and return `true`.

If the withdrawal amount is greater than the balance, display `Insufficient Balance` and return `false`.

If the withdrawal amount is zero or negative, display `Invalid Withdrawal Amount` and return `false`.

### Expected Output for Valid Withdrawal

```text
Amount Withdrawn Successfully
Updated Balance: 4000.0
```

### Expected Output for Insufficient Balance

```text
Insufficient Balance
```

### Expected Output for Invalid Withdrawal Amount

```text
Invalid Withdrawal Amount
```

---

## Method 5: Display Account Details Method

### Method Name

`displayAccountDetails`

### Return Type

`void`

### Parameter

No parameter

### Method Structure

```java
void displayAccountDetails()
```

### Purpose

This method should display the account number and account holder name of the logged-in account.

### Important Rule

The PIN should not be displayed.

### Expected Output

```text
Account Number: 1001
Account Holder Name: Rahul
```

---

## Method 6: Get Account Number Method

### Method Name

`getAccountNumber`

### Return Type

`int`

### Parameter

No parameter

### Method Structure

```java
int getAccountNumber()
```

### Purpose

This method should return the account number.

This method is required because account number is private.

The main method cannot directly access the account number.

### Example

```java
int getAccountNumber() {
    return accountNumber;
}
```

---

## Method 7: Receive Amount Method

### Method Name

`receiveAmount`

### Return Type

`void`

### Parameter

```java
double amount
```

### Method Structure

```java
void receiveAmount(double amount)
```

### Purpose

This method should add the transferred amount to the receiver account.

This method is used during account-to-account transfer.

### Logic

If the amount is greater than zero, add it to the receiver account balance.

### Example

```java
void receiveAmount(double amount) {
    balance = balance + amount;
}
```

---

## Method 8: Transfer Amount Method

### Method Name

`transferAmount`

### Return Type

`void`

### Parameters

```java
BankAccount receiver
double amount
```

### Method Structure

```java
void transferAmount(BankAccount receiver, double amount)
```

### Purpose

This method should transfer money from the logged-in account to another account.

### Logic

If the transfer amount is zero or negative, display `Invalid Transfer Amount`.

If the sender does not have sufficient balance, display `Insufficient Balance`.

If the amount is valid and sender has sufficient balance:

* Deduct amount from sender balance
* Add amount to receiver balance
* Display transfer success message
* Display updated sender balance

### Expected Output for Valid Transfer

```text
Transfer Successful
Amount Transferred: 1000.0
Updated Balance: 4000.0
```

### Expected Output for Insufficient Balance

```text
Insufficient Balance
```

### Expected Output for Invalid Transfer Amount

```text
Invalid Transfer Amount
```

---

# Main Class Structure

## Main Class Name

`BankApp`

The `BankApp` class should contain the `main` method.

Inside the main method, create multiple objects of the `BankAccount` class and store them inside an array.

---

## Object Array Creation

```java
BankAccount[] accounts = new BankAccount[4];

accounts[0] = new BankAccount(1001, "Rahul", 1234, 5000.0);
accounts[1] = new BankAccount(1002, "Priya", 2345, 8000.0);
accounts[2] = new BankAccount(1003, "Amit", 3456, 3000.0);
accounts[3] = new BankAccount(1004, "Sneha", 4567, 10000.0);
```

---

## Login Requirement

Ask the user to enter account number and PIN.

Use a loop to search the account from the array.

If the entered account number and PIN match with any account, login should be successful.

Store the matched account object inside a reference variable called `loggedInAccount`.

### Example Logic

```java
BankAccount loggedInAccount = null;

for (int i = 0; i < accounts.length; i++) {
    if (accounts[i].login(enteredAccountNumber, enteredPin)) {
        loggedInAccount = accounts[i];
        break;
    }
}
```

If `loggedInAccount` is not null, display `Login Successful`.

If `loggedInAccount` is null, display `Invalid Account Number or PIN` and stop the program.

---

## Receiver Account Search Requirement

For transfer, ask the user to enter the receiver account number.

Use a loop to search the receiver account from the array.

Store the matched receiver account object inside a reference variable called `receiverAccount`.

### Example Logic

```java
BankAccount receiverAccount = null;

for (int i = 0; i < accounts.length; i++) {
    if (accounts[i].getAccountNumber() == receiverAccountNumber) {
        receiverAccount = accounts[i];
        break;
    }
}
```

If `receiverAccount` is null, display `Receiver Account Not Found`.

If receiver account exists, ask for transfer amount and call the transfer method.

### Example

```java
loggedInAccount.transferAmount(receiverAccount, transferAmount);
```

---

## Important Transfer Rules

The sender account and receiver account should not be the same.

If the user enters their own account number as receiver account number, display:

```text
Cannot transfer amount to the same account
```

The receiver account number must exist in the array.

The transfer amount should be greater than zero.

The sender must have sufficient balance.

After successful transfer:

* Sender balance should decrease
* Receiver balance should increase

---

## Menu After Successful Login

After successful login, display the following menu:

```text
1. Check Balance
2. Deposit Amount
3. Withdraw Amount
4. Display Account Details
5. Transfer Amount
6. Exit
```

---

## Menu Operation Details

If the user enters `1`, call the `checkBalance()` method.

If the user enters `2`, ask the user to enter the deposit amount and call the `deposit(amount)` method.

If the user enters `3`, ask the user to enter the withdrawal amount and call the `withdraw(amount)` method.

If the user enters `4`, call the `displayAccountDetails()` method.

If the user enters `5`, ask the user to enter the receiver account number and transfer amount, then call the `transferAmount(receiverAccount, amount)` method.

If the user enters `6`, display an exit message and stop the program.

If the user enters any other number, display `Invalid Choice`.

---

# Complete Program Flow

First, create multiple bank account objects.

Store all bank account objects inside an array.

Ask the user to enter account number and PIN.

Search for the matching account from the array.

If the login details are wrong, display `Invalid Account Number or PIN`.

If the login details are correct, display `Login Successful`.

After successful login, display the banking menu.

Ask the user to enter their choice.

Based on the user choice, call the correct method.

For transfer, ask the user to enter receiver account number.

Search receiver account from the array.

If receiver account does not exist, display `Receiver Account Not Found`.

If receiver account exists, ask for transfer amount.

If the amount is valid and balance is sufficient, transfer money from sender to receiver.

After completing one operation, show the menu again.

The menu should continue until the user chooses Exit.

---

# Sample Input and Output

## Sample Output 1: Successful Login and Check Balance

```text
Welcome to Bank Application

Enter Account Number:
1001

Enter PIN:
1234

Login Successful

1. Check Balance
2. Deposit Amount
3. Withdraw Amount
4. Display Account Details
5. Transfer Amount
6. Exit

Enter your choice:
1

Current Balance: 5000.0
```

---

## Sample Output 2: Deposit Amount

```text
Welcome to Bank Application

Enter Account Number:
1001

Enter PIN:
1234

Login Successful

1. Check Balance
2. Deposit Amount
3. Withdraw Amount
4. Display Account Details
5. Transfer Amount
6. Exit

Enter your choice:
2

Enter deposit amount:
2000

Amount Deposited Successfully
Updated Balance: 7000.0
```

---

## Sample Output 3: Withdraw Amount

```text
Welcome to Bank Application

Enter Account Number:
1001

Enter PIN:
1234

Login Successful

1. Check Balance
2. Deposit Amount
3. Withdraw Amount
4. Display Account Details
5. Transfer Amount
6. Exit

Enter your choice:
3

Enter withdrawal amount:
1000

Amount Withdrawn Successfully
Updated Balance: 4000.0
```

---

## Sample Output 4: Display Account Details

```text
Welcome to Bank Application

Enter Account Number:
1001

Enter PIN:
1234

Login Successful

1. Check Balance
2. Deposit Amount
3. Withdraw Amount
4. Display Account Details
5. Transfer Amount
6. Exit

Enter your choice:
4

Account Number: 1001
Account Holder Name: Rahul
```

---

## Sample Output 5: Successful Transfer

```text
Welcome to Bank Application

Enter Account Number:
1001

Enter PIN:
1234

Login Successful

1. Check Balance
2. Deposit Amount
3. Withdraw Amount
4. Display Account Details
5. Transfer Amount
6. Exit

Enter your choice:
5

Enter receiver account number:
1002

Enter transfer amount:
1000

Transfer Successful
Amount Transferred: 1000.0
Updated Balance: 4000.0
```

---

## Sample Output 6: Receiver Account Not Found

```text
Welcome to Bank Application

Enter Account Number:
1001

Enter PIN:
1234

Login Successful

1. Check Balance
2. Deposit Amount
3. Withdraw Amount
4. Display Account Details
5. Transfer Amount
6. Exit

Enter your choice:
5

Enter receiver account number:
9999

Receiver Account Not Found
```

---

## Sample Output 7: Transfer to Same Account

```text
Welcome to Bank Application

Enter Account Number:
1001

Enter PIN:
1234

Login Successful

1. Check Balance
2. Deposit Amount
3. Withdraw Amount
4. Display Account Details
5. Transfer Amount
6. Exit

Enter your choice:
5

Enter receiver account number:
1001

Cannot transfer amount to the same account
```

---

## Sample Output 8: Insufficient Balance During Transfer

```text
Welcome to Bank Application

Enter Account Number:
1001

Enter PIN:
1234

Login Successful

1. Check Balance
2. Deposit Amount
3. Withdraw Amount
4. Display Account Details
5. Transfer Amount
6. Exit

Enter your choice:
5

Enter receiver account number:
1002

Enter transfer amount:
10000

Insufficient Balance
```

---

## Sample Output 9: Invalid Login

```text
Welcome to Bank Application

Enter Account Number:
1005

Enter PIN:
9999

Invalid Account Number or PIN
```

---

## Sample Output 10: Exit

```text
Welcome to Bank Application

Enter Account Number:
1001

Enter PIN:
1234

Login Successful

1. Check Balance
2. Deposit Amount
3. Withdraw Amount
4. Display Account Details
5. Transfer Amount
6. Exit

Enter your choice:
6

Thank you for using the Bank Application
```

---

# Basic Project Structure

```java
class BankAccount {

    private int accountNumber;
    private String accountHolderName;
    private int pin;
    private double balance;

    BankAccount(int accountNumber, String accountHolderName, int pin, double balance) {
        // initialize values
    }

    boolean login(int enteredAccountNumber, int enteredPin) {
        // check account number and PIN
    }

    void checkBalance() {
        // display balance
    }

    void deposit(double amount) {
        // deposit amount
    }

    boolean withdraw(double amount) {
        // withdraw amount
    }

    void displayAccountDetails() {
        // display account details
    }

    int getAccountNumber() {
        // return account number
    }

    void receiveAmount(double amount) {
        // add transferred amount to receiver account
    }

    void transferAmount(BankAccount receiver, double amount) {
        // transfer amount from current account to receiver account
    }
}

public class BankApp {

    public static void main(String[] args) {

        // create Scanner object

        // create BankAccount array

        // store multiple BankAccount objects

        // take account number and PIN from user

        // search logged-in account using loop

        // if login successful, show menu

        // perform check balance, deposit, withdraw, display details, and transfer

        // for transfer, search receiver account from array

        // continue menu until exit
    }
}
```

---

# Important Conditions

All instance variables must be private.

Do not access account number, account holder name, PIN, or balance directly from the main method.

Use a constructor to initialize account details.

Use an array to store multiple bank account objects.

Use a loop to search accounts from the array.

Use methods to perform login, balance check, deposit, withdrawal, account detail display, and transfer.

PIN should not be displayed anywhere in the output.

Deposit amount should be greater than zero.

Withdrawal amount should be greater than zero.

Withdrawal should happen only when sufficient balance is available.

Transfer amount should be greater than zero.

Transfer should happen only when the sender has sufficient balance.

Receiver account number must exist.

Sender account and receiver account should not be the same.

The menu should continue until the user chooses exit.

---

# Expected Learning Outcome

After completing this project, students should be able to understand how arrays can store multiple objects in Java.

They should understand how one object represents one bank account.

They should understand how to search objects from an array using a loop.

They should understand how encapsulation protects private data.

They should understand how to safely perform transactions between two objects.

They should also get practice with constructors, objects, method calling, user input, if-else conditions, loops, switch-case, and array traversal.
