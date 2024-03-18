// See https://aka.ms/new-console-template for more information

namespace AreaCirculo
{
    class Program
    {
        static void Main(string[] args)
        {
            double area;
            int radio = 5;
            const double pi = 3.1416;

            area = pi * radio * radio;

            Console.WriteLine(area);
            Console.ReadKey();
        }
    }
}