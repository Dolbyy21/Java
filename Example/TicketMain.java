package com.Example;

//  Ticket Class

import java.util.*;

class Ticket{
    private int ticketId;
    private int price;

    static int availableTickets;

    // Setter to set the value method
    // Getter to get the value method

    public void setTicketId(int ticketId){
        this.ticketId = ticketId;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setAvailableTickets(int availableTickets){
        if(availableTickets > 0)
            Ticket.availableTickets = availableTickets;
    }

    public int getTicketId(){
        return ticketId;
    }

    public int getPrice(){
        return price;
    }

    public int getAvailableTickets(){
        return availableTickets;
    }

    public int calculateTicketCost(int noOfTickets){
        boolean isAvailable = (availableTickets - noOfTickets) >= 0;


        //    String something = (2 > 0) ? "2 greater than 0" : " 2 is less than 0";


        if(isAvailable){
            availableTickets = (availableTickets - noOfTickets);
            return noOfTickets*price;
        }else{
            return -1;
        }
    }

}

public class TicketMain{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.of Bookings : ");
        int n = sc.nextInt();   //2

        Ticket t = new Ticket();
        System.out.println("Enter the available tickets : ");
        int avail = sc.nextInt();          // 25
        t.setAvailableTickets(avail);

        for(int i= 0; i < n ; i++){

            System.out.println("Enter the ticket id : ");
            int ticId = sc.nextInt();
            t.setTicketId(ticId);

            System.out.println("Enter the price : ");
            int pric = sc.nextInt();
            t.setPrice(pric);

            System.out.println("Enter the no of tickets : ");
            int no = sc.nextInt();

            System.out.println("Available Tickets : "+ t.getAvailableTickets());

            int sdv = t.calculateTicketCost(no);

            System.out.println("Total amount : "+ sdv );

            System.out.println("Available tickets after booking : "+ t.getAvailableTickets() );

        }
    }
}

