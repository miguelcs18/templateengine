package mx.com.ravisa.ecommerce.templateengine;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class PagesToSite {

    List<String> pagesTotal = new ArrayList<>();

    @Given("the next list of pages on the site:")
    public void the_next_list_of_pages_on_the_site(List<String> pages) {
        pages.stream().forEach(page -> {
            System.out.println(page);
        });
        pagesTotal.addAll(pages);
    }

    @When("I want to register {string} page")
    public void i_want_to_register_page(String string) {
        pagesTotal.add(string);
    }

    @Then("The page is register on the site")
    public void the_page_is_register_on_the_site() {
        pagesTotal.stream().forEach(page -> {
            System.out.println(page);
        });
    }
}
