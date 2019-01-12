using System;
using System.Threading;
using System.Diagnostics;

public sealed class Line9
{
    static void PrintEllipsis(string msg, int millis=300)
    {
        Console.Write(msg);
        Console.Out.Flush();
        for(int i = 0; i < 3; i ++)
        {
            Console.Write('.');
            Console.Out.Flush();
            Thread.Sleep(millis);
        }
        Console.Write('\n');
        Console.Out.Flush();
    }

    public static void Main(string[] args)
    {
        PrintEllipsis("As he was running away");
        PrintEllipsis("...he found himself stuck in a virtual machine");

        Process p1 = new Process();
        p1.StartInfo.FileName = "javac";
        p1.StartInfo.Arguments = "Line9.java";
        p1.Start();
        p1.WaitForExit();

        Process p2 = new Process();
        p2.StartInfo.FileName = "java";
        p2.StartInfo.Arguments = "Line9";
        p2.StartInfo.UseShellExecute = false;
        //p2.StartInfo.RedirectStandardOutput = true;
        p2.Start();
        p2.WaitForExit();
    }
}
