public class Main {
    public static void main(String[] args) {
int a = 100;
byte b = 1;
short c = 9;
long d = 365L;
float e = 0.2f;
double f = 10.1;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);


        System.out.println("Задание 2");
        int a1 = -159;
        byte b1 = 67;
        short c1 = 27897;
        long d1 = 987678965549L;
        float e1 = 27.12f;
        double f1 = 2.786;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(d1);
        System.out.println(e1);
        System.out.println(f1);


        System.out.println("Задание 3");
        int teacher1 = 23;
        int teacher2 = 27;
        int teacher3 = 30;
        int totalStudents = teacher1 + teacher2 + teacher3;
        int papers = 480;
        int studentsPaper = papers / totalStudents;
        System.out.println("На каждого ученика рассчитано " + studentsPaper + " листов бумаги ");

        System.out.println("Задание 4");
        int minutes2 = 16;
        int minutesHour = 60;
        int hourDay = 24;
        int daysMonth = 30;
        int performancePerMinute = minutes2 / 2;
        int performance20 = performancePerMinute * 20;
        int performanceDay = minutesHour * hourDay * performancePerMinute;
        int numberOfMinutes3 = performanceDay * 3;
        int month = performanceDay * daysMonth;
        System.out.println("За 20 минут машина произвела " + performance20 + " штук бутылок");
        System.out.println("За 1 день машина произвела " + performanceDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + numberOfMinutes3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + month + " штук бутылок");


        System.out.println("Задание 5");
        int total = 120;
        int white = 2;
        int brown = 4;
        int class1 = white + brown;
        int paintedClasses = total / class1;
        int buyWhite = paintedClasses * white;
        int buyBrown = paintedClasses * brown;
        System.out.println("В школе, где " + paintedClasses + " классов, нужно " + buyWhite + " банок белой краски и " + buyBrown + " банок коричневой краски");


        System.out.println("Задание 6");
        int bananas = 5;
        int banana1 = 80;
        int grammBananas = bananas * banana1;
        int milk = 200;
        int milk100 = 105;
        int grammMilk = (milk * milk100) / 100;
        int iceCream2 = 200;
        int eggs = 4;
        int egg1 = 70;
        int grammEggs = eggs * egg1;
        int totalWeight = grammBananas + grammMilk + iceCream2 + grammEggs;
        double kg = 1000;
        double weight = totalWeight / kg;
        System.out.println("Вес такого спортзавтрака составляет " + totalWeight + " граммов, или " + weight + " кг");


        System.out.println("Задание 7");
        double i1 = 7000;
        int dailyWeightLoss1 = 250;
        double days1 = i1 / dailyWeightLoss1;
        int dailyWeightLoss2 = 500;
        double days2 = i1 / dailyWeightLoss2;
        double averageLoss = (dailyWeightLoss1 + dailyWeightLoss2) / 2.0;
        double averageNumberOfDays = i1 / averageLoss;
        long roundedAverageDays = Math.round(averageNumberOfDays);
        System.out.println("Если спортсмен будет терять по 250 грамм в день, то ему потребуется " + days1 + " дней");
        System.out.println("Если спортсмен будет терять по 500 грамм в день, то ему потребуется " + days2 + " дней");
        System.out.println("В среднем, для достижения результата похудения может потребоваться около " + averageNumberOfDays + " дней");
        System.out.println("В среднем (~округлённо): " + roundedAverageDays + " дней");


        System.out.println("Задание 8");
        System.out.println("Маша");
        int current = 67760;
        int new1 = (int) (current * 1.10);
        int beforePromotion = current * 12;
        int afterPromotion = new1 * 12;
        int difference = afterPromotion - beforePromotion;
        System.out.println("Денис");
        int current1 = 83690;
        int new2 = (int) (current1 * 1.10);
        int beforePromotion1 = current1 * 12;
        int afterPromotion1 = new2 * 12;
        int difference1 = afterPromotion1 - beforePromotion1;
        System.out.println("Кристина");
        int current3 = 76230;
        int new3 = (int) (current3 * 1.10);
        int beforePromotion2 = current3 * 12;
        int afterPromotion2 = new3 * 12;
        int difference2 = afterPromotion2 - beforePromotion2;
        System.out.println("Маша теперь получает " + new1 + " рублей. Годовой доход вырос на " + difference + " рублей");
        System.out.println("Денис теперь получает " + new2 + " рублей. Годовой доход вырос на " + difference1 + " рублей");
        System.out.println("Кристина теперь получает " + new3 + " рублей. Годовой доход вырос на " + difference2 + " рублей");
    }
}