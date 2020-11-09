import java.util.Hashtable;
import java.util.ArrayList;
class Main {
public static String morseTranslatorWord(String s){
 String res="";
 Hashtable <String,String> letterToMorse=new Hashtable<String,String>();
 letterToMorse.put("A","●-");               
 letterToMorse.put("N","-●");
 letterToMorse.put("B","-●●●"); 
 letterToMorse.put("O","---");
 letterToMorse.put("C","-●-●"); 
 letterToMorse.put("P","●--●");
 letterToMorse.put("D","-●●");              
 letterToMorse.put("Q","--●-");
 letterToMorse.put("E","●");              
 letterToMorse.put("R","●-●");
 letterToMorse.put("F","●●-●");          
 letterToMorse.put("S","●●●");
 letterToMorse.put("G","--●");
 letterToMorse.put("T","-");
 letterToMorse.put("H","●●●●");            
 letterToMorse.put("U","●●▬");
 letterToMorse.put("I","●●");                 
 letterToMorse.put("V","●●●▬");
 letterToMorse.put("J","●---");      
 letterToMorse.put("W","●--");
 letterToMorse.put("K","-●-");          
 letterToMorse.put("X","-●●-");
 letterToMorse.put("L","●-●●");          
 letterToMorse.put("Y","-●--");
 letterToMorse.put("M","--");            
 letterToMorse.put("Z","--●●");
 letterToMorse.put("1","●----");  
 letterToMorse.put("6","-●●●●");
 letterToMorse.put("2","●●---");
 letterToMorse.put("7","--●●●");
 letterToMorse.put("3","●●●--");
 letterToMorse.put("8","---●●");
 letterToMorse.put("4","●●●●▬");    
 letterToMorse.put("9","----●");
 letterToMorse.put("5","●●●●●");  
 letterToMorse.put("0","-----");

 for(int i=0;i<s.length();i++){
    if(!s.substring(i,i+1).equals(" ") &&        letterToMorse.containsKey(s.substring(i,i+1))){
      res+=letterToMorse.get(s.substring(i,i+1))+" ";
    }
    else
    res+="/ ";
 }
 
 return res; 
}
public static String morseTranslatorMorse(String s){
 String res="";
 Hashtable <String,String> letterToMorse=new Hashtable<String,String>();
 String sCopy=s;
 ArrayList<String>listOfSubstrings=new ArrayList<String>();
 int indexOfStart=0;
 int indexOfBlank=0;
 for(int j=0;j<sCopy.length();j++){
if(sCopy.substring(j,j+1).equals(" ")){
if(!sCopy.substring(j,j+1).equals("/")){
  indexOfBlank=j;
  listOfSubstrings.add(sCopy.substring(indexOfStart,indexOfBlank));
  indexOfStart=j+1;
  j+=1;
}
}
else if(j==sCopy.length()-1){
listOfSubstrings.add(sCopy.substring(indexOfStart));
}
 }
  letterToMorse.put("/"," "); 
  letterToMorse.put("●-","A");               
  letterToMorse.put("-●","N");
  letterToMorse.put("-●●●","B"); 
  letterToMorse.put("---","O");
  letterToMorse.put("-●-●","C"); 
  letterToMorse.put("●--●","P");
  letterToMorse.put("-●●","D");              
  letterToMorse.put("--●-","Q");
  letterToMorse.put("●","E");              
  letterToMorse.put("●-●","R");
  letterToMorse.put("●●-●","F");          
  letterToMorse.put("●●●","S");
  letterToMorse.put("--●","G");
  letterToMorse.put("-","T");
  letterToMorse.put("●●●●","H");            
  letterToMorse.put("●●-","U"); 
  letterToMorse.put("●●","I");                 
  letterToMorse.put("●●●-","V");
  letterToMorse.put("●---","J");      
  letterToMorse.put("●--","W");
  letterToMorse.put("-●-","K");          
  letterToMorse.put("-●●-","X");
  letterToMorse.put("●-●●","L");          
  letterToMorse.put("-●--","Y");
  letterToMorse.put("--","M");            
  letterToMorse.put("--●●","Z");
  letterToMorse.put("●----","1");  
  letterToMorse.put("-●●●●","6");
  letterToMorse.put("●●---","2");
  letterToMorse.put("--●●●","7");
  letterToMorse.put("●●●--","3");
  letterToMorse.put("---●●","8");
  letterToMorse.put("●●●●-","4");    
  letterToMorse.put("----●","9");
  letterToMorse.put("●●●●●","5");  
  letterToMorse.put("-----","0");

  for( int k=0;k<listOfSubstrings.size();k++){
    res+=letterToMorse.get(listOfSubstrings.get(k));
  }
 
  for( int i=0;i<s.length();i++){
    if(s.substring(i,i+1).equals("/"))
      res+=" ";
 }

 return res; 
}

    public static void main(String[] args) {
      
  System.out.println(morseTranslatorWord("HELLO WORLD"));
  System.out.println(morseTranslatorMorse("- ●●●● ●● ●●● / ●● ●●● / -●-● --- --- ●-●●"));
    }
}  