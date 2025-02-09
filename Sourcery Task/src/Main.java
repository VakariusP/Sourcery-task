public class Main {
    public static void main(String[] args) {
        String[] inputval={"slkp","aaannnddd","lllsssoooooxxxxx",""};
        String[] compval=new String[inputval.length];
        String[] decompval=new String[compval.length];

        for(int i=0;i<inputval.length;i++){
            if(inputval[i].isEmpty()){
                compval[i]="";
                System.out.println(compval[i]);
                continue;
            }
            compval[i]=CompressString(inputval[i]);
            System.out.println(compval[i]);
        }
        for(int i=0;i<=inputval.length-1;i++){
            if(inputval[i].isEmpty()) {
                decompval[i]="";
                System.out.println(decompval[i]);
                continue;
            }
            decompval[i]=DecompressString(compval[i]);
            System.out.println(decompval[i]);
        }
    }

    public static String CompressString(String text){
        StringBuilder compressed=new StringBuilder();
        char ch;
        /*
        To compress the string the first character is used to look for identical ones until another character appears.
        To identify the amount of identical characters a counter is used that is reset for every unique character.
        The counter starts at 1 since there is always at least 1 of the characters.
        The loop skips the identical values by changing the loop variable by the amount of times a character was repeated.
         */
        for(int i=0;i<text.length();i++){
            ch =text.charAt(i);
            compressed.append(ch);
            int ammount=1;
            for(int j=i+1;j<text.length();j++){
                if(text.charAt(i)==text.charAt(j)){
                    ammount = ammount+1;
                }
                else{
                    break;
                }
            }
            i+=ammount-1;
            compressed.append(ammount);
        }
        return compressed.toString();
    }

    public static String DecompressString(String comptext){
        StringBuilder decompressed=new StringBuilder();
        char ch;
        char num;
        int amount;
        /*
        The decompression process is simple since first goes the character that is compressed.
        In the next position is the amount of times the char value should be repeated to receive the full string.
        So in the cycle the initial character is added a specific number of times to the string to receive the decompressed string.
        That is why the for loop interval goes by 2 since it would skip to the next pair of data.
         */
        for (int i=0;i<comptext.length();i+=2){
            ch=comptext.charAt(i);
            num=comptext.charAt(i+1);
            amount=Integer.parseInt(String.valueOf(num));
            decompressed.repeat(ch,amount);
        }
        return decompressed.toString();
    }
}