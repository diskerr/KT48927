# KT-48927 (fixed in Kotlin 1.6.20)
JVM IR: "VerifyError: Bad invokespecial instruction: current class isn't assignable to reference class" when up-casting and read a base class's private property that has a custom getter in the base class's public function

Details: https://youtrack.jetbrains.com/issue/KT-48927
