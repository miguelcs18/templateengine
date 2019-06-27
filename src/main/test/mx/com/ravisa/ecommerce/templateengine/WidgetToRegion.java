package mx.com.ravisa.ecommerce.templateengine;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WidgetToRegion {

    Map<String,String> regions= new HashMap<>();

    @Given("the next list of widgets enables of my site:")
    public void the_next_list_of_widgets_enables_of_my_site(List<String> widgets) {
        widgets.stream().forEach(widget -> {
            System.out.println(widget);
        });
    }

    @When("In my regions:")
    public void in_my_region_of_my_regions(Map<String,String> regions) {
        System.out.println(regions);
        this.regions.putAll(regions);
    }

    @Then("I register {string} on the {string} region so my regions is modified")
    public void i_register_it_and_my_regions_is_modified(String s, String s1) {
        this.regions.replace(s1,s);
        System.out.println("regions -> "+regions);
    }


}
