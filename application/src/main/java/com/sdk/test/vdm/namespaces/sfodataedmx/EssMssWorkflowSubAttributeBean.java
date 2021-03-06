
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 3.15.1
 */

package com.sdk.test.vdm.namespaces.sfodataedmx;

import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmComplex;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * <p>Original complex type name from the Odata EDM: <b>EssMssWorkflowSubAttributeBean</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class EssMssWorkflowSubAttributeBean
    extends VdmComplex<EssMssWorkflowSubAttributeBean>
{

    /**
     * Constraints: Nullable<p>Original property from the Odata EDM: <b>changeSet</b></p>
     * 
     * @param changeSet
     *     
     */
    @SerializedName("changeSet")
    @JsonProperty("changeSet")
    @Nullable
    @ODataField(odataName = "changeSet")
    private EssMssWorkflowAttributeBean changeSet;
    /**
     * Constraints: Nullable<p>Original property from the Odata EDM: <b>changeSetGroupSubTitle</b></p>
     * 
     * @param changeSetGroupSubTitle
     *     
     */
    @SerializedName("changeSetGroupSubTitle")
    @JsonProperty("changeSetGroupSubTitle")
    @Nullable
    @ODataField(odataName = "changeSetGroupSubTitle")
    private String changeSetGroupSubTitle;

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<EssMssWorkflowSubAttributeBean> getType() {
        return EssMssWorkflowSubAttributeBean.class;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("changeSet", getChangeSet());
        values.put("changeSetGroupSubTitle", getChangeSetGroupSubTitle());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("changeSetGroupSubTitle")) {
                final Object value = values.remove("changeSetGroupSubTitle");
                if ((value == null)||(!value.equals(getChangeSetGroupSubTitle()))) {
                    setChangeSetGroupSubTitle(((String) value));
                }
            }
        }
        // structured properties
        {
            if (values.containsKey("changeSet")) {
                final Object value = values.remove("changeSet");
                if (value instanceof Map) {
                    if (getChangeSet() == null) {
                        setChangeSet(new EssMssWorkflowAttributeBean());
                    }
                    @SuppressWarnings("unchecked")
                    final Map<String, Object> inputMap = ((Map<String, Object> ) value);
                    getChangeSet().fromMap(inputMap);
                }
                if ((value == null)&&(getChangeSet()!= null)) {
                    setChangeSet(null);
                }
            }
        }
        // navigation properties
        {
        }
        super.fromMap(values);
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        return result;
    }

}
