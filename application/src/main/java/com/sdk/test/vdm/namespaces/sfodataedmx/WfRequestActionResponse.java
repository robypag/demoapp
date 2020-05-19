
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
 * <p>Original complex type name from the Odata EDM: <b>WfRequestActionResponse</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class WfRequestActionResponse
    extends VdmComplex<WfRequestActionResponse>
{

    /**
     * Constraints: Nullable<p>Original property from the Odata EDM: <b>status</b></p>
     * 
     * @param status
     *     
     */
    @SerializedName("status")
    @JsonProperty("status")
    @Nullable
    @ODataField(odataName = "status")
    private String status;
    /**
     * Constraints: Nullable<p>Original property from the Odata EDM: <b>wfRequestId</b></p>
     * 
     * @param wfRequestId
     *     
     */
    @SerializedName("wfRequestId")
    @JsonProperty("wfRequestId")
    @Nullable
    @ODataField(odataName = "wfRequestId")
    private Long wfRequestId;

    /**
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<WfRequestActionResponse> getType() {
        return WfRequestActionResponse.class;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("status", getStatus());
        values.put("wfRequestId", getWfRequestId());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("status")) {
                final Object value = values.remove("status");
                if ((value == null)||(!value.equals(getStatus()))) {
                    setStatus(((String) value));
                }
            }
            if (values.containsKey("wfRequestId")) {
                final Object value = values.remove("wfRequestId");
                if ((value == null)||(!value.equals(getWfRequestId()))) {
                    setWfRequestId(((Long) value));
                }
            }
        }
        // structured properties
        {
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
