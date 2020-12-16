package kekw3;

import kekw2.LinkedList;
import kekw2.MyArrayList;
import kekw2.ObjectUtils;
import kekw2.Person;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

/*
• List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
	Вивести в консоль всі змінні в відсортованому вигляді
 які починаються з «с» та трансформувати їх в верхній регістр

• Заповнити масив розміром n рандомними значеннями в діапазоні (від 0 до 9) та порахувати середнє арифметичне всіх парних чисел

Данний рядок «sjdhgfsjkavchjwagehf» (Просто набір букв в нижньому регістрі), потрібно підняти в верхній регістр всі букви в діапазоні від H до T по алфавіту


Переписати реалізацію LinkedList, ArrayList (Stack, Queue) на Generics - Realizovano v kekw2

 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /////1
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        var res1 = myList.stream().filter(x -> x.charAt(0) == 'c').map(x -> x.toUpperCase()).sorted().collect(Collectors.toList());
        //// 2
        Random random = new Random();

       var avr =  Arrays.stream(random.ints(14, 0, 9).toArray()).filter(x->(x%2) == 0).average();
       /// 3

        var re = "sjdhgfsjkavchjwagehf";

        var result = re.chars().map(x-> x > 68 && x < 74? Character.toUpperCase(x) : x);

    }
}

