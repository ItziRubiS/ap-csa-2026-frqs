public int moreHistoryThanMathAbsences()
{ 
  int count = 0;

    for (CourseRecord history : historyList)
    {
        for (CourseRecord math : mathList)
        {
            if (history.getStudentID().equals(math.getStudentID()))
            {
                if (history.getAbsences() > math.getAbsences())
                {
                    count++;
                }
            }
        }
    }

}
