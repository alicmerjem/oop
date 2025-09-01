# Singleton Design Pattern

**Purpose:** Ensure only **one instance** of a class exists.

**Key Points:**
- Private constructor
- Private static instance
- Public static method to get the instance

**Example:**
```java
class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public static Singleton getInstance() {
        if(instance == null) instance = new Singleton();
        return instance;
    }
}


---

### 2. **Builder.md**
```markdown
# Builder Design Pattern

**Purpose:** Simplifies creation of **complex objects** with optional parameters.

**Key Points:**
- Inner static `Builder` class
- Methods for each optional field returning `this`
- `build()` method returns the object

**Example:**
```java
class Computer {
    private String cpu, ram;
    private int storage;
    private Computer(Builder b) { cpu=b.cpu; ram=b.ram; storage=b.storage; }

    static class Builder {
        private String cpu, ram;
        private int storage;
        Builder(String cpu) { this.cpu = cpu; }
        Builder setRam(String ram) { this.ram = ram; return this; }
        Builder setStorage(int s) { storage = s; return this; }
        Computer build() { return new Computer(this); }
    }
}



---

### 3. **Factory.md**
```markdown
# Factory Design Pattern

**Purpose:** Create objects **without exposing the instantiation logic**.

**Key Points:**
- Interface or abstract class for products
- Concrete implementations
- Factory class returns appropriate object

**Example:**
```java
interface Payment { void pay(int amount); }

class CreditCardPayment implements Payment { 
    public void pay(int amount) { /* ... */ } 
}

class PayPalPayment implements Payment { 
    public void pay(int amount) { /* ... */ } 
}

class PaymentFactory {
    public Payment getPayment(String type) {
        if(type.equalsIgnoreCase("creditcard")) return new CreditCardPayment();
        else if(type.equalsIgnoreCase("paypal")) return new PayPalPayment();
        return null;
    }
}



---

### 4. **Adapter.md**
```markdown
# Adapter Design Pattern

**Purpose:** Allows incompatible interfaces to work together.

**Key Points:**
- Adapter implements target interface
- Adapter has reference to the class being adapted

**Example:**
```java
interface MediaPlayer { void play(String audioType, String fileName); }

class Mp4Player { 
    void playMp4(String fileName) { /* ... */ } 
}

class MediaAdapter implements MediaPlayer {
    Mp4Player mp4;
    MediaAdapter() { mp4 = new Mp4Player(); }
    public void play(String type, String file) { mp4.playMp4(file); }
}



---

### 5. **State.md**
```markdown
# State Design Pattern

**Purpose:** Allow object behavior to **change based on its state**.

**Key Points:**
- State interface
- Concrete state classes
- Context class maintains current state and delegates behavior

**Example:**
```java
interface State { void handle(TrafficLight light); }

class Red implements State { 
    public void handle(TrafficLight l){ l.setState(new Green()); } 
}

class Green implements State { 
    public void handle(TrafficLight l){ l.setState(new Yellow()); } 
}

class Yellow implements State { 
    public void handle(TrafficLight l){ l.setState(new Red()); } 
}

class TrafficLight { 
    private State state = new Red(); 
    public void setState(State s){ state = s; } 
    public void change(){ state.handle(this); } 
}


# Strategy Design Pattern

**Purpose:** Define a family of algorithms, encapsulate each one, and make them interchangeable. The strategy lets the algorithm vary independently from clients that use it.

**Key Points:**
- Strategy interface
- Concrete strategy classes
- Context class holds a reference to a strategy and delegates behavior

**Example:**
```java
// Strategy interface
interface PaymentStrategy {
    void pay(int amount);
}

// Concrete strategies
class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) { 
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class PayPalPayment implements PaymentStrategy {
    public void pay(int amount) { 
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

// Context
class ShoppingCart {
    private PaymentStrategy strategy;
    public void setPaymentStrategy(PaymentStrategy s) { strategy = s; }
    public void checkout(int amount) { strategy.pay(amount); }
}

// Usage
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(100);

        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(200);
    }
}
