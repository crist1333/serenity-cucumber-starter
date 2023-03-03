package starter.search;

import net.serenitybdd.screenplay.targets.Target;

public class SearchForm {
    public static Target TEXTLINK_SELECCIONAR_CATEGORIA = Target.the("search field").locatedBy("//*[@id=\"QuickLinks\"]/a[3]/img");
    public static Target TEXTLINK_SELECCIONAR_ANIMAL = Target.the("categoria field").locatedBy("//a[@href='/actions/Catalog.action?viewProduct=&productId=RP-LI-02']");
    public static Target BUTTON_AÑADIR_CARRITO = Target.the("categoria field").locatedBy("//a[@href='/actions/Cart.action?addItemToCart=&workingItemId=EST-13']");
    public static Target TITTLE_BY_CAR = Target.the("el titulo dl carrito de compras").locatedBy("//*[@id=\"Cart\"]");
    public static Target CLICK_SIGNIN = Target.the("titulo signin").locatedBy("//a[@href='/actions/Account.action?signonForm=']");
    public static Target REGISTER_NOW = Target.the("register now").locatedBy("//a[@href='/actions/Account.action?newAccountForm=']");
    public static Target USER = Target.the("user id").locatedBy("//*[@id=\"stripes-1128620325\"]");
}
