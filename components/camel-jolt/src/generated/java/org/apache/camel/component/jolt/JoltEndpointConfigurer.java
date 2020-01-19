/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jolt;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class JoltEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        JoltEndpoint target = (JoltEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "contentcache":
        case "contentCache": target.setContentCache(property(camelContext, boolean.class, value)); return true;
        case "inputtype":
        case "inputType": target.setInputType(property(camelContext, org.apache.camel.component.jolt.JoltInputOutputType.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "outputtype":
        case "outputType": target.setOutputType(property(camelContext, org.apache.camel.component.jolt.JoltInputOutputType.class, value)); return true;
        case "transformdsl":
        case "transformDsl": target.setTransformDsl(property(camelContext, org.apache.camel.component.jolt.JoltTransformType.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}
