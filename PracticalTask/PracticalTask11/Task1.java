import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task1 {
	public static void main(String[] args) {
		Random rand = new Random();
		rand.ints(1, 100).limit(10).forEach(System.out::println);
		System.out.println();
		rand.ints(1, 100).limit(10).sorted().forEach(System.out::println);
		System.out.println();
		List<Integer> numbers = new ArrayList();
		numbers = rand.ints(1, 100).limit(10).boxed().collect(Collectors.toList());
		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println(stats.getMax());
		LocalDateTime time = LocalDateTime.now();
		System.out.println(time);
		System.out.println();
		LocalDateTime firstMon = LocalDateTime.of(2018, 11,13,12,01);
		LocalDateTime d = firstMon.with((TemporalAdjusters.next(DayOfWeek.MONDAY)));
		System.out.println(d);
		List<String> list = Arrays.asList("Banana","apple","Monica","Strawberry");
		System.out.println(list.stream().map(x -> x.toLowerCase()).sorted().collect(Collectors.toList()));
		
	}
}
