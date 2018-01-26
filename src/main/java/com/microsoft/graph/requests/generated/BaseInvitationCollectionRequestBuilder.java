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
 * The class for the Base Invitation Collection Request Builder.
 */
public class BaseInvitationCollectionRequestBuilder extends BaseRequestBuilder implements IBaseInvitationCollectionRequestBuilder {

    /**
     * The request builder for this collection of Invitation
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseInvitationCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IInvitationCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IInvitationCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new InvitationCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IInvitationRequestBuilder byId(final String id) {
        return new InvitationRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }
}
