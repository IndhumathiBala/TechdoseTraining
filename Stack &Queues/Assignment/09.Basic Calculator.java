
 class Solution {

    public int calculate(String s) {

        if (s == null || s.length() == 0)

            return 0;

        Stack<Integer> stack = new Stack<>();

        char lastSign = '+';

        int num = 0;

        int len = s.length();

        for(int i = 0; i<len; i++){

            char c = s.charAt(i);

            if (Character.isDigit(c))

                num = num * 10 + c-'0';

            if (!Character.isDigit(c) && c!=' ' || i ==len -1){

                switch(lastSign){

                    case '+':

                        stack.push(num);

                        break;

                    case '-':

                        stack.push(-num);

                        break;

                    case '*':

                        stack.push(stack.pop() * num);

                        break;

                    case '/':

                        stack.push(stack.pop() / num);

                        break;

                }

                lastSign = c;

                num = 0;

            }

        }

        while (!stack.isEmpty())

            num +=stack.pop();

        return num;

    }

}
