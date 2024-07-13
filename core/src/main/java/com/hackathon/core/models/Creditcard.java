package com.hackathon.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.adobe.cq.forms.core.components.util.AbstractFormComponentImpl;

@Model(adaptables = { SlingHttpServletRequest.class, Resource.class }, adapters = {
        ComponentExporter.class }, resourceType = "hackathon/components/adaptiveForm/CreditCard")
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class Creditcard extends AbstractFormComponentImpl {
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL, name = "jcr:title")
    protected String title;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL, name = "componentDescription")
    protected String componentDescription;
    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL, name = "creditCardLabel")
    protected String creditCardLabel;

    public String getTitle() {
        return title;
    }

    public String getComponentDescription() {
        return componentDescription;
    }

    public String getCreditCardLabel() {
        return creditCardLabel;
    }
}
