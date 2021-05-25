package com.quarkxwave.methodoverriding;

public class ChildClass extends ParentClass{

    /**
     * Method overriding should follow the following rules:
     * Method parameter should be same
     * Return type can be restricted but not generalize
     * Modifier can't be restricted
     * Exception can be restricted but not be generalised
     * @param a
     * @return
     * @throws IllegalArgumentException
     */
    @Override
    public String message(int a) throws IllegalArgumentException{
        return "Child";
    }
}
