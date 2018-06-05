/*
 * Copyright 2017
 * Ubiquitous Knowledge Processing (UKP) Lab
 * Technische Universität Darmstadt
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.tudarmstadt.ukp.inception.externalsearch;

import java.io.Serializable;

public class ExternalSearchResult
    implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = 2698492628701213714L;

    private int tokenStart = -1;
    private int tokenLength = -1;
    private int offsetStart = -1;
    private int offsetEnd = -1;
    private String text;
    private String leftContext;
    private String rightContext;
    private long documentId;
    private String documentTitle;

    public int getTokenStart()
    {
        return tokenStart;
    }

    public void setTokenStart(int aTokenStart)
    {
        tokenStart = aTokenStart;
    }

    public int getTokenLength()
    {
        return tokenLength;
    }

    public void setTokenLength(int aTokenLength)
    {
        tokenLength = aTokenLength;
    }

    public int getOffsetStart()
    {
        return offsetStart;
    }

    public void setOffsetStart(int offsetStart)
    {
        this.offsetStart = offsetStart;
    }

    public int getOffsetEnd()
    {
        return offsetEnd;
    }

    public void setOffsetEnd(int offsetEnd)
    {
        this.offsetEnd = offsetEnd;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String aText)
    {
        text = aText;
    }

    public String getLeftContext()
    {
        return leftContext;
    }

    public void setLeftContext(String aLeftContext)
    {
        leftContext = aLeftContext;
    }

    public String getRightContext()
    {
        return rightContext;
    }

    public void setRightContext(String aRightContext)
    {
        rightContext = aRightContext;
    }

    public long getDocumentId()
    {
        return documentId;
    }

    public void setDocumentId(long aDocumentId)
    {
        documentId = aDocumentId;
    }

    public String getDocumentTitle()
    {
        return documentTitle;
    }

    public void setDocumentTitle(String aDocumentTitle)
    {
        documentTitle = aDocumentTitle;
    }
}
