package DataObject;

import com.github.javafaker.Faker;

public interface LogInData {
   Faker faker = new Faker();
    public String

       CorrectEmail = "lizitester01@gmail.com",

        IncorrectEmail = "lizitester01gmail.com",
        EmailWithoutPoint = "lizitester01@gmailcom",
        Emailwithoutcom = "lizitester01@gmail.",

        NonRegistrationEmail = faker.bothify("???##@gmail.com"),

       EmptyFieldEmail = "",
       CorrectPassword = "123456",
       IncorrectPassword = "654321",

       EmptyPasswordField = "";

}
