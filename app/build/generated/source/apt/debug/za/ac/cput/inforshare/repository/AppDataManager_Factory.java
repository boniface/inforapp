package za.ac.cput.inforshare.repository;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import za.ac.cput.inforshare.repository.db.DbHelper;
import za.ac.cput.inforshare.repository.network.ApiHelper;
import za.ac.cput.inforshare.repository.prefs.PreferencesHelper;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppDataManager_Factory implements Factory<AppDataManager> {
  private final Provider<Context> contextProvider;

  private final Provider<DbHelper> dbHelperProvider;

  private final Provider<PreferencesHelper> preferencesHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  public AppDataManager_Factory(
      Provider<Context> contextProvider,
      Provider<DbHelper> dbHelperProvider,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider) {
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert dbHelperProvider != null;
    this.dbHelperProvider = dbHelperProvider;
    assert preferencesHelperProvider != null;
    this.preferencesHelperProvider = preferencesHelperProvider;
    assert apiHelperProvider != null;
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public AppDataManager get() {
    return new AppDataManager(
        contextProvider.get(),
        dbHelperProvider.get(),
        preferencesHelperProvider.get(),
        apiHelperProvider.get());
  }

  public static Factory<AppDataManager> create(
      Provider<Context> contextProvider,
      Provider<DbHelper> dbHelperProvider,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider) {
    return new AppDataManager_Factory(
        contextProvider, dbHelperProvider, preferencesHelperProvider, apiHelperProvider);
  }
}
