package problem24;

public class Permutation {

	private void permutation(int[] arr, int depth, int n, int k){
		if (depth == k) { // 한번 depth 가 k로 도달하면 사이클이 돌았음. 출력함.
			print(arr); return; } for (int i = depth; i < n; i++) { swap(arr, i, depth); perm(arr, depth + 1, n, k); swap(arr, i, depth); }
		}


	}

	private void permutation(int n) {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Permutation permutation = new Permutation();
		
		System.out.println(permutation.permutation(10););

	}

}
