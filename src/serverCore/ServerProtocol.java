package serverCore;

/**
 * Created by Kelvin Meyer on 2016/09/25.
 * MYRKEL002
 */
public class ServerProtocol {
    //constant int types
    public static final int ERROR = -1;
    public static final int NEW_USER = 0;
    public static final int GET_EVENT = 1;
    public static final int GET_EVENT_PEOPLE = 2;
    public static final int GET_USER = 3;

    private Request request;

    public ServerProtocol(Request r) {
        this.request = r;
    }

    public ServerProtocol(String s) {
        this.request = new Request(s);
    }

    public String processRequest(){
      switch(request.getRequestType()){
          case NEW_USER:

              break;
          case GET_EVENT:

              break;
          case GET_EVENT_PEOPLE:

              break;
          case GET_USER:

              break;
          case ERROR:

              break;
      }
      return "ERROR";
    }
}
