import java.util.*;
class sort
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b[]=new int[a];
ArrayList al=new ArrayList();
StringBuffer sb=new StringBuffer();
StringBuffer sh=new StringBuffer();
for(int i=0;i<a;i++)
{

b[i]=sc.nextInt();
while(b[i]!=0)
{

al.add(b[i]%10);
b[i]=b[i]/10;

}
}
int c[]=new int[al.size()];
for(int kk=0;kk<al.size();kk++)
{
c[kk]=(int)al.get(kk);
}

Arrays.sort(c);
for(int j=c.length-1;j>0;j--)
{
String h=new String(String.valueOf(c[j]));
sb.append(h);
}
int count=0;
String r=sb.toString();
for(int k=sb.length()-1;k>0;k--)
{
count++;
if(count%3==0)
{
String jj=new String(r.substring(0,k));
String kk=new String(r.substring(k));
sh.append(jj+","+kk);
r=new String(sh.toString());
sh.delete(0,sh.length());
}
}
System.out.println(r);
}
}
