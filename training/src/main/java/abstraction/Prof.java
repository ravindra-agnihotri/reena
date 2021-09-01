package abstraction;

abstract class Prof {

    /**
     * summary page can have only headings or some small story
     */


    abstract void viva();

    abstract void assignment();

    public static void attendance(){
        System.out.println("take attendance of all students");
    }

    public static void teaching(){
        System.out.println("engineering physics");
    }
}
