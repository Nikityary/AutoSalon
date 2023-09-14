import java.util.ArrayList;
import java.util.Scanner;

public class RegAuto {
    static ArrayList<String> stArr = new ArrayList<>();
    public void Registr(String mark, String model, String color){
        stArr.add(mark + " " + model + " (" + color + ")");
        Out(stArr.get(stArr.size() - 1));
    }
    void Out(String a){
        System.out.println(a);
    }

    void AutoOut(){
        for(int i = 1; i <= stArr.size(); i++){
            Out(i + "| " + stArr.get(i-1));
        }
        Out("");
    }

    void DelCar(int id){
        id--;
        if (id >= 0 && id < stArr.size()) {
            Out("Вы уверены что хотите удалить: " + stArr.get(id));
            Out("(y/n)");
            Scanner s = new Scanner(System.in);
            String answ = s.nextLine();
            if(answ.equals("y")){
                String removedElement = stArr.remove(id);
                System.out.println("Удалена: " + removedElement);
            }
            else
                Out("Операция отменена");
        } else {
            System.out.println("Машина не найдена");
        }

        System.out.println("Обновлённый список автомобилей:");
        for (String item : stArr) {
            System.out.println(item);
        }
    }
}
