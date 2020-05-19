
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
 * InviteToApplyResponse<p>Response for the action of candidates Invite to Apply</p><p>Original complex type name from the Odata EDM: <b>InviteToApplyResponse</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class InviteToApplyResponse
    extends VdmComplex<InviteToApplyResponse>
{

    /**
     * Constraints: Nullable<p>Original property from the Odata EDM: <b>candidateId</b></p>
     * 
     * @param candidateId
     *     
     */
    @SerializedName("candidateId")
    @JsonProperty("candidateId")
    @Nullable
    @ODataField(odataName = "candidateId")
    private String candidateId;
    /**
     * Constraints: Nullable<p>Original property from the Odata EDM: <b>message</b></p>
     * 
     * @param message
     *     
     */
    @SerializedName("message")
    @JsonProperty("message")
    @Nullable
    @ODataField(odataName = "message")
    private String message;
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
     * {@inheritDoc}
     * 
     */
    @Nonnull
    @Override
    public Class<InviteToApplyResponse> getType() {
        return InviteToApplyResponse.class;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("candidateId", getCandidateId());
        values.put("message", getMessage());
        values.put("status", getStatus());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("candidateId")) {
                final Object value = values.remove("candidateId");
                if ((value == null)||(!value.equals(getCandidateId()))) {
                    setCandidateId(((String) value));
                }
            }
            if (values.containsKey("message")) {
                final Object value = values.remove("message");
                if ((value == null)||(!value.equals(getMessage()))) {
                    setMessage(((String) value));
                }
            }
            if (values.containsKey("status")) {
                final Object value = values.remove("status");
                if ((value == null)||(!value.equals(getStatus()))) {
                    setStatus(((String) value));
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
