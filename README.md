# Room_Ksp_BuildConfig_problem
Sample project for recreating ksp bug when setting @Database version to BuildConfig.VERSION_CODE


The problem is related to https://issuetracker.google.com/issues/220312583?pli=1
However i made new issue to push it by myself.

See class `com.example.room_ksp_problem.MyDatabase` where version is set to BuildConfig.VERSION_CODE


```

[ksp] java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "java.lang.reflect.InvocationHandler.invoke(Object, java.lang.reflect.Method, Object[])" is null
	at jdk.proxy21/jdk.proxy21.$Proxy62.version(Unknown Source)
	at androidx.room.processor.DatabaseProcessor.doProcess(DatabaseProcessor.kt:129)
	at androidx.room.processor.DatabaseProcessor.process(DatabaseProcessor.kt:62)
	at androidx.room.DatabaseProcessingStep$process$databases$1$1.invoke(DatabaseProcessingStep.kt:67)
	at androidx.room.DatabaseProcessingStep$process$databases$1$1.invoke(DatabaseProcessingStep.kt:63)
	at androidx.room.processor.Context.collectLogs(Context.kt:167)
	at androidx.room.DatabaseProcessingStep.process(DatabaseProcessingStep.kt:63)
	at androidx.room.compiler.processing.CommonProcessorDelegate.processRound(XBasicAnnotationProcessor.kt:123)
	at androidx.room.compiler.processing.ksp.KspBasicAnnotationProcessor.process(KspBasicAnnotationProcessor.kt:63)
	at com.google.devtools.ksp.AbstractKotlinSymbolProcessingExtension$doAnalysis$6$1.invoke(KotlinSymbolProcessingExtension.kt:291)
	at com.google.devtools.ksp.AbstractKotlinSymbolProcessingExtension$doAnalysis$6$1.invoke(KotlinSymbolProcessingExtension.kt:289)
	at com.google.devtools.ksp.AbstractKotlinSymbolProcessingExtension.handleException(KotlinSymbolProcessingExtension.kt:394)
	at com.google.devtools.ksp.AbstractKotlinSymbolProcessingExtension.doAnalysis(KotlinSymbolProcessingExtension.kt:289)
	at org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration(TopDownAnalyzerFacadeForJVM.kt:123)
	at org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration$default(TopDownAnalyzerFacadeForJVM.kt:99)
	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler$analyze$1.invoke(KotlinToJVMBytecodeCompiler.kt:257)
	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler$analyze$1.invoke(KotlinToJVMBytecodeCompiler.kt:42)
	at org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport.analyzeAndReport(AnalyzerWithCompilerReport.kt:115)
	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze(KotlinToJVMBytecodeCompiler.kt:248)
	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules$cli(KotlinToJVMBytecodeCompiler.kt:88)
	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules$cli$default(KotlinToJVMBytecodeCompiler.kt:47)
	at org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute(K2JVMCompiler.kt:168)
	at org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute(K2JVMCompiler.kt:53)
	at org.jetbrains.kotlin.cli.common.CLICompiler.execImpl(CLICompiler.kt:100)
	at org.jetbrains.kotlin.cli.common.CLICompiler.execImpl(CLICompiler.kt:46)
	at org.jetbrains.kotlin.cli.common.CLITool.exec(CLITool.kt:101)
```
