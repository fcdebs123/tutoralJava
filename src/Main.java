import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String name = "Anil";
        int age = 30;
        float height = 5.95f;
        char gender = 'M';
        boolean isStudent = true;
        String favChar = "Spiderman";
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(isStudent);
        System.out.println(favChar);

        int number1=20;
        int number2=10;
        int add=number1+number2;
        int subtract=number1-number2;
        int multiply=number1*number2;
        int division=number1/number2;
        int remainder=number1%number2;
        System.out.println("Addition:"+add);
        System.out.println("multiply:"+multiply);
        System.out.println("subtract:"+subtract);
        System.out.println("division:"+division);
        System.out.println("remainder:"+remainder);


        double celsius=25;
        double Farenheit=(celsius*9/5)+32;
        System.out.println("The farenheit temperature is:"+Farenheit);

        String fullName="My name is Anil. I am learning java.";
        System.out.println(fullName);
        System.out.println(fullName.length());
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());


        String firstName="Anil";
        String lastName="Pandey";
        int age1=30;
        System.out.println("My full name is "+ firstName +" "+ lastName +"and I am"+age1+" years old");

        int[] number={10,20,30,40,50};

        System.out.println(Arrays.toString(number));
        System.out.println((number[0]));
        System.out.println(number[4]);
        System.out.println(number.length);


        int[] number3={12,20,30,40,50};
        int sum=0;
        for (int i=0;i<number3.length;i++){
            sum=sum+number3[i];
        }
        System.out.println(Arrays.toString(number3));
        System.out.println(sum);

        int[] totalNumber={12,45,7,89,23};
        int smallest=totalNumber[0];

        for(int i=1;i<totalNumber.length;i++){
            if(totalNumber[i]<smallest){
                smallest=totalNumber[i];
            }
        }
        System.out.println("smallest is;"+smallest);


        int[] marks={75,82,68,91,88};
        int totalMarks=marks[0];
        float averageMarks=marks[0];
        int highsetmarks=marks[0];
        int lowestmarks=marks[0];

        //int firstNUmber=0;
        for(int i=1; i<marks.length;i++) {
            totalMarks = totalMarks + marks[i];
            averageMarks = totalMarks / 5;
            if(marks[i]>highsetmarks){
                highsetmarks=marks[i];
            }
            if(marks[i]<lowestmarks){
                lowestmarks=marks[i];
            }
        }
        System.out.println(totalMarks);
        System.out.println(averageMarks);
        System.out.println(highsetmarks);
        System.out.println(lowestmarks);
        

    }

}