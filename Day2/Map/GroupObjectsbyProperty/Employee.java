package Day2.Map.GroupObjectsbyProperty;

class Employee {
   String name;
   String department;


   public Employee(String name, String department) {
       this.name = name;
       this.department = department;
   }


   @Override
   public String toString() {
       return name;
   }
}


