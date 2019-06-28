/* Given N bags, each bag contains A[i] chocolates. There is a kid and a magician. In one unit of time, kid chooses a random bag i, eats Ai chocolates, then the magician fills the ith bag with floor(Ai/2) chocolates.

Given Ai for 1 <= i <= N, find the maximum number of chocolates kid can eat in K units of time.

e.g. K = 3, N = 2, A = 6 5. Return: 14 */

public class Magician{
	public int choice(int A, ArrayList<Integer> B){
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		for(int i = 0; i < B.size(); i++){
			pq.add(B.get(i)); //Add all elements in pq
		}

		long res = 0;

		for(int i = 0; i < A; i++){
			int temp = pq.poll(); //remove front element and put into temp
			res = (res+temp)%1000000007; // add to result
			pq.add(temp/2); //update pq with temp/2 
		}

		return (int)res%1000000007 //Mod in case the answer is too big 
	}
}