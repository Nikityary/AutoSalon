import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while(true){
            Scanner s = new Scanner(System.in);
            System.out.println("Зарегистрировать машину(1)//Вывести список всех автомобилей(2)//Удалить автомобиль(3)");
            Integer answ = s.nextInt();
            RegAuto reg = new RegAuto();
            switch (answ){
                case 1:
                    Scanner s1 = new Scanner(System.in);
                    reg.Out("Введите марку машины:");
                    String mk = s1.nextLine();
                    reg.Out("Введите модель машины:");
                    String ml = s1.nextLine();
                    reg.Out("Введите цвет машины:");
                    String cr = s1.nextLine();
                    reg.Out("Машина зарегистрирована:");
                    reg.Registr(mk, ml, cr);
                    break;

                case 2:
                    reg.Out("Список авто: ");
                    reg.AutoOut();
                    break;

                case 3:
                    Scanner s2 = new Scanner(System.in);
                    reg.AutoOut();
                    reg.Out("Введите номер машины:");
                    int n = s2.nextInt();
                    reg.DelCar(n);
                    break;
            }
        }
    }
}