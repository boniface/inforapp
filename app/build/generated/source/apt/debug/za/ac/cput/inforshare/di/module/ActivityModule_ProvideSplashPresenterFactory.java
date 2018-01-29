package za.ac.cput.inforshare.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import za.ac.cput.inforshare.ui.splash.SplashMvpPresenter;
import za.ac.cput.inforshare.ui.splash.SplashMvpView;
import za.ac.cput.inforshare.ui.splash.SplashPresenter;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideSplashPresenterFactory
    implements Factory<SplashMvpPresenter<SplashMvpView>> {
  private final ActivityModule module;

  private final Provider<SplashPresenter<SplashMvpView>> presenterProvider;

  public ActivityModule_ProvideSplashPresenterFactory(
      ActivityModule module, Provider<SplashPresenter<SplashMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public SplashMvpPresenter<SplashMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideSplashPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SplashMvpPresenter<SplashMvpView>> create(
      ActivityModule module, Provider<SplashPresenter<SplashMvpView>> presenterProvider) {
    return new ActivityModule_ProvideSplashPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideSplashPresenter(SplashPresenter)}. */
  public static SplashMvpPresenter<SplashMvpView> proxyProvideSplashPresenter(
      ActivityModule instance, SplashPresenter<SplashMvpView> presenter) {
    return instance.provideSplashPresenter(presenter);
  }
}
