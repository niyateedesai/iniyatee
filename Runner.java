import java.lang.Math; 

public class Runner{

    public Runner(){
        int pitt = 63;
        PartnerA partnerA = 
            (num) -> {
                if((double)(Math.sqrt(num)-(int)Math.sqrt(num))==0)
                    return true;
                return false;
            };

        partnerA.perfectSquare(pitt);
    }

    public static void main(String[] args){
        Runner runner = new Runner();
    }

}