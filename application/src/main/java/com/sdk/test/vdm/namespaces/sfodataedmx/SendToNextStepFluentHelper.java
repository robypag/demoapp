
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 3.15.1
 */

package com.sdk.test.vdm.namespaces.sfodataedmx;

import java.net.URI;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.sap.cloud.sdk.cloudplatform.connectivity.HttpDestinationProperties;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperFunction;
import com.sap.cloud.sdk.datamodel.odata.helper.ODataTypeValueSerializer;
import com.sap.cloud.sdk.odatav2.connectivity.ODataException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.olingo.odata2.api.edm.EdmSimpleTypeKind;


/**
 * Fluent helper for the <b>sendToNextStep</b> OData function import.
 * 
 */
public class SendToNextStepFluentHelper
    extends FluentHelperFunction<SendToNextStepFluentHelper, CORouteFormStatusBean, CORouteFormStatusBean>
{

    private final Map<String, Object> values = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will execute the <b>sendToNextStep</b> OData function import with the provided parameters. To perform execution, call the {@link #execute execute} method on the fluent helper object.
     * 
     * @param innerStepUserId
     *     Constraints: none<p>Original parameter name from the Odata EDM: <b>innerStepUserId</b></p>
     * @param servicePath
     *     Service path to be used to call the functions against.
     * @param formDataId
     *     Constraints: none<p>Original parameter name from the Odata EDM: <b>formDataId</b></p>
     * @param comment
     *     Constraints: none<p>Original parameter name from the Odata EDM: <b>comment</b></p>
     * @param nextIStepEntryUser
     *     Constraints: none<p>Original parameter name from the Odata EDM: <b>nextIStepEntryUser</b></p>
     */
    public SendToNextStepFluentHelper(
        @Nonnull
        final String servicePath, final Long formDataId, final String comment, final String innerStepUserId, final String nextIStepEntryUser) {
        super(servicePath);
        values.put("formDataId", ODataTypeValueSerializer.of(EdmSimpleTypeKind.Int64).toUri(formDataId));
        values.put("comment", ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(comment));
        values.put("innerStepUserId", ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(innerStepUserId));
        values.put("nextIStepEntryUser", ODataTypeValueSerializer.of(EdmSimpleTypeKind.String).toUri(nextIStepEntryUser));
    }

    @Override
    @Nonnull
    protected Class<CORouteFormStatusBean> getEntityClass() {
        return CORouteFormStatusBean.class;
    }

    @Override
    @Nonnull
    protected String getFunctionName() {
        return "sendToNextStep";
    }

    @Override
    @Nullable
    protected JsonElement refineJsonResponse(
        @Nullable
        JsonElement jsonElement) {
        if ((jsonElement instanceof JsonObject)&&((JsonObject) jsonElement).has(getFunctionName())) {
            jsonElement = ((JsonObject) jsonElement).get(getFunctionName());
        }
        return super.refineJsonResponse(jsonElement);
    }

    @Override
    @Nonnull
    protected Map<String, Object> getParameters() {
        return values;
    }

    @Override
    @Nonnull
    protected HttpUriRequest createRequest(
        @Nonnull
        final URI uri) {
        return new HttpGet(uri);
    }

    @Override
    @Nullable
    public CORouteFormStatusBean execute(
        @Nonnull
        final HttpDestinationProperties destination)
        throws ODataException
    {
        return super.executeSingle(destination);
    }

}