class Untitled {
	public static void main(String[] args) {
		char[][] board={{'x','o','x'},{'o','o','o'},{'o','o','x'}};
		System.out.println(isWin(board));
	}
	public static boolean isWin(char[][] board){
		boolean win=true;
		int m=board.length;
		int n=board[0].length;
		for(int i=0;i<m-1;i++){//check colum first
		    win=true;
			for(int j=0;j<n-1;j++){
				if(board[i][j]!=board[i][j+1]){
					win=false;
					break;
				}
			}
			if(win)  return true;
		}
		for(int i=0;i<n-1;i++){//check row second
			win=true;
			for(int j=0;j<m-1;j++){
				if(board[i][j]!=board[i][j+1]){
					win=false;
					break;
				}
			}
			if(win)  return true;
		}
		win=true;
		for(int i=0;i<n-1;i++){//check diagnal
			if(board[i][i]!=board[i+1][i+1]){
				win=false;
				break;
			}
		}
		if(win) return true;
		win=true;
		for(int i=n-1;i>0;i--){
			if(board[i][i]!=board[i-1][i-1]){
				win=false;
				break;
			}
		}
		return win;
	}
}