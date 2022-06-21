package Reflection.Field.Get_Field;


import java.lang.reflect.Field;

// https://www.udemy.com/course/java-reflection-master-class/learn/lecture/21298174#questions/14140168     1:07


/*                                  Get Field object of a class


    ○ Class.getDeclaredFields()

                  * get an array with all declared fields of a class

                            - includes all the fields regardless of their access modifiers

                            - but excludes any inherited fields

    ○ Class.getFields()

                 * get all the public fields of a class

                 * including the fields the class inherited from its superclasses

    ○   if we know the declared field name:

                  * Class.getDeclaredField(fieldName)

                        - all declared fields

                  * Class.getField(fieldName)

                        -all public included public inherited fields

                 * get the Field object corresponding to the declared field with the given name

    ○ If a field with the given name

                 * does not exist

         we would get the NoSuchFieldException

                 * so we need to be very careful not to MISTYPE the name

                 * and make sure that we call the RIGHT METHOD among those two.


                                             Get Field value


     ○ Field field = Movie.class.getDeclaredField(filedName);

               * Object value = field.get(movie))

               * get value for static field

                         -  minPriceStaticField.get(null)
 */

public class Get_Field {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {

       Field isReleased = Movie.class.getDeclaredField("isReleased");
       System.out.println(isReleased.getType());

        Movie movie = new Movie("Lord of the Rings",
                2001,
                12.99,
                true,
                Category.ADVENTURE);


        printDeclaredFieldsInfo(Category.class, movie);

        Field minPriceStaticField = Movie.class.getDeclaredField("MINIMUM_PRICE");


        //get value for static field
        System.out.println(String.format("static MINIMUM_PRICE value :%f", minPriceStaticField.get(null)));
    }

    public static <T> void printDeclaredFieldsInfo(Class<? extends T> clazz, T instance) throws IllegalAccessException {
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println(String.format("Field name : %s type : %s",
                    field.getName(),
                    field.getType().getName()));

            System.out.println(String.format("Is synthetic field : %s", field.isSynthetic()));
            System.out.println(String.format("Field value is : %s", field.get(instance)));

            System.out.println();
        }
    }

    public enum Category {
        ADVENTURE,
        ACTION,
        COMEDY
    }

    public static class Movie extends Product {
        public static final double MINIMUM_PRICE = 10.99;

        private boolean isReleased;
        private Category category;
        private double actualPrice;

        public Movie(String name, int year, double price, boolean isReleased, Category category) {
            super(name, year);
            this.isReleased = isReleased;
            this.category = category;
            this.actualPrice = Math.max(price, MINIMUM_PRICE);
        }

        // Nested class
        public class MovieStats {
            private double timesWatched;

            public MovieStats(double timesWatched) {
                this.timesWatched = timesWatched;
            }

            public double getRevenue() {
                return timesWatched * actualPrice;
            }
        }
    }

    // Superclass
    public static class Product {
        protected String name;
        protected int year;
        protected double actualPrice;

        public Product(String name, int year) {
            this.name = name;
            this.year = year;
        }
    }
}

