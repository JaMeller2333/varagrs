public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Karol", "Kowalski", "Karol.K@mail.com", "Targ Sienny 7, 80-806 Gdańsk");
        Person person2 = new Person("Anna", "Nowak", "Anna.N@mail.com", "Słoneczna 12, 30-201 Kraków");

        displayPersons(person1, person2);

        String result = removeEveryNthWord(2, "Ala", "nie", "ma", "test", "kota", "i", "psa", "papugę");
        System.out.println(result);

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {7, 8, 9};

        int sum = sumArrays(arr1, arr2, arr3);
        System.out.println("Suma wszystkich elementów: " + sum);
    }

    public static void displayPersons(Person... persons) {
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }

    public static String removeEveryNthWord(int n, String... words) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if ((i + 1) % n != 0) {
                result.append(words[i]).append(" ");
            }
        }

        return result.toString().trim();
    }

    public static int sumArrays(int[]... arrays) {
        int sum = 0;

        for (int[] array : arrays) {
            for (int num : array) {
                sum += num;
            }
        }

        return sum;
    }
}
