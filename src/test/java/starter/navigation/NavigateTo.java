package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theWikipediaHomePage() {
        return Task.where("{0} opens the Wikipedia home page",
                Open.browserOn().the(petStorePage.class));
    }
    
    public static Performable thePetStorePage() {
        return Task.where("{0} pet store",
                Open.browserOn().the(petStorePage.class));
    }
}
