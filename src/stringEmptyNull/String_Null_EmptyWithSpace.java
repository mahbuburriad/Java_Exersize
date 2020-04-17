package stringEmptyNull;

public class String_Null_EmptyWithSpace {
    public static boolean isNullOrEmpty(String string){
        if (string != null && !string.trim().isEmpty()){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        //take string as null and empty
        String string1 = null;
        String string2 = "";

        if (isNullOrEmpty(string1)){
            System.out.println("String1 is null or Empty");
        } else {
            System.out.println("String1 is not null or Empty");
        }

        if (isNullOrEmpty(string2)){
            System.out.println("String2 is null or Empty");
        } else {
            System.out.println("Sting2 is not null or Empty");
        }


    }
}
