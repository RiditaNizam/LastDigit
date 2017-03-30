package com.company;

/**
 * Created by ridita on 3/29/17.
 */
public class LastDigit {
    public boolean lastDigit(int a, int b) {
        if (a % 10 == b % 10) {
            return true;
        } else {
            return false;
        }
    }

}
