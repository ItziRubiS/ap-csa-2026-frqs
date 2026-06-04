public Account(String requestedName){
  String newUser= requestedName;
  int num=1;
  while(!isAvailable(newUser)){
   newUser=requestedName+num;
    num++;
  }
  return newUser;
}

public String getShortenedName(){
  String newUser= newUser;
    while (newUser.indexOf("-")!=-1{
        int loc= newUser.indexOf("-");
       newUser = newUser.substring(0, loc - 1) + newUser.substring(loc + 1);
    }
  return newUser;
  }

