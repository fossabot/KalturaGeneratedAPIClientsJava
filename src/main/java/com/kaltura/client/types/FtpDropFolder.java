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
public class FtpDropFolder extends RemoteDropFolder {

    private String host;
    private Integer port;
    private String username;
    private String password;

    // host:
    public String getHost(){
        return this.host;
    }
    public void setHost(String host){
        this.host = host;
    }

    // port:
    public Integer getPort(){
        return this.port;
    }
    public void setPort(Integer port){
        this.port = port;
    }

    // username:
    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    // password:
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }


    public FtpDropFolder() {
       super();
    }

    public FtpDropFolder(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        host = GsonParser.parseString(jsonObject.get("host"));
        port = GsonParser.parseInt(jsonObject.get("port"));
        username = GsonParser.parseString(jsonObject.get("username"));
        password = GsonParser.parseString(jsonObject.get("password"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaFtpDropFolder");
        kparams.add("host", this.host);
        kparams.add("port", this.port);
        kparams.add("username", this.username);
        kparams.add("password", this.password);
        return kparams;
    }

}
