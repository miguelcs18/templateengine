package mx.com.ravisa.ecommerce.templateengine;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mx.com.ravisa.ecommerce.templateengine.model.Site;

public class CreateSite {

    Site site;

    @Given("the platform to create a new site")
    public void the_platform_to_create_a_new_site() {
        site = new Site();
    }

    @When("I create a new site called {string}")
    public void i_create_a_new_site_called(String string) {
        this.site.setSiteName(string);
        this.site.setSiteStatus(true);
    }

    @Then("I will have my site information")
    public void i_will_have_my_site_information() {
      System.out.println(site);
    }

}
