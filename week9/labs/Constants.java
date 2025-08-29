package week9.labs;

class Constants {
   public static final int MAX_LIMIT = 100;
   
   public final void displayMessage() {
    System.out.println("this is final and is immutable");
   }
}

class SubClass extends Constants {
    // Uncommenting this will cause a compiler error:
    /*
    @Override
    public void displayMessage() {
        System.out.println("Trying to override... but this will fail!");
    }
    */    
}

class FinalDemo {
    public static void main(String[] args) {
        System.out.println("max limit is: " + Constants.MAX_LIMIT);

        // demonstrating final method
        SubClass obj = new SubClass();
        obj.displayMessage();
    }
}
