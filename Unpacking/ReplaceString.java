package com.Unpacking;

    public class ReplaceString {

        protected static String replaceString(String input){
            StringBuilder replacedString = new StringBuilder(input);
            Integer positionStart = null;
            Integer positionEnd = null;
            Integer insertQuantity = null;

            for(int i = 0; i<input.length(); i++) {
                char symbol = input.charAt(i);
                if (symbol == '[') {
                    positionStart = i;
                    insertQuantity = Character.getNumericValue(input.charAt(i - 1));
                }
                if (symbol == ']') {
                    positionEnd = i;
                    StringBuilder insertString = new StringBuilder();
                    for (int j = 0; j < insertQuantity; j++) {
                        insertString.append(input, positionStart + 1, positionEnd);
                    }
                    replacedString.replace(positionStart - 1, positionEnd + 1, insertString.toString());
                    return replacedString.toString();
                }
            }
            return "";
        }
    }

