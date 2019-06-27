package mx.com.ravisa.ecommerce.templateengine;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Map;

public class PageLayout {

    String page= new String();
    Map<String,String> layouts;
    String layoutChoosed;

    @Given("My page {string} and can I choose someone of the next list of Layout to add to my page:")
    public void my_page_and_can_I_choose_someone_of_the_next_list_of_Layout_to_add_to_my_page(String string, Map<String,String> layouts) {
        page = string;
        this.layouts = layouts;
    }

    @When("I choose the {string} Layout")
    public void i_choose_the_Layout(String string) {
                layoutChoosed = layouts.get(string);
    }

    @Then("The layout is added to my page {string}")
    public void the_layout_is_added_to_my_page(String string) {

        System.out.println("My page " + string +" has the layout :" + layoutChoosed);

    }

}
