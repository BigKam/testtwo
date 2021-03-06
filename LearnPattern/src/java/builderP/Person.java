package builderP;

public class Person
{
   private final FullName name;
   private final Address address;
   private final Gender gender;
   private final EmploymentStatus employment;
   private final HomeownerStatus homeOwnerStatus;
 

   private Person(
      final FullName newName, final Address newAddress,
      final Gender newGender, final EmploymentStatus newEmployment,
      final HomeownerStatus newHomeOwner)
   {
      this.name = newName;
      this.address = newAddress;
      this.gender = newGender;
      this.employment = newEmployment;
      this.homeOwnerStatus = newHomeOwner;
   }
 
   public FullName getName()
   {
      return this.name;
   }
 
   public Address getAddress()
   {
      return this.address;
   }
 
   public Gender getGender()
   {
      return this.gender;
   }
 
   public EmploymentStatus getEmployment()
   {
      return this.employment;
   }
 
   public HomeownerStatus getHomeOwnerStatus()
   {
      return this.homeOwnerStatus;
   }
 

   public static class PersonBuilder
   {
      private FullName nestedName;
      private Address nestedAddress;
      private Gender nestedGender;
      private EmploymentStatus nestedEmploymentStatus;
      private HomeownerStatus nestedHomeOwnerStatus;
 
      public PersonBuilder(
         final FullName newFullName,
         final Address newAddress) 
      {
         this.nestedName = newFullName;
         this.nestedAddress = newAddress;
      }
 
      public PersonBuilder name(final FullName newName)
      {
         this.nestedName = newName;
         return this;
      }
 
      public PersonBuilder address(final Address newAddress)
      {
         this.nestedAddress = newAddress;
         return this;
      }
 
      public PersonBuilder gender(final Gender newGender)
      {
         this.nestedGender = newGender;
         return this;
      }
 
      public PersonBuilder employment(final EmploymentStatus newEmploymentStatus)
      {
         this.nestedEmploymentStatus = newEmploymentStatus;
         return this;
      }
 
      public PersonBuilder homeOwner(final HomeownerStatus newHomeOwnerStatus)
      {
         this.nestedHomeOwnerStatus = newHomeOwnerStatus;
         return this;
      }
 
      public Person createPerson()
      {
         return new Person(
            nestedName, nestedAddress, nestedGender,
            nestedEmploymentStatus, nestedHomeOwnerStatus);
      }
   }
}
