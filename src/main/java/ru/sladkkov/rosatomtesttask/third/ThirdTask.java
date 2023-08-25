package ru.sladkkov.rosatomtesttask.third;

public class ThirdTask {
    private ThirdTask() {
    }

    public static boolean isPalindrome(String str) {
        if (str.isEmpty()) {
            return true;
        }

        int head = 0;
        int tail = str.length() - 1;
        char charHead;
        char charTail;

        while (head <= tail) {
            charHead = str.charAt(head);
            charTail = str.charAt(tail);
            if (!Character.isLetterOrDigit(charHead)) {
                head++;
            } else if (!Character.isLetterOrDigit(charTail)) {
                tail--;
            } else {
                if (Character.toLowerCase(charHead) != Character.toLowerCase(charTail)) {
                    return false;
                }
                head++;
                tail--;
            }
        }

        return true;
    }

    public static boolean isPalindromeWithStringBuilder(String str) {
        if (str.isEmpty()) {
            return true;
        }

        str = str.toLowerCase();

        StringBuilder reversed = new StringBuilder(str).reverse();
        return str.contentEquals(reversed);
    }
}