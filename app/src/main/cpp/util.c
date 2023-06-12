//
// Created by jerry on 6/12/23.
//

#include "util.h"
#include <android/log.h>

void hello_c() {
    __android_log_print(ANDROID_LOG_DEBUG, "hello_c", "hello_c");
}