public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Задача1");
            int totally= 0;
            int deposit= 15000;
            int month= 1;

            while(totally< 2_459_000){
                totally += (int) totally* 0.12;
                totally += deposit;
                System.out.println("Месяц"+month  + "сумма накоплений равна" + totally +"рублей");
                month ++;
            }
        }
        {
            System.out.println("Задача2");
            int start= 0;
            while (start<10) {
                start++;
                System.out.print ( start + " ");
            }
            System.out.println( );
            for (start=10; start >0; start--){

                System.out.print (start + " "  );
            }
        }
        {
            System.out.println( );
            System.out.println("Задача3");
            int country= 12_000_000;
            for(int year=1 ;year<=10 ;year++ ) {
                int life= country/ 1000 * 17;
                int dead= country/ 1000 * 8;
                country= country+ life - dead;
                System.out.println("Год"+ year +"чилсенность населения составляет" +country);
            }
        }
        {
            System.out.println("Задача4");
            int deposits = 15000;
            int sum=deposits;
            int months =1;
            while (sum<12_000_000) {
                sum= (int) (sum + sum/100 * 7);
                System.out.println("Месяц"+ months +"сумма накоплений"+sum);
                months++;
            }
        }
        {
            System.out.println("Задача5");
            int deposit = 15000;
            int sum=deposit;
            int month =1;
            while (sum<12_000_000) {
                sum=   (int) (sum + sum /100 *7);
                if (month %6==0) {
                    System.out.println("месяц"+month+ "сумма накоплений" +sum);
                }
                month++;

            }
        }
        {
            System.out.println("Задача6");
            int deposits= 15000;
            for (int months=1 ;months<9*12; months++){
                deposits= deposits+ (deposits/100 *7);
                if (months %6==0) {
                System.out.println("Месяц"+ months+ "сумма накоплений"+ deposits);
            }
        }
        }
        {
            System.out.println("Задача7");
            for(int friday=1 ; friday<=31; friday +=7) {
                System.out.println("Сегодня пятница"+friday +"-е число необходимо подготовить отчет");

            }
        }
        {
            System.out.println("Задача8");
            int start= 2023-200;
            int finish= 2023+100;
            for(int year=start;year< finish ; year++){
                if(year % 79==0) {
                    System.out.println(year);
                }
            }
        }

    }
}