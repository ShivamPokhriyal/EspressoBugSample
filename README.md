# EspressoBugSample
Demonstrates bug with espresso viewMatcher `isDisplayed` where it incorrectly expects a view to be visible on the screen when the view is hidden because another view is on top of it. 

Here's a screenshot of the screen 




# How to run

Clone this project and run `./gradlew :app:testDebugUnitTest --info`. Or after cloning, open the project in AndroidStudio and search for `MainActivityTest` and run it. 

# StackTrace
```
'not (view has effective visibility <VISIBLE> and view.getGlobalVisibleRect() to return non-empty rectangle)' doesn't match the selected view.
Expected: not (view has effective visibility <VISIBLE> and view.getGlobalVisibleRect() to return non-empty rectangle)
     Got: was <com.google.android.material.textview.MaterialTextView{4491ab02 V.ED..... ......ID 154,187-166,228 #7f0801b2 app:id/text_view}>
View Details: MaterialTextView{id=2131231154, res-name=text_view, visibility=VISIBLE, width=12, height=41, has-focus=false, has-focusable=false, has-window-focus=true, is-clickable=false, is-enabled=true, is-focused=false, is-focusable=false, is-layout-requested=false, is-selected=false, layout-params=androidx.constraintlayout.widget.ConstraintLayout$LayoutParams@19b927d9, tag=null, root-is-layout-requested=false, has-input-connection=false, x=154.0, y=187.0, text=Hello World!, input-type=0, ime-target=false, has-links=false}

androidx.test.espresso.base.AssertionErrorHandler$AssertionFailedWithCauseError: 'not (view has effective visibility <VISIBLE> and view.getGlobalVisibleRect() to return non-empty rectangle)' doesn't match the selected view.
Expected: not (view has effective visibility <VISIBLE> and view.getGlobalVisibleRect() to return non-empty rectangle)
     Got: was <com.google.android.material.textview.MaterialTextView{4491ab02 V.ED..... ......ID 154,187-166,228 #7f0801b2 app:id/text_view}>
View Details: MaterialTextView{id=2131231154, res-name=text_view, visibility=VISIBLE, width=12, height=41, has-focus=false, has-focusable=false, has-window-focus=true, is-clickable=false, is-enabled=true, is-focused=false, is-focusable=false, is-layout-requested=false, is-selected=false, layout-params=androidx.constraintlayout.widget.ConstraintLayout$LayoutParams@19b927d9, tag=null, root-is-layout-requested=false, has-input-connection=false, x=154.0, y=187.0, text=Hello World!, input-type=0, ime-target=false, has-links=false}

	at java.base/java.lang.Thread.getStackTrace(Thread.java:1607)
	at androidx.test.espresso.base.AssertionErrorHandler.handleSafely(AssertionErrorHandler.java:3)
	at androidx.test.espresso.base.AssertionErrorHandler.handleSafely(AssertionErrorHandler.java:1)
	at androidx.test.espresso.base.DefaultFailureHandler$TypedFailureHandler.handle(DefaultFailureHandler.java:4)
	at androidx.test.espresso.base.DefaultFailureHandler.handle(DefaultFailureHandler.java:5)
	at androidx.test.espresso.ViewInteraction.waitForAndHandleInteractionResults(ViewInteraction.java:5)
	at androidx.test.espresso.ViewInteraction.check(ViewInteraction.java:12)
	at com.example.espressobugsample.MainActivityTest.testTextView$lambda-0(MainActivityTest.kt:21)
	at androidx.test.core.app.ActivityScenario.lambda$onActivity$2$ActivityScenario(ActivityScenario.java:661)
	at androidx.test.core.app.ActivityScenario$$Lambda$4.run(ActivityScenario.java:653)
	at androidx.test.core.app.ActivityScenario.onActivity(ActivityScenario.java:671)
	at com.example.espressobugsample.MainActivityTest.testTextView(MainActivityTest.kt:18)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:59)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:56)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
	at org.robolectric.RobolectricTestRunner$HelperTestRunner$1.evaluate(RobolectricTestRunner.java:591)
	at org.robolectric.internal.SandboxTestRunner$2.lambda$evaluate$0(SandboxTestRunner.java:274)
	at org.robolectric.internal.bytecode.Sandbox.lambda$runOnMainThread$0(Sandbox.java:88)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:834)
Caused by: junit.framework.AssertionFailedError: 'not (view has effective visibility <VISIBLE> and view.getGlobalVisibleRect() to return non-empty rectangle)' doesn't match the selected view.
Expected: not (view has effective visibility <VISIBLE> and view.getGlobalVisibleRect() to return non-empty rectangle)
     Got: was <com.google.android.material.textview.MaterialTextView{4491ab02 V.ED..... ......ID 154,187-166,228 #7f0801b2 app:id/text_view}>
View Details: MaterialTextView{id=2131231154, res-name=text_view, visibility=VISIBLE, width=12, height=41, has-focus=false, has-focusable=false, has-window-focus=true, is-clickable=false, is-enabled=true, is-focused=false, is-focusable=false, is-layout-requested=false, is-selected=false, layout-params=androidx.constraintlayout.widget.ConstraintLayout$LayoutParams@19b927d9, tag=null, root-is-layout-requested=false, has-input-connection=false, x=154.0, y=187.0, text=Hello World!, input-type=0, ime-target=false, has-links=false}

	at androidx.test.espresso.matcher.ViewMatchers.assertThat(ViewMatchers.java:16)
	at androidx.test.espresso.assertion.ViewAssertions$MatchesViewAssertion.check(ViewAssertions.java:7)
	at androidx.test.espresso.ViewInteraction$SingleExecutionViewAssertion.check(ViewInteraction.java:2)
	at androidx.test.espresso.ViewInteraction$2.call(ViewInteraction.java:10)
	at androidx.test.espresso.ViewInteraction$2.call(ViewInteraction.java:1)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at android.os.Handler.$$robo$$android_os_Handler$handleCallback(Handler.java:938)
	at android.os.Handler.handleCallback(Handler.java)
	at android.os.Handler.$$robo$$android_os_Handler$dispatchMessage(Handler.java:99)
	at android.os.Handler.dispatchMessage(Handler.java)
	at org.robolectric.shadows.ShadowPausedLooper$IdlingRunnable.run(ShadowPausedLooper.java:332)
	at org.robolectric.shadows.ShadowPausedLooper.executeOnLooper(ShadowPausedLooper.java:366)
	at org.robolectric.shadows.ShadowPausedLooper.idle(ShadowPausedLooper.java:92)
	at org.robolectric.android.internal.LocalControlledLooper.drainMainThreadUntilIdle(LocalControlledLooper.java:17)
	at androidx.test.espresso.ViewInteraction.waitForAndHandleInteractionResults(ViewInteraction.java:1)
	... 22 more
```

