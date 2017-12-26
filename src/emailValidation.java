import java.util.regex.Pattern;

public class emailValidation {

    public int atPosition=0, dotPosition=0;
    public boolean isValid = false;

    public boolean isThereAtSign(char[] email){
       for(int i=0;i<email.length-1;i++){
           if(email[i]=='@'){
               atPosition=i;
               return isThereALetterBeforeAtSing(email);
           }
       }
       return isValid;
    }
    public boolean isThereALetterBeforeAtSing (char [] email){
       for (int i=0;i<atPosition;i++){
           if(Character.isLetter(email[i])){
                return isThereADotAfterAtSign(email);
           }
       }
       return isValid;
    }
    public boolean isThereADotAfterAtSign (char[] email){
        for (int i=email.length-1;i>atPosition;i--) {
            if (email[i] == '.') {
                dotPosition = i;
                return isThereALetterBeforeADot(email);
            }
        }return isValid;
    }
    public boolean isThereALetterBeforeADot (char[]email){
        if(Character.isLetter(email[dotPosition-1]))
            return isThereALetterAfterADot(email);
        else return isValid;
    }
    public boolean isThereALetterAfterADot (char[] email){
        if(Character.isLetter(email[dotPosition+1]))
            return isValid=true;
        else return isValid;
    }
}
