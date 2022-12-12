

public class TestPizzaShop
{
  public static void main(String[] args)
  {
    //Part 3a
    PizzaShop pizzaShop1 = new PizzaShop();
    
    //Part 3b
    Customer [] customers = pizzaShop1.getCustomers();    
    Pizza [] allPizzas = pizzaShop1.getPizzas();
    
    //create a new order
    Customer orderingCustomer1 = customers[1];
    Pizza [] orderedPizzas1 = new Pizza [2];
    orderedPizzas1[0] = allPizzas[1];
    orderedPizzas1[1] = allPizzas[1];
    pizzaShop1.addOrder(orderingCustomer1, orderedPizzas1);
    
    //create 2 more orders
    Customer orderingCustomer2 = customers[0];
    Pizza [] orderedPizzas2 = new Pizza[2];
    orderedPizzas2[0] = allPizzas[0];
    orderedPizzas2[1] = allPizzas[1];
    pizzaShop1.addOrder(orderingCustomer2, orderedPizzas2);
    
    Customer orderingCustomer3 = customers[2];
    Pizza [] orderedPizzas3 = new Pizza[3];
    orderedPizzas3[0] = allPizzas[0];
    orderedPizzas3[1] = allPizzas[1];
    orderedPizzas3[2] = allPizzas[2];
    pizzaShop1.addOrder(orderingCustomer3, orderedPizzas3);
    
    System.out.println(pizzaShop1.orderStatus());
    
  }

}
