package com.rrsaikat.calc;

import android.content.Context;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Rezwan on 03-06-18.
 */

public class Helpers {
    public static String division = "&divide;";
    public static String inverseSin = "sin<sup>-1</sup>";
    public static String inverseCos = "cos<sup>-1</sup>";
    public static String inverseTan = "tan<sup>-1</sup>";
    public static String exponential = "e<sup>x</sup>";
    public static String tenPowerX = "10<sup>x</sup>";
    public static String cubeSquare = "3&radic;";
    public static String cubeRoot = "x<sup>3</sup>";
    public static String yPowerX = "Y<sup>x</sup>";
    public static String squareRoot = "&radic;";
    public static String xSquare = "x<sup>2</sup>";
    public static String pi = "&pi;";
    public static void displayErrorMessage(Context context){
        Toast.makeText(context, "Input field must not be zero", Toast.LENGTH_LONG).show();
    }
    public static boolean isZero(EditText input){
        if(Double.parseDouble(input.getText().toString()) == 0){
            return true;
        }
        return false;
    }
    public static int getTopicId(Bundle bundle, String inputValue){
        int id = 0;
        if(bundle != null){
            id  = bundle.getInt(inputValue);
        }
        return id;
    }
}
