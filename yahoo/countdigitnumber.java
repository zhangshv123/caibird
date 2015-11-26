all numbers in +ve ints random, no duplicates.

turn: we pick one card, read value , suppose it's x, we delete x, x+1 and x-1 from the cards array if they exist.
repeat turns till no card is left.
1 1 1  1 1
5,6,9,12,13
1->3,4->5->7
O(n)->N*O(N)
//greedy algorithm, x
//brute force:iteration.->x that has no neighbor
SCAN

//greedy algorithm
int maxTurns(int[] cards) {
	Arrays.sort(cards);
	int n=cards.length;
	//record which has been deleted
	boolean[] bt = new boolean[n];
	Arrays.fill(bt,true);
	int counter=0;
	int maxTurn =0;
	while(counter<n){
		maxTurn++;
		//scan from left to right to find the best choice for this turn.
		int minTimes=0;
		int minIndex = 0;
		//if the left one is the best case
		if(cards[0]+1!=cards[1]){
			bt[minIndex]=false;
			counter++;
		}
		for(int i=1;i<n-1;i++){
			if(!bt[i]){
				continue;
			}
			int times=0;
			//compare left
			if(bt[i-1]&&cards[i-1]+1==cards[i]){
				times++;
			}
			//compare right
			if(bt[i+1]&&cards[i+1]-1==cards[i]){
				times++;
			}
			if(times<minTimes){
				minTimes=times;
				minIndex=i;
			} 
		}
		//consider the last element later
		if(cards[minIndex-1]+1==cards[minIndex]){
		   cards[minIndex-1]=false;
		   counter++; 
		}
		bt[minIndex]=false;
		counter++;
		if(cards[minIndex+1]+1==cards[minIndex]){
		   cards[minIndex+1]=false;
		   counter++; 
		}
	 }
	return maxTurn;
}

75: 2 digits 5,7
120: 3 digits 1,2,0


n=120, 1,2,0
98: 2 digits
lower= 1 upper = 2

lower =1000, upper = 2000 upper limit->9
// Count nos from 1...n, in which numbers of digits are between [lower, upper]
int count(int n, int lower, int upper){
	//validation  
	if(n<0 || lower>upper || lower<0 || upper>9){
		if(upper>9){
			System.out.println("invalid input, integer can only be 0-2^32");
		}
		return 0;
	}
	//count the length of the digits of n
	int length=0;
	while(n>0){
		n/=10;
		length++;
	}
	//length,upper,lower
	if(length<lower){
		return 0;
	}else if(length<=upper){//n=299 lower=2,upper=3 10-299 
		return n-(Math.pow(10,lower-1)-1);
	}else{//length>upper n=1m,lower=2,upper=3 10-99
		return (Math.pow(10,upper)-1)-(Math.pow(10,lower-1)-1);
	}
}
