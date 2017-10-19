package com.liu.test.common;

import org.sitemesh.SiteMeshContext;
import org.sitemesh.content.ContentProperty;
import org.sitemesh.content.tagrules.TagRuleBundle;
import org.sitemesh.content.tagrules.html.ExportTagToContentRule;
import org.sitemesh.tagprocessor.State;

/**
 * Created by yulong.liu on 2016/12/27.
 */
public class ContentBundle implements TagRuleBundle {
    @Override
    public void install(State state, ContentProperty contentProperty, SiteMeshContext siteMeshContext) {
        state.addRule("cmfooter",new ExportTagToContentRule(siteMeshContext,contentProperty.getChild("cmfooter"),false));
        state.addRule("cmbody",new ExportTagToContentRule(siteMeshContext,contentProperty.getChild("cmbody"),false));
        state.addRule("cmheader",new ExportTagToContentRule(siteMeshContext,contentProperty.getChild("cmheader"),false));
        state.addRule("cmtitle",new ExportTagToContentRule(siteMeshContext,contentProperty.getChild("cmtitle"),false));
        state.addRule("headview",new ExportTagToContentRule(siteMeshContext,contentProperty.getChild("headview"),false));
    }

    @Override
    public void cleanUp(State state, ContentProperty contentProperty, SiteMeshContext siteMeshContext) {

    }
}
