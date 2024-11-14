package tutorial;

public class TableForRange {

    public void printTable(String range) {

        try {
            String[] numbers = range.split("-");
            if (numbers.length != 2) {
                throw new IllegalArgumentException("Invalid range format. Use 'start-end'.");
            }
            int startNumber = Integer.parseInt(numbers[0]);
            int finishNumber = Integer.parseInt(numbers[1]);

            for (int i = startNumber; i <= finishNumber; i++) {
                System.out.println("Table for " + i);
                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + " * " + j + " = " + (i * j));
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numbers in the range.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
