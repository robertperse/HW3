public class Main {
    public static void main(String[] args) {
        byte b = 10;
        short s = 100;
        int i = 1000;
        long l = 10000L;
        float f = 3.5f;
        double d = 32.85;
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);

        byte b1 = 67;
        short s1 = 569;
        short s2 = -159;
        int i1 = 27897;
        long l1 = 987678965549L;
        float f1 = 2.786f;
        double d1 = 27.12;

        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short total = 480;
        int person = total / (lp + as + ea);
        System.out.println("На каждого ученика рассчитано " + person + " листов бумаги");

        byte count = 8;
        int min = 1;
        min = min + 19;
        int k = count * min;
        System.out.println("За 20 минут машина произвела " + k + " штук бутылок");
        min = min + 40;
        byte hours = 24;
        int k1 = count * min * hours;
        System.out.println("За сутки машина произвела " + k1 + " штук бутылок");
        int day = 3;
        int k2 = count * min * hours * day;
        System.out.println("За 3 дня машина произвела " + k2 + " штук бутылок");
        day = day + 27;
        int k3 = count * min * hours * day;
        System.out.println("За 1 месяц машина произвела " + k3 + " штук бутылок");

        byte white = 2;
        byte brown = 4;
        byte paint = 120;
        int paintPerClass = white + brown;
        int classes = paint / paintPerClass;
        int whiteTotal = white * classes;
        int brownTotal = brown * classes;
        System.out.println("В школе, где " + classes + " классов, нужно " + whiteTotal + " банок белой краски и " + brownTotal + " банок коричневой краски");

        byte bananaWeight = 80;
        byte bananaCount = 5;
        int bananaTotal = bananaCount * bananaWeight;
        byte milkWeight = 105;
        byte milkCount = 2;
        int milkTotal = milkCount * milkWeight;
        byte icecreamWeight = 100;
        byte icecreamCount = 2;
        int icecreamTotal = icecreamCount * icecreamWeight;
        byte eggWeight = 70;
        byte eggCount = 4;
        int eggTotal = eggCount * eggWeight;
        int totalWeight = eggTotal + icecreamTotal + milkTotal + bananaTotal;
        System.out.println(totalWeight + " грамм");
        float totalWeightKG = totalWeight / 1000f;
        System.out.println(totalWeightKG + " килограмм");

        byte goal = 7;
        float minPerDay = 0.25f;
        float maxPerDay = 0.5f;
        float maxTime = goal / minPerDay;
        System.out.println(maxTime + " дней");
        float minTime = goal / maxPerDay;
        System.out.println(minTime + " дней");
        float avgTime = (maxTime + minTime) / 2;
        System.out.println(avgTime + " дней");

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float mashaRaise = masha * 1.1f;
        float denisRaise = denis * 1.1f;
        float kristinaRaise = kristina * 1.1f;
        byte months = 12;
        int mashaPerYear = masha * months;
        int denisPerYear = denis * months;
        int kristinaPerYear = kristina * months;
        float mashaPerYearRaised = mashaRaise * months;
        float denisPerYearRaised = denisRaise * months;
        float kristinaPerYearRaised = kristinaRaise * months;
        float mashaDif = mashaPerYearRaised - mashaPerYear;
        float denisDif = denisPerYearRaised - denisPerYear;
        float kristinaDif = kristinaPerYearRaised - kristinaPerYear;
        System.out.println("Маша теперь получает " +mashaRaise +" рублей. Годовой доход вырос на " +mashaDif +" рублей");
        System.out.println("Денис теперь получает " +denisRaise +" рублей. Годовой доход вырос на " +denisDif +" рублей");
        System.out.println("Кристина теперь получает " +kristinaRaise +" рублей. Годовой доход вырос на " +kristinaDif +" рублей");
    }
}