package com.Unpacking;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class TestOnRegex {


        public boolean testOnRegex(String argument) {


            Pattern pattern = Pattern.compile("\\d+\\[\\w+\\]\\d+\\[\\w+\\]\\w", Pattern.CASE_INSENSITIVE);
            Matcher result = pattern.matcher(argument);
            return result.matches();
        }
    }

