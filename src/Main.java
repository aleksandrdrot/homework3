
public class Main {
    public static void main(String[] args) {

        {
            int i = 1000275;
            System.out.println("Значение переменной i с типом int равно " + i);
            byte b = 123;
            System.out.println("Значение переменной b с типом byte равно " + b);
            short s = 27322;
            System.out.println("Значение переменной s с типом short равно " + s);
            long l = 35800275;
            System.out.println("Значение переменной l с типом long равно " + l);
            float f = 2.45f;
            System.out.println("Значение переменной f с типом float равно " + f);
            double d = 3.547;
            System.out.println("Значение переменной d с типом double равно " + d);
        }

        {
            float a = 27.12f;
            long b = 987678965549L;
            float c = 2.786f;
            short d = 569;
            short e = -159;
            short f = 27897;
            byte g = 67;
        }

        {
            byte teacher1 = 23; //Людмилы Павловны
            byte teacher2 = 27; //Анны Сергеевны
            byte teacher3 = 30; //Екатерины Андреевны
            short allPaper = 480;
            byte paperOnStudent = (byte) (allPaper / (teacher1 + teacher2 + teacher3));
            System.out.println("На каждого ученика рассчитано " + paperOnStudent + " листов бумаги.");
        }

        {
            byte bottle = 16; // бутылок за 2 минуты
            short bottle20minutes = 16 * 10;
            System.out.println("За 20 машина произвела " + bottle20minutes + " штук бутылок");
            short bottleOneDay = (short) (bottle20minutes * 3 * 24);
            System.out.println("За 1 день машина произвела " + bottleOneDay + " штук бутылок");
            int bottleThreeDays = bottleOneDay * 3;
            System.out.println("За 3 деня машина произвела " + bottleThreeDays + " штук бутылок");
            int bottleOneMonth = bottleThreeDays * 20;
            System.out.println("За 1 месяц машина произвела " + bottleOneMonth + " штук бутылок");
        }

        {
            byte bankWhite = 2;
            byte bankBrown = 4;
            byte allBanks = 120;
            byte bankOnClass = (byte) (allBanks/(bankWhite + bankBrown));
            byte white = (byte) (bankOnClass * bankWhite);
            byte brown = (byte) (bankOnClass * bankBrown);
            System.out.println("В школе, где " + bankOnClass + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски.");
        }

//      Как написал один програмист (не помню кто), сейчас компьютеры стали настолько мощные, а ОЗУ настолько много что борьба за место в ОЗУ
//      при обьявлении переменных уже не актуальна. Поэтому я немного подзабил, и дальше использовал просто "Int"

        {
            int bananas = 5 * 80;
            int milk = 105 * 2;
            int iceCream = 100 * 2;
            int egg = 70 * 4;
            float kg = (bananas+milk+iceCream+egg)/1000f;
            System.out.println("Вес такого спортзавтрака " + (bananas + milk + iceCream + egg) + " грамм, это " + kg + " килограмм");
        }

        {
            int weight = 7 * 1000;
            int menu1 = 250;
            int menu2 = 500;
            System.out.println("Потребоваться " + (weight/menu1) + " дней в среднем, чтобы добиться результата похудения если терять " +
                    (menu1) + " грамм в день.");
            System.out.println("Потребоваться " + (weight/menu2) + " дней в среднем, чтобы добиться результата похудения если терять " +
                    (menu2) + " грамм в день.");
        }

        {
            int masha = 67760;
            int mashaPrem = (int) (masha * 0.1f)+masha;
            System.out.println("Маша теперь получает " + (mashaPrem) + " рублей. Годовой доход вырос на " + ((mashaPrem - masha) * 12) + " рублей");
            int denis = 83690;
            int denisPrem = (int) (denis * 0.1f)+denis;
            System.out.println("Денис теперь получает " + (denisPrem) + " рублей. Годовой доход вырос на " + ((denisPrem - denis) * 12) + " рублей");
            int kristina = 76230;
            int kristinaPrem = (int) (kristina * 0.1f)+kristina;
            System.out.println("Кристина теперь получает " + (kristinaPrem) + " рублей. Годовой доход вырос на " + ((kristinaPrem - kristina) * 12) + " рублей");
        }
//--- А вот так будет правельней ---------//
        prem("Маша", 67760);
        prem("Денис",83690);
        prem("Кристина",76230);

    }

    public static void prem (String name, int money){
        int prem = (int)(money * 0.1f)+money;
        System.out.println(name +" теперь получает " + prem + " рублей. Годовой доход вырос на " + ((prem - money) * 12) + " рублей");
    }
}