 private static void lowerCase(String s){
        String str="";
        for(int i=0;i<s.length();i++){
            str+=(char)(s.charAt(i)+32);
        }


        System.out.println(str);


    }