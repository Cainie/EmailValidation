import com.sun.org.apache.xpath.internal.SourceTree;

public class Email {
//    jedna malpa
//    przed malpa musi byc min. jedna litera
//    po malpie musi byc min. jedna kropka
//    ale moze byc ich wiecej
//    przed i po kazdej kropce musi byc min. jedna litera
    static public void main (String [] args){
        String email = "karol.marszalik@gmail.com";
        char [] emailSplit = email.toCharArray();
        emailValidation validate = new emailValidation();
        System.out.println("The e-mail is " +validate.isThereAtSign(emailSplit));

    }
}
