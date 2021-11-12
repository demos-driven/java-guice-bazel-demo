load("@rules_java//java:defs.bzl", "java_binary", "java_library", "java_test")

package(default_visibility = ["//visibility:public"])

java_binary(
    name = "java-guice",
    main_class = "com.example.myproject.Application",
    runtime_deps = [":java-guice-lib"],
)

java_library(
    name = "java-guice-lib",
    srcs = glob([
        "src/main/java/com/example/myproject/**/*.java",
    ]),
    deps = [
        "@maven//:com_google_inject_guice",
        "@maven//:org_apache_commons_commons_lang3",
    ],
)

java_test(
    name = "tests",
    srcs = glob(["src/test/java/com/example/myproject/*.java"]),
    deps = [
        "@maven//:junit_junit",
    ],
)