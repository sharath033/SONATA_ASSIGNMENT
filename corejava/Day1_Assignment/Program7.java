package Assignment;
//1)	Read the String and replace Ovals with dollar symbol program
public class Program7 {

	public static void main(String[] args) {
		
		char ch[]= {'h','a','p','p','y','b','i','r','t','h','d','a','y'};
        for (int i = 0; i < ch.length; i++)
        {
               if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'|| 
            		   ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
               {
                ch[i]='$'; //replacing $ in the place of vowels
               }   
               System.out.println(ch[i]);
        }
        
     
	}

}
