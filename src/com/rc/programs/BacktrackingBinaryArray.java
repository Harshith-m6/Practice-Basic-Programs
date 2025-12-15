package com.rc.programs;

class BacktrackingBinaryArray {
    static void generate(int[] arr, int index) {
        if (index == arr.length) {
            for (int n : arr)
                System.out.print(n);
            System.out.println();
            return;
        }

        arr[index] = 0;
        generate(arr, index + 1);

        arr[index] = 1;
        generate(arr, index + 1);
    }

    public static void main(String[] args) {
        generate(new int[3], 0);
    }
}

