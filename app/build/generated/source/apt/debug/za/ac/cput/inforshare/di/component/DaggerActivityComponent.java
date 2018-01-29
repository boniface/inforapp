package za.ac.cput.inforshare.di.component;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import io.reactivex.disposables.CompositeDisposable;
import javax.annotation.Generated;
import javax.inject.Provider;
import za.ac.cput.inforshare.di.module.ActivityModule;
import za.ac.cput.inforshare.di.module.ActivityModule_ProvideAboutPresenterFactory;
import za.ac.cput.inforshare.di.module.ActivityModule_ProvideActivityFactory;
import za.ac.cput.inforshare.di.module.ActivityModule_ProvideBlogAdapterFactory;
import za.ac.cput.inforshare.di.module.ActivityModule_ProvideBlogMvpPresenterFactory;
import za.ac.cput.inforshare.di.module.ActivityModule_ProvideCompositeDisposableFactory;
import za.ac.cput.inforshare.di.module.ActivityModule_ProvideFeedPagerAdapterFactory;
import za.ac.cput.inforshare.di.module.ActivityModule_ProvideFeedPresenterFactory;
import za.ac.cput.inforshare.di.module.ActivityModule_ProvideLinearLayoutManagerFactory;
import za.ac.cput.inforshare.di.module.ActivityModule_ProvideLoginPresenterFactory;
import za.ac.cput.inforshare.di.module.ActivityModule_ProvideMainPresenterFactory;
import za.ac.cput.inforshare.di.module.ActivityModule_ProvideOpenSourceAdapterFactory;
import za.ac.cput.inforshare.di.module.ActivityModule_ProvideOpenSourcePresenterFactory;
import za.ac.cput.inforshare.di.module.ActivityModule_ProvideRateUsPresenterFactory;
import za.ac.cput.inforshare.di.module.ActivityModule_ProvideSchedulerProviderFactory;
import za.ac.cput.inforshare.di.module.ActivityModule_ProvideSplashPresenterFactory;
import za.ac.cput.inforshare.repository.DataManager;
import za.ac.cput.inforshare.ui.about.AboutFragment;
import za.ac.cput.inforshare.ui.about.AboutFragment_MembersInjector;
import za.ac.cput.inforshare.ui.about.AboutMvpPresenter;
import za.ac.cput.inforshare.ui.about.AboutMvpView;
import za.ac.cput.inforshare.ui.about.AboutPresenter;
import za.ac.cput.inforshare.ui.about.AboutPresenter_Factory;
import za.ac.cput.inforshare.ui.feed.FeedActivity;
import za.ac.cput.inforshare.ui.feed.FeedActivity_MembersInjector;
import za.ac.cput.inforshare.ui.feed.FeedMvpPresenter;
import za.ac.cput.inforshare.ui.feed.FeedMvpView;
import za.ac.cput.inforshare.ui.feed.FeedPagerAdapter;
import za.ac.cput.inforshare.ui.feed.FeedPresenter;
import za.ac.cput.inforshare.ui.feed.FeedPresenter_Factory;
import za.ac.cput.inforshare.ui.feed.blogs.BlogAdapter;
import za.ac.cput.inforshare.ui.feed.blogs.BlogFragment;
import za.ac.cput.inforshare.ui.feed.blogs.BlogFragment_MembersInjector;
import za.ac.cput.inforshare.ui.feed.blogs.BlogMvpPresenter;
import za.ac.cput.inforshare.ui.feed.blogs.BlogMvpView;
import za.ac.cput.inforshare.ui.feed.blogs.BlogPresenter;
import za.ac.cput.inforshare.ui.feed.blogs.BlogPresenter_Factory;
import za.ac.cput.inforshare.ui.feed.opensource.OpenSourceAdapter;
import za.ac.cput.inforshare.ui.feed.opensource.OpenSourceFragment;
import za.ac.cput.inforshare.ui.feed.opensource.OpenSourceFragment_MembersInjector;
import za.ac.cput.inforshare.ui.feed.opensource.OpenSourceMvpPresenter;
import za.ac.cput.inforshare.ui.feed.opensource.OpenSourceMvpView;
import za.ac.cput.inforshare.ui.feed.opensource.OpenSourcePresenter;
import za.ac.cput.inforshare.ui.feed.opensource.OpenSourcePresenter_Factory;
import za.ac.cput.inforshare.ui.login.LoginActivity;
import za.ac.cput.inforshare.ui.login.LoginActivity_MembersInjector;
import za.ac.cput.inforshare.ui.login.LoginMvpPresenter;
import za.ac.cput.inforshare.ui.login.LoginMvpView;
import za.ac.cput.inforshare.ui.login.LoginPresenter;
import za.ac.cput.inforshare.ui.login.LoginPresenter_Factory;
import za.ac.cput.inforshare.ui.main.MainActivity;
import za.ac.cput.inforshare.ui.main.MainActivity_MembersInjector;
import za.ac.cput.inforshare.ui.main.MainMvpPresenter;
import za.ac.cput.inforshare.ui.main.MainMvpView;
import za.ac.cput.inforshare.ui.main.MainPresenter;
import za.ac.cput.inforshare.ui.main.MainPresenter_Factory;
import za.ac.cput.inforshare.ui.main.rating.RateUsDialog;
import za.ac.cput.inforshare.ui.main.rating.RateUsDialog_MembersInjector;
import za.ac.cput.inforshare.ui.main.rating.RatingDialogMvpPresenter;
import za.ac.cput.inforshare.ui.main.rating.RatingDialogMvpView;
import za.ac.cput.inforshare.ui.main.rating.RatingDialogPresenter;
import za.ac.cput.inforshare.ui.main.rating.RatingDialogPresenter_Factory;
import za.ac.cput.inforshare.ui.splash.SplashActivity;
import za.ac.cput.inforshare.ui.splash.SplashActivity_MembersInjector;
import za.ac.cput.inforshare.ui.splash.SplashMvpPresenter;
import za.ac.cput.inforshare.ui.splash.SplashMvpView;
import za.ac.cput.inforshare.ui.splash.SplashPresenter;
import za.ac.cput.inforshare.ui.splash.SplashPresenter_Factory;
import za.ac.cput.inforshare.utils.rx.SchedulerProvider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerActivityComponent implements ActivityComponent {
  private Provider<DataManager> getDataManagerProvider;

  private Provider<SchedulerProvider> provideSchedulerProvider;

  private Provider<CompositeDisposable> provideCompositeDisposableProvider;

  private Provider<MainPresenter<MainMvpView>> mainPresenterProvider;

  private Provider<MainMvpPresenter<MainMvpView>> provideMainPresenterProvider;

  private MembersInjector<MainActivity> mainActivityMembersInjector;

  private Provider<LoginPresenter<LoginMvpView>> loginPresenterProvider;

  private Provider<LoginMvpPresenter<LoginMvpView>> provideLoginPresenterProvider;

  private MembersInjector<LoginActivity> loginActivityMembersInjector;

  private Provider<SplashPresenter<SplashMvpView>> splashPresenterProvider;

  private Provider<SplashMvpPresenter<SplashMvpView>> provideSplashPresenterProvider;

  private MembersInjector<SplashActivity> splashActivityMembersInjector;

  private Provider<FeedPresenter<FeedMvpView>> feedPresenterProvider;

  private Provider<FeedMvpPresenter<FeedMvpView>> provideFeedPresenterProvider;

  private Provider<AppCompatActivity> provideActivityProvider;

  private Provider<FeedPagerAdapter> provideFeedPagerAdapterProvider;

  private MembersInjector<FeedActivity> feedActivityMembersInjector;

  private Provider<AboutPresenter<AboutMvpView>> aboutPresenterProvider;

  private Provider<AboutMvpPresenter<AboutMvpView>> provideAboutPresenterProvider;

  private MembersInjector<AboutFragment> aboutFragmentMembersInjector;

  private Provider<OpenSourcePresenter<OpenSourceMvpView>> openSourcePresenterProvider;

  private Provider<OpenSourceMvpPresenter<OpenSourceMvpView>> provideOpenSourcePresenterProvider;

  private Provider<OpenSourceAdapter> provideOpenSourceAdapterProvider;

  private Provider<LinearLayoutManager> provideLinearLayoutManagerProvider;

  private MembersInjector<OpenSourceFragment> openSourceFragmentMembersInjector;

  private Provider<BlogPresenter<BlogMvpView>> blogPresenterProvider;

  private Provider<BlogMvpPresenter<BlogMvpView>> provideBlogMvpPresenterProvider;

  private Provider<BlogAdapter> provideBlogAdapterProvider;

  private MembersInjector<BlogFragment> blogFragmentMembersInjector;

  private Provider<RatingDialogPresenter<RatingDialogMvpView>> ratingDialogPresenterProvider;

  private Provider<RatingDialogMvpPresenter<RatingDialogMvpView>> provideRateUsPresenterProvider;

  private MembersInjector<RateUsDialog> rateUsDialogMembersInjector;

  private DaggerActivityComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.getDataManagerProvider =
        new Factory<DataManager>() {
          private final ApplicationComponent applicationComponent = builder.applicationComponent;

          @Override
          public DataManager get() {
            return Preconditions.checkNotNull(
                applicationComponent.getDataManager(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.provideSchedulerProvider =
        ActivityModule_ProvideSchedulerProviderFactory.create(builder.activityModule);

    this.provideCompositeDisposableProvider =
        ActivityModule_ProvideCompositeDisposableFactory.create(builder.activityModule);

    this.mainPresenterProvider =
        MainPresenter_Factory.create(
            MembersInjectors.<MainPresenter<MainMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideMainPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideMainPresenterFactory.create(
                builder.activityModule, mainPresenterProvider));

    this.mainActivityMembersInjector =
        MainActivity_MembersInjector.create(provideMainPresenterProvider);

    this.loginPresenterProvider =
        LoginPresenter_Factory.create(
            MembersInjectors.<LoginPresenter<LoginMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideLoginPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideLoginPresenterFactory.create(
                builder.activityModule, loginPresenterProvider));

    this.loginActivityMembersInjector =
        LoginActivity_MembersInjector.create(provideLoginPresenterProvider);

    this.splashPresenterProvider =
        SplashPresenter_Factory.create(
            MembersInjectors.<SplashPresenter<SplashMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideSplashPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideSplashPresenterFactory.create(
                builder.activityModule, splashPresenterProvider));

    this.splashActivityMembersInjector =
        SplashActivity_MembersInjector.create(provideSplashPresenterProvider);

    this.feedPresenterProvider =
        FeedPresenter_Factory.create(
            MembersInjectors.<FeedPresenter<FeedMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideFeedPresenterProvider =
        ActivityModule_ProvideFeedPresenterFactory.create(
            builder.activityModule, feedPresenterProvider);

    this.provideActivityProvider =
        ActivityModule_ProvideActivityFactory.create(builder.activityModule);

    this.provideFeedPagerAdapterProvider =
        ActivityModule_ProvideFeedPagerAdapterFactory.create(
            builder.activityModule, provideActivityProvider);

    this.feedActivityMembersInjector =
        FeedActivity_MembersInjector.create(
            provideFeedPresenterProvider, provideFeedPagerAdapterProvider);

    this.aboutPresenterProvider =
        AboutPresenter_Factory.create(
            MembersInjectors.<AboutPresenter<AboutMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideAboutPresenterProvider =
        ActivityModule_ProvideAboutPresenterFactory.create(
            builder.activityModule, aboutPresenterProvider);

    this.aboutFragmentMembersInjector =
        AboutFragment_MembersInjector.create(provideAboutPresenterProvider);

    this.openSourcePresenterProvider =
        OpenSourcePresenter_Factory.create(
            MembersInjectors.<OpenSourcePresenter<OpenSourceMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideOpenSourcePresenterProvider =
        ActivityModule_ProvideOpenSourcePresenterFactory.create(
            builder.activityModule, openSourcePresenterProvider);

    this.provideOpenSourceAdapterProvider =
        ActivityModule_ProvideOpenSourceAdapterFactory.create(builder.activityModule);

    this.provideLinearLayoutManagerProvider =
        ActivityModule_ProvideLinearLayoutManagerFactory.create(
            builder.activityModule, provideActivityProvider);

    this.openSourceFragmentMembersInjector =
        OpenSourceFragment_MembersInjector.create(
            provideOpenSourcePresenterProvider,
            provideOpenSourceAdapterProvider,
            provideLinearLayoutManagerProvider);

    this.blogPresenterProvider =
        BlogPresenter_Factory.create(
            MembersInjectors.<BlogPresenter<BlogMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideBlogMvpPresenterProvider =
        ActivityModule_ProvideBlogMvpPresenterFactory.create(
            builder.activityModule, blogPresenterProvider);

    this.provideBlogAdapterProvider =
        ActivityModule_ProvideBlogAdapterFactory.create(builder.activityModule);

    this.blogFragmentMembersInjector =
        BlogFragment_MembersInjector.create(
            provideBlogMvpPresenterProvider,
            provideBlogAdapterProvider,
            provideLinearLayoutManagerProvider);

    this.ratingDialogPresenterProvider =
        RatingDialogPresenter_Factory.create(
            MembersInjectors.<RatingDialogPresenter<RatingDialogMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideRateUsPresenterProvider =
        ActivityModule_ProvideRateUsPresenterFactory.create(
            builder.activityModule, ratingDialogPresenterProvider);

    this.rateUsDialogMembersInjector =
        RateUsDialog_MembersInjector.create(provideRateUsPresenterProvider);
  }

  @Override
  public void inject(MainActivity activity) {
    mainActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(LoginActivity activity) {
    loginActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(SplashActivity activity) {
    splashActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(FeedActivity activity) {
    feedActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(AboutFragment fragment) {
    aboutFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(OpenSourceFragment fragment) {
    openSourceFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(BlogFragment fragment) {
    blogFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(RateUsDialog dialog) {
    rateUsDialogMembersInjector.injectMembers(dialog);
  }

  public static final class Builder {
    private ActivityModule activityModule;

    private ApplicationComponent applicationComponent;

    private Builder() {}

    public ActivityComponent build() {
      if (activityModule == null) {
        throw new IllegalStateException(ActivityModule.class.getCanonicalName() + " must be set");
      }
      if (applicationComponent == null) {
        throw new IllegalStateException(
            ApplicationComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerActivityComponent(this);
    }

    public Builder activityModule(ActivityModule activityModule) {
      this.activityModule = Preconditions.checkNotNull(activityModule);
      return this;
    }

    public Builder applicationComponent(ApplicationComponent applicationComponent) {
      this.applicationComponent = Preconditions.checkNotNull(applicationComponent);
      return this;
    }
  }
}
