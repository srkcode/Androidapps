package example.srk.currencyapp.helpers;

import org.json.JSONObject;

import example.srk.currencyapp.Constants;
import example.srk.currencyapp.value_objects.Currency;


public class CurrencyParserHelper {

    public static Currency parseCurrency(JSONObject obj, String currencyName) {
        Currency currency = new Currency();
        currency.setBase(obj.optString(Constants.BASE));
        currency.setDate(obj.optString(Constants.DATE));
        JSONObject rateObject = obj.optJSONObject(Constants.RATES);
        if(rateObject != null) {
            currency.setRate(rateObject.optDouble(currencyName));
        }
        currency.setName(currencyName);
        return currency;
    }
}