// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2017  Kaltura Inc.
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as
// published by the Free Software Foundation, either version 3 of the
// License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
// @ignore
// ===================================================================================================
package com.kaltura.client.types;

import com.kaltura.client.Params;
import com.kaltura.client.utils.GsonParser;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class UrlTokenizerAkamaiSecureHd extends UrlTokenizer {

    private String paramName;
    private String aclPostfix;
    private String customPostfixes;
    private String useCookieHosts;
    private String rootDir;

    // paramName:
    public String getParamName(){
        return this.paramName;
    }
    public void setParamName(String paramName){
        this.paramName = paramName;
    }

    // aclPostfix:
    public String getAclPostfix(){
        return this.aclPostfix;
    }
    public void setAclPostfix(String aclPostfix){
        this.aclPostfix = aclPostfix;
    }

    // customPostfixes:
    public String getCustomPostfixes(){
        return this.customPostfixes;
    }
    public void setCustomPostfixes(String customPostfixes){
        this.customPostfixes = customPostfixes;
    }

    // useCookieHosts:
    public String getUseCookieHosts(){
        return this.useCookieHosts;
    }
    public void setUseCookieHosts(String useCookieHosts){
        this.useCookieHosts = useCookieHosts;
    }

    // rootDir:
    public String getRootDir(){
        return this.rootDir;
    }
    public void setRootDir(String rootDir){
        this.rootDir = rootDir;
    }


    public UrlTokenizerAkamaiSecureHd() {
       super();
    }

    public UrlTokenizerAkamaiSecureHd(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        paramName = GsonParser.parseString(jsonObject.get("paramName"));
        aclPostfix = GsonParser.parseString(jsonObject.get("aclPostfix"));
        customPostfixes = GsonParser.parseString(jsonObject.get("customPostfixes"));
        useCookieHosts = GsonParser.parseString(jsonObject.get("useCookieHosts"));
        rootDir = GsonParser.parseString(jsonObject.get("rootDir"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaUrlTokenizerAkamaiSecureHd");
        kparams.add("paramName", this.paramName);
        kparams.add("aclPostfix", this.aclPostfix);
        kparams.add("customPostfixes", this.customPostfixes);
        kparams.add("useCookieHosts", this.useCookieHosts);
        kparams.add("rootDir", this.rootDir);
        return kparams;
    }

}
