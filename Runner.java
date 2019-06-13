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

	/*Iniya Rajamani
	  I learned about lambda expressions in Java and its advantages over normal methods. Lambda expressions are useful 
	  because they can be treated like an object and can also be excecuted whenever needed. I also learned about the 
	  relationship between Github and GitKraken and the benefits of using the workflow in GitKraken to see the history
	  and progress your work. GitKraken is useful when collaborating with others on a large project so filed can be easily
	  tracked and accessed whenever needed.*/
	
        partnerA.perfectSquare(pitt);

        float a = (float)82890.9;
		float b = (float)8.4;

		PartnerB partnerB =
			(float c, float d) -> {System.out.printf("%5.3f%n", c/d);};

		partnerB.printQuotient(a, b);

    }

    public static void main(String[] args){
        Runner runner = new Runner();
    }

    public interface PartnerB{
        public void printQuotient(float a, float b1);
    }

    public interface PartnerA{
        boolean perfectSquare(int num);
    }

}
