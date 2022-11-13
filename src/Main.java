import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ 3 - (Задача 2):");

        List<MultiplicationTable> allPairs = new ArrayList<>();
        for (int first = 2; first <= 9; first++) {
            for (int second = first; second <= 9; second++) {
                allPairs.add(new MultiplicationTable(first, second));
            }
        }
        Collections.shuffle(allPairs);
        List<MultiplicationTable> chosenPairs = allPairs.subList(0, 15);
        for (MultiplicationTable chosenPair : chosenPairs) {
            System.out.println(chosenPair);
        }

        System.out.println("ДЗ 3 - (Задача 3):");

        Passport passport = new Passport("4000_123456","Иванов","Иван",null,"11.11.2000");
        Passport passport1 = new Passport("4012_123456","Смирнов","Сергей","Викторович","21.08.1984");
        Passport passport2 = new Passport("4022_678456","Воробьев","Артём","Сергеевич","25.05.2002");
        Passport passport3 = new Passport("6011_123459","Скворцов","Дамир","Ярославович","15.08.2005");
        Passport passport4 = new Passport("6011_123459","Якутин","Алексей","Леонидович","21.06.1999");

        Map<String, Passport> passportMap = new HashMap<>();
        passportMap.put(passport.getPassportNumber(),passport);
        passportMap.put(passport1.getPassportNumber(),passport1);
        passportMap.put(passport2.getPassportNumber(),passport2);
        passportMap.put(passport3.getPassportNumber(),passport3);
        passportMap.put(passport4.getPassportNumber(),passport4);

        System.out.println(passportMap.get("4000_123456"));
        System.out.println(passportMap.get("6011_123459"));
        System.out.println(passportMap.get("6011_123459"));
        System.out.println(passportMap.get("4012_123"));
    }
}