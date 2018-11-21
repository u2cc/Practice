package com.personal.practice.scripting;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import javax.script.Bindings;
import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.mvel2.MVEL;

public class PerformanceEvaluation {
	
	public static void main(String[] args) throws IOException, ScriptException {
		String script = new String(Files.readAllBytes(Paths.get("//Users//cc03091//git//Practice//src/main//java//com//personal//practice//scripting//Script.js")));
		System.out.println(script);
		Map<String, Object> bindings = new HashMap<String, Object>();
		String name = "batman";
		bindings.put("name", name);
		Serializable compiledExpressoin = MVEL.compileExpression(script);
		long startTime = System.nanoTime();
		String result = (String) MVEL.executeExpression(compiledExpressoin, bindings);
		long endTime = System.nanoTime()-startTime;
		System.out.printf("Result: %s. Finished in %d.%n", result, endTime);
		
		 ScriptEngineManager factory = new ScriptEngineManager();
		 ScriptEngine engine = factory.getEngineByName("JavaScript");
		 Bindings scriptBinding = engine.createBindings();
		 scriptBinding.put("name", name);
		 CompiledScript compiled = ((Compilable) engine).compile(script);
		 long scriptStartTime = System.nanoTime();
		 String scriptResult = (String) compiled.eval(scriptBinding);
		 long scriptEndTime = System.nanoTime()-scriptStartTime;
		 System.out.printf("Result: %s. Finished in %d.%n", scriptResult,scriptEndTime);
	}

}
