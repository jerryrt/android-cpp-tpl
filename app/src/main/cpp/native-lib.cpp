#include <jni.h>
#include <string>

extern "C" {
    #include "util.h"
}
extern "C" JNIEXPORT jstring JNICALL
Java_com_example_cpp_1android_1tpl_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

extern "C" JNIEXPORT jint JNICALL
Java_com_example_cpp_1android_1tpl_MainActivity_intFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    return 1024;
}

extern "C" JNIEXPORT jint JNICALL
Java_com_example_cpp_1android_1tpl_MainActivity_helloCFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    hello_c();
    return 0;
}