package synapProgram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

//김씨와 이씨는 각각 몇 명 인가요?
//"이재영"이란 이름이 몇 번 반복되나요?
//중복을 제거한 이름을 출력하세요.
//중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.

public class SynapProgram {

	public int getPeopleByLastName(String[] strArray, String n) {
		int result = 0;

		for (String ele : strArray)
			if (ele.startsWith(n))
				result++;

		return result;
	}

	public int getPeopleByLastName2(String[] strArray, String n) {

		return (int) Arrays.asList(strArray).stream().filter(m -> m.contains(n)).count();

	}

	public int getPeopleByFullName(String[] strArray, String n) {
		int result = 0;

		for (String ele : strArray)
			if (ele.contains(n))
				result++;

		return result;
	}

	public int getPeopleByFullName2(String[] strArray, String n) {

		return (int) Arrays.asList(strArray).stream().filter(m -> m.equals(n)).count();
	}

	public String[] getNameWithoutDuplicated(String[] strArray) {
		HashSet<String> set = new HashSet<String>(Arrays.asList(strArray));

		return set.toArray(new String[set.size()]);
	}

	public String[] getNameWithoutDuplicated2(String[] strArray) {
		List<String> list = Arrays.asList(strArray).stream().distinct().collect(Collectors.toList());

		return list.toArray(new String[list.size()]);
	}

	public String[] sortedNameArrayOfWithoutDuplicated(String[] strArray) {
		String[] str = getNameWithoutDuplicated(strArray);

		Arrays.sort(str);

		return str;
	}

	public String[] sortedNameArrayOfWithoutDuplicated2(String[] strArray) {
		List<String> list = Arrays.asList(getNameWithoutDuplicated2(strArray)).stream().sorted()
				.collect(Collectors.toList());

		return list.toArray(new String[list.size()]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = { "이유덕", "이재영", "권종표", "이재영", "박민호", "강상희", "이재영", "김지완", "최승혁", "이성연", "박영서", "박민호", "전경헌",
				"송정환", "김재성", "이유덕", "전경헌" };

		SynapProgram sp = new SynapProgram();

		System.out.println("김씨와 이씨는 각각 몇 명 인가요? 김: " + sp.getPeopleByLastName(strArray, "김") + ", 이: "
				+ sp.getPeopleByLastName(strArray, "이"));
		System.out.println("김씨와 이씨는 각각 몇 명 인가요? 김: " + sp.getPeopleByLastName2(strArray, "김") + ", 이: "
				+ sp.getPeopleByLastName2(strArray, "이"));
		System.out.println();

		System.out.println("'이재영'이란 이름이 몇 번 반복되나요? " + sp.getPeopleByFullName(strArray, "이재영"));
		System.out.println("'이재영'이란 이름이 몇 번 반복되나요? " + sp.getPeopleByFullName2(strArray, "이재영"));
		System.out.println();

		System.out.println("중복을 제거한 이름을 출력하세요. " + Arrays.toString(sp.getNameWithoutDuplicated(strArray)));
		System.out.println("중복을 제거한 이름을 출력하세요. " + Arrays.toString(sp.getNameWithoutDuplicated2(strArray)));
		System.out.println();

		System.out.println(
				"중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요. " + Arrays.toString(sp.sortedNameArrayOfWithoutDuplicated(strArray)));
		System.out.println(
				"중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요. " + Arrays.toString(sp.sortedNameArrayOfWithoutDuplicated2(strArray)));
	}

}