
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 3.15.1
 */

package com.sdk.test.vdm.namespaces.sfodataedmx;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperRead;
import com.sdk.test.vdm.namespaces.sfodataedmx.selectable.PicklistLabelSelectable;


/**
 * Fluent helper to fetch multiple {@link com.sdk.test.vdm.namespaces.sfodataedmx.PicklistLabel PicklistLabel} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class PicklistLabelFluentHelper
    extends FluentHelperRead<PicklistLabelFluentHelper, PicklistLabel, PicklistLabelSelectable>
{


    /**
     * Creates a fluent helper using the specified service path to send the read requests.
     * 
     * @param servicePath
     *     The service path to direct the read requests to.
     */
    public PicklistLabelFluentHelper(
        @Nonnull
        final String servicePath) {
        super(servicePath);
    }

    @Override
    @Nonnull
    protected Class<PicklistLabel> getEntityClass() {
        return PicklistLabel.class;
    }

}
