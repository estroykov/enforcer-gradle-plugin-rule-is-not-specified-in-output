Run `./gradlew build`.

Output is:

```
> ./gradlew build

FAILURE: Build failed with an exception.

* What went wrong:
A problem occurred configuring root project 'enforcer-gradle-plugin-rule-is-not-specified-in-output'.
> [AFTER_PROJECT :] An Enforcer rule has failed

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.
> Get more help at https://help.gradle.org.

BUILD FAILED in 586ms
```
There is no rule name or even custom message I have provided in `build.gradle.kts`.
