class Solution {
    public  int romanToInt(String s) {
        Integer sum = 0;

        for(int i  = 0; i < s.length(); i++) {

            int num = getInteger(s.charAt(i));

            //numbers are always in greater to smaller order e.g MXIII
            // if this change e.g. MXIV, we simply deduct smaller number from our sum
            if(i < s.length() -1 && num < getInteger(s.charAt(i+1))) {
                num = (-1 * num);
            }
            sum = sum + num;

        }
        return sum;

    }

    public  Integer getInteger(Character s ) {
        switch (s) {
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 1;
        }
    }
}
