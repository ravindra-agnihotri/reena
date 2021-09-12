package polymorphism;

public class MethodOverloading {
    /**
     * having method with same name and different parameters in same class
     * @param username
     * @param password
     */
  public static void linkedLogin(String username, String password){
      System.out.println("logged in using "+username +" and" +password);
  }

  public static void linkedLogin(int gmailsessionID){
      System.out.println("logged in using "+gmailsessionID);
  }

    public static void linkedLogin(boolean facebook){
        System.out.println("logged in using "+facebook);

    }


}
