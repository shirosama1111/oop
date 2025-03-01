import java.util.Scanner;

public class ngaythang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("nhap ngay");
		String a = sc.next();
        System.out.println("nhap thang");
        int b = sc.nextInt();
        sc.close();
        if(a.equals("Jan")||a.equals("Jan.")||a.equals("January")||a.equals("1")){
            System.out.println("31");
        }
        else if(a.equals("Feb")||a.equals("Feb.")||a.equals("February")||a.equals("2")){
            if(b % 4 == 0){
            	if(b % 100 == 0 && b % 400 != 0) {
            		System.out.println("28");
            	}
            	else {
            		System.out.println("29");
            	}
            }
            else {
            	System.out.println("28");
            }
        }
        else if(a.equals("Mar")||a.equals("Mar.")||a.equals("March")||a.equals("3")){
            System.out.println("31");
        }
        else if(a.equals("Apr")||a.equals("Apr.")||a.equals("April")||a.equals("4")){
            System.out.println("30");
        }
        else if(a.equals("May")||a.equals("5")){
            System.out.println("31");
        }
        else if(a.equals("June")||a.equals("Jun")||a.equals("6")){
            System.out.println("30");
        }
        else if(a.equals("July")||a.equals("Jul")||a.equals("7")){
            System.out.println("31");
        }
        else if(a.equals("Aug")||a.equals("Aug.")||a.equals("August")||a.equals("8")){
            System.out.println("31");
        }
        else if(a.equals("Sep")||a.equals("Sep.")||a.equals("September")||a.equals("9")){
            System.out.println("30");
        }
        else if(a.equals("Oct")||a.equals("Oct.")||a.equals("October")||a.equals("10")){
            System.out.println("31");
        }
        else if(a.equals("Nov")||a.equals("Nov.")||a.equals("November")||a.equals("11")){
            System.out.println("30");
        }
        else if(a.equals("Dec")||a.equals("Dec.")||a.equals("December")||a.equals("12")){
            System.out.println("31");
        }
	}
}