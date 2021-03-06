package com.hackernewsapp.di.modules;

import android.app.Application;

import com.hackernewsapp.discussion.data.DiscussionInteractor;
import com.hackernewsapp.discussion.data.DiscussionInteractorImpl;
import com.hackernewsapp.discussion.presenter.DiscussionPresenter;
import com.hackernewsapp.discussion.presenter.DiscussionPresenterImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tosin on 3/13/2017.
 */

@Module
public class DiscussionModule {
    private Application application;

    public DiscussionModule(Application application){
        this.application = application;
    }

    @Provides
    public DiscussionPresenter getDiscussionPresenter(DiscussionInteractor discussionInteractor){
        return new DiscussionPresenterImpl(application, discussionInteractor);
    }

    @Provides
    public DiscussionInteractor providesDiscussionInteractor(){
        return new DiscussionInteractorImpl(application);
    }
}
