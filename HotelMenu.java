package Assignments;

import java.util.HashMap;
import java.util.Scanner;

public class HotelMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1 -> Veg Pizza  @150");
        System.out.println("2 -> Paneer Pizza  @190");
        System.out.println("3 -> Chicken Pizza  @250");
        System.out.println("4 -> Veg Burger  @150");
        System.out.println("5 -> Cheese Burger  @200");
        System.out.println("6 -> Sandwitch  @200");
        System.out.println("7 -> Chocolate shake  @180");
        System.out.println("8 -> Kitkat Shake  @200");
        System.out.println("9 -> Oreo Shake  @160");
        System.out.println("10 -> Manchow Soup  @110");
        System.out.println("11 -> Sweet Corn Soup  @100");
        System.out.println("12 -> French Fries  @90");
        System.out.println("13 -> Coffee  @140");
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        System.out.println("Enter the number regarding items you want to order and its quantity -");
        System.out.println("(Write 0 once you are done )");
        for(int i =0; i<13;i++){
            int a =sc.nextInt();
            if(a==0)break;
            map.put(a, sc.nextInt());
            }
            System.out.println("Your Bill - ");
            System.out.println("Total Price of your order is: "+ bill(map));
        
        sc.close();
    }
    public static float bill(HashMap<Integer,Integer> map){
        float price = 0;
        for (HashMap.Entry<Integer, Integer> e : map.entrySet()) {
            int item = e.getKey();
            if(item > 13){
                 System.out.println("invalid");
                break;
        }
            int qty = e.getValue();
            switch(item){
                case 1: price+=qty*150; System.out.println("Veg Pizza : "+qty+" - Rs."+qty*150);break;
                case 2: price+=qty*190;System.out.println("Paneer Pizza : "+qty+" - Rs."+qty*190);break;
                case 3: price+=qty*250;System.out.println("Chicken Pizza : "+qty+" - Rs."+qty*250);break;
                case 4: price+=qty*150;System.out.println("Veg Burger : "+qty+" - Rs."+qty*150);break;
                case 5: price+=qty*200;System.out.println("Cheese Burger : "+qty+" - Rs."+qty*200);break;
                case 6: price+=qty*200;System.out.println("SandWitch : "+qty+" - Rs."+qty*200);break;
                case 7: price+=qty*180;System.out.println("Chocolate Shake : "+qty+" - Rs."+qty*180);break;
                case 8: price+=qty*200;System.out.println("Kitkat Shake : "+qty+" - Rs."+qty*200);break;
                case 9: price+=qty*160;System.out.println("Oreo shake : "+qty+" - Rs."+qty*160);break;
                case 10: price+=qty*110;System.out.println("Manchow Soup : "+qty+" - Rs."+qty*110);break;
                case 11: price+=qty*100;System.out.println("Sweet Corn Soup : "+qty+" - Rs."+qty*100);break;
                case 12: price+=qty*90;System.out.println("French Fries : "+qty+" - Rs."+qty*90);break;
                case 13: price+=qty*140;System.out.println("Coffee : "+qty+" - Rs."+qty*140);break;
                default: System.out.println("invalid entry");
            }
            
		}
        System.out.println("-------------------------");
        return price;
    }
}
