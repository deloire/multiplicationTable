package tutorial;

public class TableForNumber {

    public void printTable(int number) {
        for (int i = 1; i <= 10; i++) {
            int answer = number * i;
            System.out.printf("%d * %d = %d\n", number, i, answer);
        }
    }

}
