package trail;

public class CountConsucativeAplha {
    public static String myFun(String str){
        StringBuilder stringBuilder = new StringBuilder();
        char currentChar = str.charAt(0);
        int count = 1;

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==currentChar){
                count++;
            }
            else{
                stringBuilder.append(count).append(currentChar);
                currentChar = str.charAt(i);
                count=1;
            }
        }
        stringBuilder.append(count).append(currentChar);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
       String a = "aabcccaa";
       System.out.println(myFun(a));
    }
}


//input: aabccaa; output: 2a1b2c2a
//
// idea--- map(char,Integer) = char is new and last character is not same as this char , I will put a new key and add
// aabccaa -> 97,97,98,99,99,97,97