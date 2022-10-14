package homework01;

public class YoutubeEducation {
    public static void main(String[] args) {
        /*int number1 = 10;
        int number2 = 20;
        number1 = number2;
        number2 = 100;

        System.out.println(number1);

        int[] numbers1 = {1,2,3};
        int[] numbers2 = {10,20,30};
        numbers1 = numbers2;
        numbers2[0] = 1000;

        System.out.println(numbers1[0]);

        CreditManager creditManager = new CreditManager();
        creditManager.calculate();
        creditManager.save();

        Customer customer = new Customer();
        customer.id = 1;
        customer.city = "Istanbul";

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.id = 2;
        corporateCustomer.taxNumber = "123456";
        corporateCustomer.companyName = "Arçelik";
        corporateCustomer.city = "Ankara";

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.nationalIdentity = "12345678901";

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.save();
        customerManager.delete();

        CustomerManager customerManager1 = new CustomerManager(new IndividualCustomer());

        Customer c1 = new Customer();
        Customer c2 = new IndividualCustomer();
        Customer c3 = new CorporateCustomer();*/

        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
        customerManager.giveCredit();

        TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
        teacherCreditManager.save();



    }
}


