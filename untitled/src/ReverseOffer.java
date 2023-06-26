public class ReverseOffer {

    public static void main(String[] args) {
        ReverseOffer main = new ReverseOffer();
        String result = main.reverseWords("the sky is blue");
        System.out.print(result);
    }
    public String reverseWords(String str) {
        if(str == null || str.length() == 0) return str;
        StringBuilder sb = new StringBuilder();
        char[] array = str.toCharArray();
        int end = -1, i;
        for(i=array.length-1; i>=0; i--){
            if(array[i] == ' '){
                if(end != -1){
                    write(array, i+1, end, sb);
                    end = -1;
                }
            }
            else {
                if(end == -1) end = i;
            }
        }
        if(end != -1){
            write(array, 0, end, sb);
        }

        return sb.length() > 0 ? sb.substring(0, sb.length()-1).toString() : "";
    }

    public void write(char[] array, int start, int end, StringBuilder sb){
        while(start<=end){
            sb.append(String.valueOf(array[start++]));
        }
        sb.append(" ");
    }
}