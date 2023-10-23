# Clean Architecture
CSC207 Week5-6 Homework. It has use cases: loggin, logout, signup, cancel, clear all users

## What's Done in this file
1. use case "delete all users" added
2. use case "cancel" in Loggin View added
3. use case "logged out" in Loggedin View added

## Explanation for "delete all user"

There is currently no way to delete users from the system.

This week's coding exercise has you add a "delete all users" button to the
Signup screen and implement the logic for it.

Look for "TODO" in the `SignupView` class and follow the instructions.

Next, look at the empty classes and interfaces in the "clear_users" packages.
Fill them in!

For this use case interaction, there is no data to give to the
`ClearController`, and no data to put into `ClearInputData`.


## Extra Practice

You likely noticed that other features of the program aren't working yet either.
For example:
- the `Log out` button doesn't work once a user logs in
- the `Cancel` buttons don't actually cancel anything
- the program isn't doing some expected checks for password length or username requirements
- the program doesn't have an overall menu to choose between signing up and logging in
- and many more!
