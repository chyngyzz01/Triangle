import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("Chyngyz", "Zalkarbekov", 24);
        MyClass myClass1 = new MyClass(new String[]{"java", "javascript", "english"}, "ASH");

        System.out.printf("name: %s \nsurname: %s \nage: %d \n", myClass.name, myClass.surname, myClass.age);
        System.out.printf("lessons: %s \nfavorite food: %s", Arrays.toString(myClass1.lessons), myClass1.myFavoriteFood);

    }
}