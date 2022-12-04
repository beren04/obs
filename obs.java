public class obs {
    public static void main(String[] args) {
        teacher t1 = new teacher("Beren","PHY","530");

        course fizikquiz = new course("PHYSICS","101","PHY");
        fizikquiz.addTeacher(t1);

        course fizikfinal = new course("PHYSICS","102","PHY");
        fizikfinal.addTeacher(t1);


       student s1 = new student("Zehra", "11", "2", fizikquiz,fizikfinal );
        s1.addBulkExamNote(78,56);
        s1.isPass();
        s1.printNote();

    }
}
