import java.io.IOException;

class ShutDown{
public static void main(String args[]) throws IOException{

Runtime runtime =Runtime.getRuntime();
int numberOfSeconds	=	10;
Process proc = runtime.exec("shutdown -h -t "+ numberOfSeconds);
System.exit(0);
}
}
