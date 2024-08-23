import java.util.Optional;

public class Main {

    public static void main(String[] args)
    {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper= 763789;
        System.out.println(paper);

        var result  = dog+2;
        System.out.println(result);
        var result1 = cat+4;
        System.out.println(result1);
        var result2= paper+4;
        System.out.println(result2);

        var result3= result-3.5;
        System.out.println(result3) ;
        var result4= result1-1.6;
        System.out.println (result4);
        var result5= result2-7639;
        System.out.println(result5);

        var friend = 19;
        System.out.println ( friend );
        var friend1 = friend + 2;
        System.out.println ( friend1);
        var friend2 = friend1 / 7;
        System.out.println (friend2 );

        var x= 78.2;
        var y= 82.7;
        var sum = x + y ;
        System.out.println (sum);
        var subtraction = y-x;
        System.out.println (subtraction);

        var reminder = y%x;
        System.out.println(reminder);

        var totalHours=640;
        var single=8;
        var amountWorkers= totalHours/single;


        System.out.println ("Всего работников в компании — "+ amountWorkers+ " человек");

        var newAmountWorkers= amountWorkers+94;
        var newHoursPerWorker= totalHours/newAmountWorkers;
                System.out.println ("Если в компании работает "+ newAmountWorkers + " человек, то всего " +
                        newHoursPerWorker + " часа работы может быть поделено между сотрудниками." );



         }
}