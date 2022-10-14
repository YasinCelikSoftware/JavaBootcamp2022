package homework02.lesson43;



public class CustomerManager {

        private ICustomerDal customerDal;

        public CustomerManager(ICustomerDal customerDal){

            this.customerDal = customerDal;

        }

        public void add(){

            this.customerDal.add();

        }

}
