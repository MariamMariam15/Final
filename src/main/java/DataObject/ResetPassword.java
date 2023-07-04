package DataObject;

import com.github.javafaker.Faker;

import static DataObject.LogInData.faker;

public interface ResetPassword {
    Faker faiker = new Faker();
    public String
      CorrectEmail = "lizitester01@gmail.com",
      NoRegistrationEmail = faker.bothify("???##@gmail.com"),

      InvalidEmail = "mariam.avlokhashviligmail.com",
      EmptyEmailField = "";

}
