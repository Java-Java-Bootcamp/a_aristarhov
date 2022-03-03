package ru.otus.array;

public class Anagram {

    public boolean check(String first, String second) {
        char[] left = first.toLowerCase().toCharArray();
        char[] right = second.toLowerCase().toCharArray();

        int leftCounter = 0;
        int rightCounter = 0;

        for (int i = 0; i < left.length; i++) {
            if (left[i] != ' ') {
                leftCounter++;
            }
        }

        for (char c : right) {
            if (c != ' ') {
                rightCounter++;
            }
        }
        if (leftCounter != rightCounter) {
            return false;
        }

        boolean [] leftMask = new boolean[left.length];
        boolean [] rightMask = new boolean[right.length];

        for(int i=0;i<leftMask.length; i++) leftMask[i] = (left[i] == ' ');
        for(int i=0;i<rightMask.length; i++) rightMask[i] = (right[i] == ' ');

        for(int i=0; i<left.length; i++) {
            if (!leftMask[i]) {
                boolean match=false;
                for (int j = 0; j < rightMask.length; j++)
                    if (!rightMask[j] && (left[i] == right[j])) {
                        leftMask[i] = true;
                        rightMask[j] = true;
                        match = true;
                        break;
                    }
                if(!match) {
                    return false;
                }
            }
        }


        for (int i=0; i<rightMask.length;i++) {
            if (!rightMask[i]) { return false; }
        }

        // TODO реализуйте дальнейшую проверку

        return true;
    }
}
