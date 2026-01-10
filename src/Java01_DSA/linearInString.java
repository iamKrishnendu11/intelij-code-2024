package Java01_DSA;

public class linearInString {
    public static void main(String[] args) {
        String name = "krishnendu";
        char key = 'u';
        System.out.println(search(name,key));
    }
    static boolean search(String str, char key){
        if (str.isEmpty()){ // str.length() ==0 replaced
            return false;
        }
        for(int i=0; i< str.length(); i++){
            if(key == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
