package za.ac.cput.inforshare.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import za.ac.cput.inforshare.ui.about.AboutMvpPresenter;
import za.ac.cput.inforshare.ui.about.AboutMvpView;
import za.ac.cput.inforshare.ui.about.AboutPresenter;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideAboutPresenterFactory
    implements Factory<AboutMvpPresenter<AboutMvpView>> {
  private final ActivityModule module;

  private final Provider<AboutPresenter<AboutMvpView>> presenterProvider;

  public ActivityModule_ProvideAboutPresenterFactory(
      ActivityModule module, Provider<AboutPresenter<AboutMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public AboutMvpPresenter<AboutMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideAboutPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AboutMvpPresenter<AboutMvpView>> create(
      ActivityModule module, Provider<AboutPresenter<AboutMvpView>> presenterProvider) {
    return new ActivityModule_ProvideAboutPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideAboutPresenter(AboutPresenter)}. */
  public static AboutMvpPresenter<AboutMvpView> proxyProvideAboutPresenter(
      ActivityModule instance, AboutPresenter<AboutMvpView> presenter) {
    return instance.provideAboutPresenter(presenter);
  }
}
