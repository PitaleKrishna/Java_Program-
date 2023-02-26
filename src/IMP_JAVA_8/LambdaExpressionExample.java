package IMP_JAVA_8;

public class LambdaExpressionExample {
	
    public static void main(String[] args) {  
        int width=10;  
  
        //without lambda, Drawable implementation using anonymous class  
//        Drawable d=new Drawable(){  
//            public void draw(){System.out.println("Drawing "+width);}  
//        };  
//        d.draw();  
   
        Drawable d=()->{
        	System.out.println(width);
        };
        d.draw();
    
    }  
        
        

}
