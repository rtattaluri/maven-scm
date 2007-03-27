package org.apache.maven.scm;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * @author <a href="mailto:trygvis@inamo.no">Trygve Laugst&oslash;l</a>
 * @version $Id$
 */
public class CommandParameter
{
    public final static CommandParameter BINARY = new CommandParameter( "binary" );

    public final static CommandParameter RECURSIVE = new CommandParameter( "recursive" );

    public final static CommandParameter MESSAGE = new CommandParameter( "message" );

    public final static CommandParameter BRANCH_NAME = new CommandParameter( "branchName" );

    public final static CommandParameter START_DATE = new CommandParameter( "startDate" );

    public final static CommandParameter END_DATE = new CommandParameter( "endDate" );

    public final static CommandParameter NUM_DAYS = new CommandParameter( "numDays" );

    public final static CommandParameter BRANCH = new CommandParameter( "branch" );

    public final static CommandParameter START_TAG = new CommandParameter( "startTag" );

    public final static CommandParameter END_TAG = new CommandParameter( "endTag" );

    public final static CommandParameter CHANGELOG_DATE_PATTERN = new CommandParameter( "changelogDatePattern" );

    public final static CommandParameter TAG = new CommandParameter( "tag" );

    public final static CommandParameter FILE = new CommandParameter( "file" );

    public final static CommandParameter FILES = new CommandParameter( "files" );

    public final static CommandParameter START_REVISION = new CommandParameter( "startRevision" );

    public final static CommandParameter END_REVISION = new CommandParameter( "endRevision" );

    public final static CommandParameter OUTPUT_FILE = new CommandParameter( "outputFile" );

    public final static CommandParameter OUTPUT_DIRECTORY = new CommandParameter( "outputDirectory" );

    public final static CommandParameter RUN_CHANGELOG_WITH_UPDATE =
        new CommandParameter( "run_changelog_with_update" );

    /**
     * Parameter name
     */
    private String name;

    /**
     * @param name The parameter name
     */
    private CommandParameter( String name )
    {
        this.name = name;
    }

    /**
     * @return The parameter name
     */
    public String getName()
    {
        return name;
    }
}
