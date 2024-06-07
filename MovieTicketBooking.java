import java.util.*;
class LinkedList{
    protected Node start;
    protected Node end;
    public int size;
    public LinkedList(){
        start=null;
        end=null;
        size=0;
    }
    public void Insert(int val){
        Node nptr=new Node(val,null);
        size++;
        if(start == null){
            start =nptr;
            end=start;
        }
        else{
            end.setLink(nptr);
            end=nptr;
        }
    }
    public void Delete(int pos){
        if(pos==1){
            start=start.getLink();
            size--;
            return;
        }
        if(pos==size) {
            Node s = start;
            Node t = start;
            while (s != end) {
                t = s;
                s = s.getLink();
            }
            end = t;
            end.setLink(null);
            size--;
            return;
        }
        Node ptr=start;
        pos=pos-1;
        for(int i=1;i<size-1;i++)
        {
            if(i==pos){
                Node tmp=ptr.getLink();
                tmp=tmp.getLink();
                ptr.setLink(tmp);
                break;
            }
            ptr=ptr.getLink();
        }
        size--;
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        char ch;
        do {
            System.out.println("Enter 1. book Movie tickets 2. Cancel Tickets 3. View Seats/ Booking status 4.Exit");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    System.out.println("Which movie do you want to watch? 1.movie 2.movie 3.movie 4.back");
                    list.Insert(sc.nextInt());
                    System.out.println("Which screen do you want to watch movie? 1.screen 2.screen 3.screen 4.back");
                    list.Insert(sc.nextInt());
                    System.out.println("How many tickets do you want to buy? ");
                    list.Insert(sc.nextInt());
                    System.out.println("Choose your time: 1:10.~1. 2:1.10~4.10 3:4.20~7.20 4:7.30~10.30 ");
                    list.Insert(sc.nextInt());
                    System.out.println("Successful, enjoy your movie");
                    break;
                case 2:
                    System.out.println("Which do you want to delete?");
                    list.Delete(sc.nextInt());
                    System.out.println("Successful");
            }
            ch=sc.next().charAt(0);
        }while(ch=='Y'||ch=='y');

        sc.close();
    }

}
class Node{
    protected int data;
    protected Node link;
    public Node(){
        link=null;
        data=0;
    }
    public Node(int d,Node n){
        data=d;
        link=n;
    }
    public void setLink(Node n){
        link=n;
    }
    public void setData(int d){
        data=d;
    }

    public Node getLink(){
        return link;
    }
    public int getData(){
        return data;
    }
}
