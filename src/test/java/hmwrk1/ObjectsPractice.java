package hmwrk1;

import org.junit.jupiter.api.Test;

public class ObjectsPractice {
    @Test
    public void objectsPractice() {
        Book firstBook = new Book();
        firstBook.setAuthor("Paul Ekman");
        firstBook.setBookName("");
        firstBook.setType("Psychology");
        firstBook.setPageCount(272);

        Book secondBook = new Book();
        secondBook.setAuthor("Agatha Christie");
        secondBook.setBookName("Murder on the Orient Express");
        secondBook.setType("Detective");
        secondBook.setPageCount(236);

        Car firstCar = new Car();
        firstCar.setCarName("Seat Leon FR");
        firstCar.setWeight(1264);
        firstCar.setYear(2014);

        Car secondCar = new Car();
        secondCar.setCarName("Audi A3");
        secondCar.setWeight(1340);
        secondCar.setYear(1999);

        Course firstCourse = new Course();
        firstCourse.setCourseName("QA");
        firstCourse.setPrice(250);
        firstCourse.setBeginningDate("14.09.2022");

        Course secondCourse = new Course();
        secondCourse.setCourseName("Web Development");
        secondCourse.setPrice(750);
        secondCourse.setBeginningDate("25.10.2022");

        System.out.println("Favourite books");
        System.out.println(secondBook.getBookName());
        System.out.println(firstBook.getBookName());

        System.out.println("Oldest car");
        System.out.println(secondCar.getCarName());
        System.out.println(firstCar.getCarName());

        System.out.println("Courses need to finish");
        System.out.println(firstCourse.getCourseName());
        System.out.println(secondCourse.getCourseName());
    }
}
