package mx.com.ravisa.ecommerce.templateengine;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SitePages {


    Map<String, List<String>> listPagesSite = new HashMap<>();
    List<String> pages= new ArrayList<>();
    String siteRequest;


    @Given("The site {string} has list of pages")
    public void the_site_and_given_the_next_list_of_pages(String string, List<String> pages) {
        siteRequest = string;
        listPagesSite.put(string,pages);
    }

    @When("I request {string}")
    public void i_request(String string) {
        pages.addAll(listPagesSite.get(siteRequest));
    }

    @Then("I print all pages of my site")
    public void i_print_all_pages_of_my_site() {
        for (String page:pages) {
            System.out.println(page);
        }
    }

}
