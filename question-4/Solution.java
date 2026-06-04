public int getPointsForRow(int targetRow)
{ 
 int sum=0;
   for (int col = 0; col < board[targetRow].length; col++)
    {
        sum += board[targetRow][col].getPoints();
    }

    return 2 * sum;
  }
