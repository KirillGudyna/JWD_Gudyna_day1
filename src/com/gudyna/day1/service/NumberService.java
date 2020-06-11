package com.gudyna.day1.service;

import com.gudyna.day1.exception.TaskException;
import com.gudyna.day1.validator.NumberValidate;

public class NumberService {
    public int calculateLastDigit(int number) throws TaskException {
        NumberValidate numberValidate = new NumberValidate();
        if(!numberValidate.isNumberValidate(number)){
            throw new TaskException("Number must be in range -155 and 155");
        }
        return number % 10;
    }

    public int calculateLastDigitSquare(int number) throws TaskException {
        NumberValidate numberValidate = new NumberValidate();
        if(!numberValidate.isNumberValidate(number)){
            throw new TaskException("Number must be in range -155 and 155");
        }
        return calculateLastDigit((int) Math.pow(number, 2));
    }

    public boolean isNumberPerfect(int number) throws TaskException {
        NumberValidate numberValidate = new NumberValidate();
        if(!numberValidate.isNumberValidate(number)){
            throw new TaskException("Number must be in range -155 and 155");
        }
        int summa = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                summa += i;
            }
        }
        return summa == number;
    }

    public boolean isEvenNumber(int number) throws TaskException {
        NumberValidate numberValidate = new NumberValidate();
        if(!numberValidate.isNumberValidate(number)){
            throw new TaskException("Number must be in range (-155, 155)");
        }
        return number % 2 == 0;
    }

    //This function return true if among 4 numbers there are two even and false otherwise
    public boolean checkForTwoEvenNumbers(int[] number) throws TaskException {
        int i = 0;
        int k = 0;
        boolean answer = false;
        while (i < 4) {
            if (isEvenNumber(number[i])) {
                k++;
            }
            i++;
        }
        if (k > 1) {
            answer = true;
        }
        return answer;
    }
}
