package com.mycompany.Kasus3;

/*@author Fikri*/
public class WeeklySales {
    public static void main(String[] args)
    {
             Salesperson [] salesStaff = new Salesperson [6];
             salesStaff[0] = new Salesperson ("Fikri", "Hairul", 3000);
             salesStaff[1] = new Salesperson ("Faras", "Rama", 4000);
             salesStaff[2] = new Salesperson ("Fahrizal", "Mudzaki", 3000);
             salesStaff[3] = new Salesperson ("Syaiful", "Ipung", 2800);
             salesStaff[4] = new Salesperson ("Tendy", "Wijaya", 1570);
             salesStaff[5] = new Salesperson ("Rafi", "Syauqi", 7300);
             Sorting.insertionSort(salesStaff);
             System.out.println("\nRanking of Sales for the week\n");
             for(Salesperson s : salesStaff)
             System.out.println(s);
    }    
}
