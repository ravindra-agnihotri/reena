package abstraction;

abstract class Prof {

    /**
     * summary page can have only headings or some small story
     *  abstract methods are by default public static
     */

    final String markesheet="pass";

    abstract void viva();

    abstract void assignment();

      void attendance(){
        System.out.println("take attendance of all students");
    }

      void teaching(){
        System.out.println("engineering physics");
    }
}
