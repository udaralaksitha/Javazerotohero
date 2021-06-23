package Java.practise;

public class Tutorial18 {
    public static void main(String[] args){
         //wrapper class = provides a way to use primitive data types as reference data types
          //               reference data types contains useful methods
           //              can be used with collections(ex:Arraylist)

            //primitive          Wrapper
            //--------------------------
            //boolean           Boolean
            //char              Character
            //int               Integer
            //double            Double


        //autoboxing = the automatic conversation that the java compiler makes between the
        //             primitive types and their corresponding object wrapper classes
        //unboxing =  the reverse of autoboxing .Automatic conversation of wrapper class to
        //             primitive

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bro";

        if(a==true){
            System.out.println("This is true");
        }

    }
}






