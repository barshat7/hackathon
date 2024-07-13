
        (function(document) {

            "use strict";
            class CreditCard extends FormView.FormFieldBase {

            static NS = FormView.Constants.NS;
            static IS = "CreditCard";
            static bemBlock = "CreditCard";

            static selectors  = {
                self: "[data-" + this.NS + '-is="' + this.IS + '"]'
            };
        }

            FormView.Utils.setupField(({element, formContainer}) => {
                return new CreditCard({element, formContainer})
            }, CreditCard.selectors.self);
        })();
    
