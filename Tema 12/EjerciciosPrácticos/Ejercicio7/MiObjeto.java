import java.io.*;

public class MiObjeto extends ObjectOutputStream  {
 
    protected void writeStreamHeader() throws IOException
    {

    }
 
    //Constructores
    public MiObjeto () throws IOException{
        super();
    }
    public MiObjeto(OutputStream out) throws IOException
    {
        super(out);
    }
}