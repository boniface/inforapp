package za.ac.cput.inforshare;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import za.ac.cput.inforshare.repository.DataManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class App_MembersInjector implements MembersInjector<App> {
  private final Provider<DataManager> mDataManagerProvider;

  private final Provider<CalligraphyConfig> mCalligraphyConfigProvider;

  public App_MembersInjector(
      Provider<DataManager> mDataManagerProvider,
      Provider<CalligraphyConfig> mCalligraphyConfigProvider) {
    assert mDataManagerProvider != null;
    this.mDataManagerProvider = mDataManagerProvider;
    assert mCalligraphyConfigProvider != null;
    this.mCalligraphyConfigProvider = mCalligraphyConfigProvider;
  }

  public static MembersInjector<App> create(
      Provider<DataManager> mDataManagerProvider,
      Provider<CalligraphyConfig> mCalligraphyConfigProvider) {
    return new App_MembersInjector(mDataManagerProvider, mCalligraphyConfigProvider);
  }

  @Override
  public void injectMembers(App instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mDataManager = mDataManagerProvider.get();
    instance.mCalligraphyConfig = mCalligraphyConfigProvider.get();
  }

  public static void injectMDataManager(App instance, Provider<DataManager> mDataManagerProvider) {
    instance.mDataManager = mDataManagerProvider.get();
  }

  public static void injectMCalligraphyConfig(
      App instance, Provider<CalligraphyConfig> mCalligraphyConfigProvider) {
    instance.mCalligraphyConfig = mCalligraphyConfigProvider.get();
  }
}
