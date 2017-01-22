import java.util.Random;
 
public class MakeData {
        static Random r = new Random();
        
        public static void main(String[] args) {
        	int len = 8;
        	MakeData m = new MakeData();
            int count = Integer.parseInt(args[0]);            
            m.genData(count, len);   
            
        }
        
        public void genData(int count, int len) {
            for(int i = 1; i <= count; i++ ) {
            	progress(i, count);
                System.out.printf("%d,%s\n",i, genString(8));
            }
        }      	
        
 
        public String genString(int len) {
                StringBuffer sb = new StringBuffer();
                for ( int i = 0; i < len; i++) {
                        sb.append((char)(r.nextInt(24) + 'a'));
                }
                return sb.toString();
        }
        
       public void progress(int cur, int tot) {
    	   if (tot < 10) 
    		   return;    		 
    	   else if (cur  == tot - 1 )
    		   System.err.println("\nJob Finished");
    	   else if (cur % (tot / 10) == 0) {
    		   System.err.print("*");
    	   }
       }
} 
