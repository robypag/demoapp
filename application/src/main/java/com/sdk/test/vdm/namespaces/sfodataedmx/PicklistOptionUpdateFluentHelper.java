
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 3.15.1
 */

package com.sdk.test.vdm.namespaces.sfodataedmx;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperUpdate;


/**
 * Fluent helper to update an existing {@link com.sdk.test.vdm.namespaces.sfodataedmx.PicklistOption PicklistOption} entity and save it to the S/4HANA system.<p>
 * To perform execution, call the {@link #execute execute} method on the fluent helper object.
 * 
 */
public class PicklistOptionUpdateFluentHelper
    extends FluentHelperUpdate<PicklistOptionUpdateFluentHelper, PicklistOption>
{

    /**
     * {@link com.sdk.test.vdm.namespaces.sfodataedmx.PicklistOption PicklistOption} entity object that will be updated in the S/4HANA system.
     * 
     */
    private final PicklistOption entity;

    /**
     * Creates a fluent helper object that will update a {@link com.sdk.test.vdm.namespaces.sfodataedmx.PicklistOption PicklistOption} entity on the OData endpoint. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The PicklistOption to take the updated values from.
     */
    public PicklistOptionUpdateFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final PicklistOption entity) {
        super(servicePath);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected PicklistOption getEntity() {
        return entity;
    }

}