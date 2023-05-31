

import java.util.*;



public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
           
          c.setValue((int)(Math.random() * 13 + 1));
           
          c.setSuit(Card.SUITS[(int)(Math.random() *3+0)]);
        
            magicHand[i]=c;
        }

      
        Scanner scan=  new Scanner(System.in);
        System.out.println("Please enter the value of the card from 1 to 13");
        int num = scan.nextInt();
       
        System.out.println("Please enter the suit as from Spades, Diamonds, Clubs, Hearts");
        String str = scan.next();
       
      
       boolean ans = false;
       
     

       System.out.println("The Values set by System are as follows : \n");
for(int i = 0;i<magicHand.length; i++){

   
    System.out.println("Value = "+magicHand[i].getValue()+"\tSuit = "+magicHand[i].getSuit() );
}
    
    System.out.println("\n\nYour Selections are Value: "+num + "\tSuit = "+str+"\n");
     

        for(int i=0; i<magicHand.length;i++)
        {
            if((magicHand[i].getValue()==num) && (magicHand[i].getSuit().equals(str))){
                ans = true;
                break;
            }
                
        }
        
        
        
       if(ans==true) System.out.println("Winner\n ");
       else System.out.println("No Match Please Try again\n");
        scan.close();
        

   
    }
    
}


