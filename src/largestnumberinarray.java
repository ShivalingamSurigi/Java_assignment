public class largestnumberinarray {
    public static void main(String args[])
    {
        int[] numbers={34,56,47,36,98};
        int largest=numbers[0];
        for (int num:numbers) {
            if (num<largest)
            IO.println(numbers);
        }
    }
}
