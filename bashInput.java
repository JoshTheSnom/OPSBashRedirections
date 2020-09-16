import java.util.*;
import java.io.IOException;
class bashInput {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
        String str = "";
			while (sc.hasNextLine() && !str.equals("END")) {
                str = sc.nextLine();
                try {
                    int num = Integer.parseInt(str);
                    numbers.add(num);
                }catch (NumberFormatException e) {
                    System.out.println();
                    break;
                }
			}
	    sc.close();

        Collections.sort(numbers);
        
        int suma = 0;
        for (int i = 0; i < numbers.size(); i++) {
            suma = suma + numbers.get(i);
        }
        System.out.println("Suma je "+suma);
        
        double average = suma/numbers.size();
        System.out.println("Prumer je "+average);

        int lowest = numbers.get(0);
        System.out.println("Nejmensi cislo je "+lowest);

        int highest = numbers.get(numbers.size()-1);
        System.out.println("Nejvetsi cislo je "+highest);

    }
}
