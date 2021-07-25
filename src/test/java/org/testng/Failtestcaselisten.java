package org.testng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;

public class Failtestcaselisten implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class arg1, Constructor arg2, Method arg3) {
		
		IRetryAnalyzer retryAnalyzer = annotation.getRetryAnalyzer();
		if(retryAnalyzer==null) {
			annotation.setRetryAnalyzer(Failtestcaserun.class);
		}
	}

}
