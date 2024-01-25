package br.com.filipe.restwithspringboot.math;

import br.com.filipe.restwithspringboot.exception.UnsupportedMathOperationException;

import static br.com.filipe.restwithspringboot.util.NumberConverter.convertToDouble;
import static br.com.filipe.restwithspringboot.util.NumberConverter.isNumeric;

public class SimpleMath {

    public Double sum(String numberOne, String numberTwo) throws UnsupportedMathOperationException {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please, set a numeric value!");
        }

        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    public Double subtraction(String numberOne, String numberTwo) throws UnsupportedMathOperationException {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please, set a numeric value!");
        }

        return convertToDouble(numberOne) - convertToDouble(numberTwo);
    }

    public Double division(String numberOne, String numberTwo) throws UnsupportedMathOperationException {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please, set a numeric value!");
        }

        return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }

    public Double multiplication(String numberOne, String numberTwo) throws UnsupportedMathOperationException {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please, set a numeric value!");
        }

        return convertToDouble(numberOne) * convertToDouble(numberTwo);
    }

    public Double mean(String numberOne, String numberTwo) throws UnsupportedMathOperationException {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please, set a numeric value!");
        }

        return (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2;
    }

    public Double square(String numberOne) throws UnsupportedMathOperationException {
        if (!isNumeric(numberOne)) {
            throw new UnsupportedMathOperationException("Please, set a numeric value!");
        }

        return Math.sqrt(convertToDouble(numberOne));
    }
}
