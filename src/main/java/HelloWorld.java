import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class HelloWorld implements SparkApplication {
	public static void main(String[] args) {
		new Kalpana HelloWorld().init();
	}

	@Override
	public void init() {
		get("/hello", (req, res) -> "Hello World");
	}
}
