package com.mycompany.Kasus3;

/*@author Fikri*/
public class Salesperson implements Comparable<Salesperson> {
    private String firstName, lastName;
    private int totalSales;

    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString() {
        return lastName + ", " + firstName + ":  \t" + totalSales;
    }

    public boolean equals(Object other) {
        if (other instanceof Salesperson) {
            Salesperson otherPerson = (Salesperson) other;
            return lastName.equals(otherPerson.getLastName()) && firstName.equals(otherPerson.getFirstName());
        }
        return false;
    }

    public int compareTo(Salesperson other) {
        int result = other.totalSales - this.totalSales;
        if (result == 0) {
            result = this.lastName.compareTo(other.getLastName());
            if (result == 0) {
                result = this.firstName.compareTo(other.getFirstName());
            }
        }
        return result;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTotalSales() {
        return totalSales;
    }
}
