package com.homecentertraining.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
	
    public static Performable theHomecenterHomePage() {
        return Task.where("{} opens the Homecenter home page",
                Open.browserOn().the(HomecenterHomePage.class)
        );
    }
}
