package serverCore;
import dataStructure.*;
import java.util.Scanner;

/**
 * Created by Kelvin Meyer on 2016/09/25.
 * MYRKEL002
 */
public class Request {
    private People user;
    private String ucode;
    private int requestType;
    //here is the valid thing
    private boolean valid;
    private String command;

    public Request(People user, String ucode, int requestType) {
        this.user = user;
        this.ucode = ucode;
        this.requestType = requestType;
        //todo sql get unqiue code and chech user is valid
        /// /this.accessCode = sql get this user code;
        // if not valid set user to error user....whatever that actually is.....
    }

    public Request(String s){
        //expected string : name%code%int req type%command
        Scanner inStringScanner = new Scanner(s).useDelimiter("%");
        this.user = new People(inStringScanner.next(),inStringScanner.next());
        this.requestType = inStringScanner.nextInt();
        this.command = inStringScanner.next();
        inStringScanner.close();
        if (!validateRequest(this.user)){
            //set user to null / error user
            //set req type to ServerProtocl.Error;
        }
        //get accesscode for validation
    }

    public People getUser() {
        return user;
    }

    public int getRequestType() {
        return requestType;
    }

    private boolean validateRequest(People user){
        //check user exisits or has init asses code
        //check codes match
        return true;
    }
}
