package DataObject;

import com.github.javafaker.Faker;

import static DataObject.LogInDate.faker;

public interface ResetPassword {
    Faker faiker = new Faker();
    public String
      Correctemail = "lizitester01@gmail.com",
      NoRegistrationEmail = faker.bothify("???##@gmail.com"),

      InvalidEmail = "mariam.avlokhashviligmail.com",
      Emptyemailfield = "";

}
