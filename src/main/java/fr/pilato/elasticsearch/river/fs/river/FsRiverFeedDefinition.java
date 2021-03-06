/*
 * Licensed to David Pilato (the "Author") under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. Author licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package fr.pilato.elasticsearch.river.fs.river;

import org.elasticsearch.common.unit.TimeValue;

import java.util.List;

/**
 * Define a FS Feed with source (aka short name), url and updateRate attributes
 *
 * @author dadoonet (David Pilato)
 */
public class FsRiverFeedDefinition {
    private String rivername;
    private String url;
    private TimeValue updateRate;
    private List<String> includes;
    private List<String> excludes;
    private boolean jsonSupport;
    private boolean filenameAsId;
    private boolean addFilesize;
    private double indexedChars;
    private String username;
    private String password;
    private String server;
    private String protocol;
    private String pemFilePath;
    private boolean removeDeleted;
    private boolean storeSource;
    private int port;

    public FsRiverFeedDefinition(String rivername, String url, TimeValue updateRate, List<String> includes,
                                 List<String> excludes, boolean jsonSupport, boolean filenameAsId,
                                 boolean addFilesize, double indexedChars, String username, String password,
                                 String server, int port, String protocol, String pemFilePath, boolean removeDeleted, boolean storeSource) {
        assert (excludes != null);
        assert (includes != null);
        this.includes = includes;
        this.excludes = excludes;
        this.rivername = rivername;
        this.url = url;
        this.updateRate = updateRate;
        this.jsonSupport = jsonSupport;
        this.filenameAsId = filenameAsId;
        this.addFilesize = addFilesize;
        this.indexedChars = indexedChars;
        this.username = username;
        this.password = password;
        this.server = server;
        this.protocol = protocol;
        this.pemFilePath = pemFilePath;
        this.removeDeleted = removeDeleted;
        this.storeSource = storeSource;
        this.port = port;
    }

    public String getRivername() {
        return rivername;
    }

    public String getUrl() {
        return url;
    }

    public TimeValue getUpdateRate() {
        return updateRate;
    }

    public List<String> getExcludes() {
        return excludes;
    }

    public List<String> getIncludes() {
        return includes;
    }

    public void addInclude(String include) {
        this.includes.add(include);
    }

    public void addExclude(String exclude) {
        this.excludes.add(exclude);
    }

    public boolean isJsonSupport() {
        return jsonSupport;
    }

    public boolean isFilenameAsId() {
        return filenameAsId;
    }

    public boolean isAddFilesize() {
        return addFilesize;
    }

    public double getIndexedChars() {
        return indexedChars;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getServer() {
        return this.server;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getPemFilePath() {
        return pemFilePath;
    }

    public boolean isRemoveDeleted() {
        return removeDeleted;
    }

    public boolean isStoreSource() {
        return storeSource;
    }

    public int getPort() {
        return port;
    }
}
