
import com.intuit.karate.junit5.Karate;

public class TestRunner {

//	@Test
//	void testParallel() {
//		Results results = Runner.path("classpath:airlines/features/Airlines_Get.feature").parallel(5);
//		Assertions.assertEquals(0, results.getFailCount(), results.getErrorMessages());
//
//	}
	
	@Karate.Test
	Karate testTags(){
		return Karate.run("classpath:./Apis").tags("@execute").relativeTo(getClass());
	}
}