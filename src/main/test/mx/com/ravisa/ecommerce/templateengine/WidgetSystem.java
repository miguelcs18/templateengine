package mx.com.ravisa.ecommerce.templateengine;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class WidgetSystem {

    List<String> widgets = new ArrayList<>();

    @Given("the next list of widgets:")
    public void the_next_list_of_widgets(List<String> widgets) {
        this.widgets = widgets;
    }

    @When("I want to print all list of widgets")
    public void i_want_to_get_all_list_of_products() {
        for (String  s:widgets) {
            System.out.println(s);
        }
    }

    @Then("I have {int} widgets")
    public void i_have_widgets(Integer int1) {
        int1 = widgets.size();
    }


}
