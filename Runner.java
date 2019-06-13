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
	/* Niyatee Desai: I learned about lambda expressions in Java. A lambda expression is
	a newer functionality in Java which allows coders to save instances of interfaces with
	a single method rather than use these methods annonymously. With this feature, coders can 
	treat the lambda expression as an object that does not belong to a class.
	I also learned about GitHub and GitKraken, which is a platform that allows teams to 
	collaborate on projects simutaneously. By creating branches, people can edit and change code 
	before changing the actual project. If the changes are correct, the team member can then 
	push these changes for the rest of the team to see.
	*/

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
