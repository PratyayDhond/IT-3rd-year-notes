import java.util.*;
import java.io.*;

class Practical18{
    public static void main(String[] args){
        File input = new File("input.txt");
        File input2 = new File("input2.txt");
        File output = new File("output.txt");
        
            Vector<Integer> product = new Vector<Integer>();

        try{

            FileReader reader = new FileReader(input);
            Vector<Integer> v1 = new Vector<Integer>();
            Vector<Integer> v2 = new Vector<Integer>();
            int ch;
            int temp;
            while((temp = reader.read()) != -1){
                v1.add(temp);
            }
            reader.close();
            reader = new FileReader(input2);
            while((temp = reader.read()) != -1){
                v2.add(temp);
            }
            reader.close();

            int n = v1.size() > v2.size() ? v2.size() : v1.size();

            for(int i = 0; i < n; i++){
                product.add(v1.elementAt(i) * v2.elementAt(i));
            }

            if(v1.size() != v2.size()){
                if(v1.size() > v2.size()){
                    int l = v1.size() - n;
                    for(int i = n; i < l; i++){
                        product.add(v1.elementAt(i));
                    }
                }else{
                    int l = v2.size()-n;
                    for(int i = n; i < l; i++){
                        product.add(v2.elementAt(i));
                    }
                }
            }
        }catch(EOFException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }

        try(FileWriter writer = new FileWriter("output.txt")) {
        for( int i=0; i<product.size(); ++i) {
            writer.write(product.elementAt(i)+" ");
        }
        writer.close();
        System.out.println("Success... Data copied to file successfully");
    }
    catch (Exception e ) {
        System.out.println(e);
    }

    }
}
