 public static void move(String str,String newstr,char find, int s, int e, int count) {
       
        //base condition
        if(s>e){
            System.out.print(newstr);
            for(int i=0;i<count;i++){
                System.out.print(find);
            }
            return;
        }

        char current=str.charAt(s);
        if(find==str.charAt(s)){
            count++;
            move(str, newstr, find, s+1, e, count);
        }
        else{
            newstr+=current;
            move(str,newstr, find, s+1, e, count);
        }
    }

    public static void main(String args[]) {
        String str = "axbscxftjheeexdxxe";
        char find='e';
        String newstr="";
        move(str,newstr, find, 0, str.length()-1, 0);
       
    }
}