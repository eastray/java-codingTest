package insertComma;

public class InsertComma {

	public String insertComma(String n) {

		StringBuilder sb = new StringBuilder(n).reverse();

		int i = 3;

		if (sb.indexOf(".") != -1) {
			if (sb.indexOf(".") + i > sb.substring(sb.indexOf("."), sb.length()).length())
				return sb.reverse().toString();

			i += sb.indexOf(".") + 1;
		}

		else if (n.startsWith("-"))
			i--;

		while (true) {

			sb = sb.insert(i, ",");

			if (i + 4 >= sb.length())
				break;

			i += 4;
		}

		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InsertComma ic = new InsertComma();

		System.out.println(ic.insertComma("1000"));
		System.out.println(ic.insertComma("100000"));
		System.out.println(ic.insertComma("1000000"));
		System.out.println(ic.insertComma("10000000"));
		System.out.println(ic.insertComma("100000000"));
		System.out.println(ic.insertComma("1000000000"));
		System.out.println(ic.insertComma("32452.4"));
		System.out.println(ic.insertComma("3245.24"));
		System.out.println(ic.insertComma("324.524"));
		System.out.println(ic.insertComma("32.4524"));
		System.out.println(ic.insertComma("3.24524"));
		System.out.println(ic.insertComma("-3.24524"));
		System.out.println(ic.insertComma("-32.4524"));
		System.out.println(ic.insertComma("-324.524"));
		System.out.println(ic.insertComma("-3245.24"));
		System.out.println(ic.insertComma("-32452.4"));

	}

}