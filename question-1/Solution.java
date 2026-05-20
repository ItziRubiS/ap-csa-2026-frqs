public Account(String requestedName){
  String newUser= requestedName;
  int num=1;
  while(!isAvailable(newUser)){
   newUser=requestedName+num;
    num++;
  }
  return newUser;
}
