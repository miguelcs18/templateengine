package mx.com.ravisa.ecommerce.templateengine;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class WidgetRegister {

    List<String> widgets= new ArrayList<>();

    @Given("the next list of widgets on the site:")
    public void the_next_list_of_widgets_on_the_site(List<String> widgets) {
        System.out.println("This is initial List of widgets");
        widgets.stream().forEach(widget -> {
            System.out.println(widget);
        });
        this.widgets.addAll(widgets);

    }

    @When("I want to register {string} widget")
    public void i_want_to_register_widget(String string) {
    this.widgets.add(string);
    }

    @Then("The widget is register on the list of widgets")
    public void the_widget_is_register_on_the_list_of_widgets() {
        System.out.println("This is final List of widgets");
        widgets.stream().forEach(widget -> {
            System.out.println(widget);
        });
    }

}
