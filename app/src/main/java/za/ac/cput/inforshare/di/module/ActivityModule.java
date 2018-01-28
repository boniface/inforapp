/*
 * Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://mindorks.com/license/apache-v2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package za.ac.cput.inforshare.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import za.ac.cput.inforshare.repository.network.model.BlogResponse;
import za.ac.cput.inforshare.repository.network.model.OpenSourceResponse;
import za.ac.cput.inforshare.di.ActivityContext;
import za.ac.cput.inforshare.di.PerActivity;
import za.ac.cput.inforshare.ui.about.AboutMvpPresenter;
import za.ac.cput.inforshare.ui.about.AboutMvpView;
import za.ac.cput.inforshare.ui.about.AboutPresenter;
import za.ac.cput.inforshare.ui.feed.FeedMvpPresenter;
import za.ac.cput.inforshare.ui.feed.FeedMvpView;
import za.ac.cput.inforshare.ui.feed.FeedPagerAdapter;
import za.ac.cput.inforshare.ui.feed.FeedPresenter;
import za.ac.cput.inforshare.ui.feed.blogs.BlogAdapter;
import za.ac.cput.inforshare.ui.feed.blogs.BlogMvpPresenter;
import za.ac.cput.inforshare.ui.feed.blogs.BlogMvpView;
import za.ac.cput.inforshare.ui.feed.blogs.BlogPresenter;
import za.ac.cput.inforshare.ui.feed.opensource.OpenSourceAdapter;
import za.ac.cput.inforshare.ui.feed.opensource.OpenSourceMvpPresenter;
import za.ac.cput.inforshare.ui.feed.opensource.OpenSourceMvpView;
import za.ac.cput.inforshare.ui.feed.opensource.OpenSourcePresenter;
import za.ac.cput.inforshare.ui.login.LoginMvpPresenter;
import za.ac.cput.inforshare.ui.login.LoginMvpView;
import za.ac.cput.inforshare.ui.login.LoginPresenter;
import za.ac.cput.inforshare.ui.main.MainMvpPresenter;
import za.ac.cput.inforshare.ui.main.MainMvpView;
import za.ac.cput.inforshare.ui.main.MainPresenter;
import za.ac.cput.inforshare.ui.main.rating.RatingDialogMvpPresenter;
import za.ac.cput.inforshare.ui.main.rating.RatingDialogMvpView;
import za.ac.cput.inforshare.ui.main.rating.RatingDialogPresenter;
import za.ac.cput.inforshare.ui.splash.SplashMvpPresenter;
import za.ac.cput.inforshare.ui.splash.SplashMvpView;
import za.ac.cput.inforshare.ui.splash.SplashPresenter;
import za.ac.cput.inforshare.utils.rx.AppSchedulerProvider;
import za.ac.cput.inforshare.utils.rx.SchedulerProvider;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by janisharali on 27/01/17.
 */

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }

    @Provides
    @PerActivity
    SplashMvpPresenter<SplashMvpView> provideSplashPresenter(
            SplashPresenter<SplashMvpView> presenter) {
        return presenter;
    }

    @Provides
    AboutMvpPresenter<AboutMvpView> provideAboutPresenter(
            AboutPresenter<AboutMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    LoginMvpPresenter<LoginMvpView> provideLoginPresenter(
            LoginPresenter<LoginMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    MainMvpPresenter<MainMvpView> provideMainPresenter(
            MainPresenter<MainMvpView> presenter) {
        return presenter;
    }

    @Provides
    RatingDialogMvpPresenter<RatingDialogMvpView> provideRateUsPresenter(
            RatingDialogPresenter<RatingDialogMvpView> presenter) {
        return presenter;
    }

    @Provides
    FeedMvpPresenter<FeedMvpView> provideFeedPresenter(
            FeedPresenter<FeedMvpView> presenter) {
        return presenter;
    }

    @Provides
    OpenSourceMvpPresenter<OpenSourceMvpView> provideOpenSourcePresenter(
            OpenSourcePresenter<OpenSourceMvpView> presenter) {
        return presenter;
    }

    @Provides
    BlogMvpPresenter<BlogMvpView> provideBlogMvpPresenter(
            BlogPresenter<BlogMvpView> presenter) {
        return presenter;
    }

    @Provides
    FeedPagerAdapter provideFeedPagerAdapter(AppCompatActivity activity) {
        return new FeedPagerAdapter(activity.getSupportFragmentManager());
    }

    @Provides
    OpenSourceAdapter provideOpenSourceAdapter() {
        return new OpenSourceAdapter(new ArrayList<OpenSourceResponse.Repo>());
    }

    @Provides
    BlogAdapter provideBlogAdapter() {
        return new BlogAdapter(new ArrayList<BlogResponse.Blog>());
    }

    @Provides
    LinearLayoutManager provideLinearLayoutManager(AppCompatActivity activity) {
        return new LinearLayoutManager(activity);
    }
}
