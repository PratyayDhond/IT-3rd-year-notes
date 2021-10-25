import java.util.Vector;

class Practical5A{

    public static void main(String[] args){

        Vector<String> list = new Vector<String>();
//        String list[] = new String[10];
        String items[] = {"Bread","Bread","Jam","Butter","Chips","Milk","Butter","Chips","Cookies","Bread","Donuts","Jam"};

        //copying items into the vector 'list'
        for(String a : items){
            list.add(a);
        }

        System.out.println("List with duplicate items");
        for(String a : list){
            System.out.println(a);
        }
        System.out.println();

        for(int i = 0;i<list.size()-1;i++){
            for(int j = i+1;j<list.size();){
                if(list.elementAt(i) == list.elementAt(j)){
                    list.remove(j);
                }else{
                    j++;
                }
            }
        }

        System.out.println("List after removing duplicates");
        for(String a : list){
            System.out.println(a);
        }



    }

}
