package starter.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class LookForInformation {
	
	
	
	
    public static Performable categoria( ) {
        return Task.where("doy click en categoria",Click.on(SearchForm.TEXTLINK_SELECCIONAR_CATEGORIA)
                
        );
    }
    
    public static Performable animal() {
        return Task.where("seleccionar animal",Click.on(SearchForm.TEXTLINK_SELECCIONAR_ANIMAL)
        );
    }
    
    public static Performable anadirCarrito() {
        return Task.where("añadir carrito",Click.on(SearchForm.BUTTON_ANADIR_CARRITO)
        );
    }
    
    public static Performable signIn() {
        return Task.where("click sigIn",Click.on(SearchForm.CLICK_SIGNIN)
        );
    }
    
    public static Performable register() {
        return Task.where("click register now",Click.on(SearchForm.REGISTER_NOW)
        );
    }
    public static Performable UserId() {
        return Task.where("text user ID",Click.on(SearchForm.USER_ID)
        );
    }
}
