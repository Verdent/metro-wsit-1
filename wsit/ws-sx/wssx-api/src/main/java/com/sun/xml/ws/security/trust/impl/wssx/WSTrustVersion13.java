/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package com.sun.xml.ws.security.trust.impl.wssx;

import com.sun.xml.ws.security.trust.WSTrustVersion;
/**
 *
 * @author Jiandong
 */
public class WSTrustVersion13 extends WSTrustVersion{

    private String nsURI;

    public WSTrustVersion13(){
           nsURI =  "http://docs.oasis-open.org/ws-sx/ws-trust/200512";
}
    public String getNamespaceURI(){
        return nsURI;
    }

    public  String getIssueRequestTypeURI(){
        return nsURI + "/Issue";
    }

    public  String getRenewRequestTypeURI(){
        return nsURI + "/Renew";
    }

    public  String getCancelRequestTypeURI(){
        return nsURI +"/Cancel";
    }

    public  String getValidateRequestTypeURI(){
        return nsURI +"/Validate";
    }
    
    public String getValidateStatuesTokenType(){
        return nsURI+"/RSTR/Status";
    }
    
    public String getKeyExchangeRequestTypeURI(){
        return nsURI +"/KET";
    }
    
    public  String getPublicKeyTypeURI(){
        return nsURI +"/PublicKey";
    }

    public  String getSymmetricKeyTypeURI(){
        return nsURI +"/SymmetricKey";
    }

    public  String getBearerKeyTypeURI(){
        return nsURI+"/Bearer";
    }

    public  String getIssueRequestAction(){
        return nsURI + "/RST/Issue";
    }

    public  String getIssueResponseAction(){
        return nsURI + "/RSTR/Issue";
    }

    public  String getIssueFinalResoponseAction(){
        return nsURI + "/RSTRC/IssueFinal";
    }

    public  String getRenewRequestAction(){
        return nsURI + "/RST/Renew";
    }

    public  String getRenewResponseAction(){
        return nsURI + "/RSTR/Renew";
    }

    public  String getRenewFinalResoponseAction(){
        return nsURI + "/RSTRC/RenewFinal";
    }
    public  String getCancelRequestAction(){
        return nsURI + "/RST/Cancel";
    }

    public  String getCancelResponseAction(){
        return nsURI + "/RSTR/Cancel";
    }

    public  String getCancelFinalResoponseAction(){
        return nsURI + "/RSTRC/CancelFinal";
    }
    
    public  String getValidateRequestAction(){
        return nsURI + "/RST/Validate";
    }

    public  String getValidateResponseAction(){
        return nsURI + "/RSTR/Validate";
    }

    public  String getValidateFinalResoponseAction(){
        return nsURI + "/RSTR/ValidateFinal";
    }

    public  String getCKPSHA1algorithmURI(){
        return nsURI + "/CK/PSHA1";
    }
    
    public  String getCKHASHalgorithmURI(){
        return nsURI + "/CK/HASH";
    }

    public  String getAsymmetricKeyBinarySecretTypeURI(){
        return nsURI + "/AsymmetricKey";
    }

    public  String getNonceBinarySecretTypeURI(){
        return nsURI + "/Nonce";
    }
    
     public String getValidStatusCodeURI(){
        return nsURI + "/status/valid";
    }
    
    public String getInvalidStatusCodeURI(){
        return nsURI + "/status/invalid";
    }
}
