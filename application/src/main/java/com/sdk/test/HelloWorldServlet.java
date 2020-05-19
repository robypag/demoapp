package com.sdk.test;

import com.sap.cloud.sdk.cloudplatform.connectivity.DestinationAccessor;
import com.sap.cloud.sdk.cloudplatform.connectivity.HttpDestination;
import com.sap.cloud.sdk.odatav2.connectivity.ODataException;
import com.sap.cloud.sdk.s4hana.connectivity.DefaultErpHttpDestination;
import com.sap.cloud.sdk.s4hana.connectivity.ErpHttpDestination;
import com.sdk.test.vdm.namespaces.sfodataedmx.Background_CaricaPubblica;
import com.sdk.test.vdm.namespaces.sfodataedmx.PicklistLabel;
import com.sdk.test.vdm.namespaces.sfodataedmx.PicklistOption;
import com.sdk.test.vdm.services.DefaultSFODataEdmxService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldServlet.class);

    @Override
    protected void doGet( final HttpServletRequest request, final HttpServletResponse response )
        throws IOException
    {
        final HttpDestination destination = DestinationAccessor.getDestination("SUCCESS_FACTORS").asHttp();
        try {
            List<Background_CaricaPubblica> bgList =
                    new DefaultSFODataEdmxService()
                            .getAllBackground_CaricaPubblica()
                            .select(Background_CaricaPubblica.USER_ID,
                                    Background_CaricaPubblica.CARICA,
                                    Background_CaricaPubblica.TO_ENTE_NAV.select(
                                            PicklistOption.EXTERNAL_CODE,
                                            PicklistOption.TO_PICKLIST_LABELS.select(
                                                    PicklistLabel.LABEL
                                            )
                                    ),
                                    Background_CaricaPubblica.TO_UFFICIO_NAV.select(
                                            PicklistOption.EXTERNAL_CODE
                                    )).execute(destination);
        } catch (final ODataException e) {
            logger.error(e.getMessage(), e);
        }
    }
}
