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
 * The class for the Base Workbook Functions Db Request Builder.
 */
public class BaseWorkbookFunctionsDbRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDb
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsDbRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement cost, final com.google.gson.JsonElement salvage, final com.google.gson.JsonElement life, final com.google.gson.JsonElement period, final com.google.gson.JsonElement month) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("cost", cost);
        bodyParams.put("salvage", salvage);
        bodyParams.put("life", life);
        bodyParams.put("period", period);
        bodyParams.put("month", month);
    }

    /**
     * Creates the IWorkbookFunctionsDbRequest
     *
     * @return The IWorkbookFunctionsDbRequest instance
     */
    public IWorkbookFunctionsDbRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsDbRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsDbRequest instance
     */
    public IWorkbookFunctionsDbRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsDbRequest request = new WorkbookFunctionsDbRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("cost")) {
            request.body.cost = getParameter("cost");
        }

        if (hasParameter("salvage")) {
            request.body.salvage = getParameter("salvage");
        }

        if (hasParameter("life")) {
            request.body.life = getParameter("life");
        }

        if (hasParameter("period")) {
            request.body.period = getParameter("period");
        }

        if (hasParameter("month")) {
            request.body.month = getParameter("month");
        }

        return request;
    }
}
