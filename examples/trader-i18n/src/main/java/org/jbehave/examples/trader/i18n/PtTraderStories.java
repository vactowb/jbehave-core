package org.jbehave.examples.trader.i18n;

import java.util.Locale;

import org.jbehave.examples.trader.i18n.steps.PtTraderSteps;


public class PtTraderStories extends LocalizedTraderStories {
    
    @Override
    protected Locale locale(){
        return new Locale("pt");
    }

    @Override
    protected String storyPattern() {
        return "**/*.historia";
    }
 
    @Override
    protected Object traderSteps() {
        return new PtTraderSteps();
    }

}