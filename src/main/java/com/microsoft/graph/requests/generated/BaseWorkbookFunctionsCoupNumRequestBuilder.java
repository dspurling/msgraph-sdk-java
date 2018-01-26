// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Coup Num Request Builder.
 */
public class BaseWorkbookFunctionsCoupNumRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsCoupNum
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsCoupNumRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement maturity, final com.google.gson.JsonElement frequency, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("settlement", settlement);
        bodyParams.put("maturity", maturity);
        bodyParams.put("frequency", frequency);
        bodyParams.put("basis", basis);
    }

    /**
     * Creates the IWorkbookFunctionsCoupNumRequest
     *
     * @return The IWorkbookFunctionsCoupNumRequest instance
     */
    public IWorkbookFunctionsCoupNumRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsCoupNumRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsCoupNumRequest instance
     */
    public IWorkbookFunctionsCoupNumRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsCoupNumRequest request = new WorkbookFunctionsCoupNumRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("settlement")) {
            request.body.settlement = getParameter("settlement");
        }

        if (hasParameter("maturity")) {
            request.body.maturity = getParameter("maturity");
        }

        if (hasParameter("frequency")) {
            request.body.frequency = getParameter("frequency");
        }

        if (hasParameter("basis")) {
            request.body.basis = getParameter("basis");
        }

        return request;
    }
}
