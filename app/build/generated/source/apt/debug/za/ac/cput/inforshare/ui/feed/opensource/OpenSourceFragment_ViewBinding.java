// Generated code from Butter Knife. Do not modify!
package za.ac.cput.inforshare.ui.feed.opensource;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import za.ac.cput.inforshare.R;

public class OpenSourceFragment_ViewBinding implements Unbinder {
  private OpenSourceFragment target;

  @UiThread
  public OpenSourceFragment_ViewBinding(OpenSourceFragment target, View source) {
    this.target = target;

    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.repo_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    OpenSourceFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
  }
}
