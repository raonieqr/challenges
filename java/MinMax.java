class MinMax {
    public static int[] minMax(int[] arr) {
        if (arr == null)
            return null;

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        int[] array = { min, max };
        return array;
    }
}

